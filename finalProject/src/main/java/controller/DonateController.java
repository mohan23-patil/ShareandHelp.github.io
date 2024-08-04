package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import dao.DbConnection;

@WebServlet("/DonateController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
                 maxFileSize = 1024 * 1024 * 10,      // 10MB
                 maxRequestSize = 1024 * 1024 * 50)   // 50MB
public class DonateController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String itemName = request.getParameter("itemName");
        String itemDescription = request.getParameter("itemDescription");
        Part itemImage = request.getPart("itemImage");

        if (itemImage == null || itemImage.getSubmittedFileName().isEmpty()) {
            throw new ServletException("Item image is missing.");
        }

        String fileName = itemImage.getSubmittedFileName();
        String uploadPath = getServletContext().getRealPath("") + "uploads";
        String filePath = uploadPath + "/" + fileName;

        itemImage.write(filePath);

        try (Connection connection = DbConnection.myconnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO donateditems (item_name, item_description, item_image) VALUES (?, ?, ?)")) {
            preparedStatement.setString(1, itemName);
            preparedStatement.setString(2, itemDescription);
            preparedStatement.setString(3, fileName);
            preparedStatement.executeUpdate();
            response.getWriter().println("Donate item successfully.");
        } catch (SQLException e) {
            throw new ServletException("Unable to save donated item details.", e);
        }
    }
}
