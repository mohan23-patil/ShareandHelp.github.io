package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Register;

public class Donorimpl implements DonorDao {

    @Override
    public int register(List<Register> lst) {
        int result = 0;
        try (Connection con = DbConnection.myconnection()) {
            if (con == null) {
                System.out.println("Database connection is null.");
                return result;
            }

            String sql = "INSERT INTO Donor (LAST_NAME, FIRST_NAME, EMAIL_ID, PASSWORD, MOB_NO) VALUES (?, ?, ?, ?, ?)";
            for (Register r : lst) {
                try (PreparedStatement pstate = con.prepareStatement(sql)) {
                    pstate.setString(1, r.getLname());
                    pstate.setString(2, r.getFname());
                    pstate.setString(3, r.getEmail());
                    pstate.setString(4, r.getPass());
                    pstate.setInt(5, r.getMobno());

                    int rowsAffected = pstate.executeUpdate();
                    result += rowsAffected;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Register> login(String email) {
        List<Register> lst = new ArrayList<>();
        try (Connection conn = DbConnection.myconnection()) {
            if (conn == null) {
                System.out.println("Database connection is null.");
                return lst;
            }
            
            String query = "SELECT * FROM Donor WHERE EMAIL_ID = ?";
            try (PreparedStatement pstate = conn.prepareStatement(query)) {
                pstate.setString(1, email);
                try (ResultSet r = pstate.executeQuery()) {
                    while (r.next()) {
                        Register rs = new Register(
                                r.getString("LAST_NAME"),
                                r.getString("FIRST_NAME"),
                                r.getString("EMAIL_ID"),
                                r.getString("PASSWORD"),
                                r.getInt("MOB_NO")
                        );
                        lst.add(rs);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lst;
    }
}
