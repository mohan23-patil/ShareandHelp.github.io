package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DbConnection;
import model.Item;

@WebServlet("/ReceiverController")
public class ReceiverController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Item> items = new ArrayList<>();

        try (Connection connection = DbConnection.myconnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM donateditems")) {

            while (resultSet.next()) {
                Item item = new Item();
                item.setId(resultSet.getInt("id"));
                item.setItemName(resultSet.getString("item_name"));
                item.setItemDescription(resultSet.getString("item_description"));
                item.setItemImage(resultSet.getString("item_image"));
                items.add(item);
            }
        } catch (SQLException e) {
            throw new ServletException("Unable to retrieve donated items.", e);
        }

        request.setAttribute("items", items);
        request.getRequestDispatcher("Receiver.jsp").forward(request, response);
    }
}
