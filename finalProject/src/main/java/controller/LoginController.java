package controller;

import java.io.IOException;


import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.DonorDao;
import dao.Donorimpl;
import model.Register;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        DonorDao ddao = new Donorimpl();
        List<Register> lst = ddao.login(email);

        HttpSession session = request.getSession();
        if (!lst.isEmpty()) {
            Register r = lst.get(0);
            if (r.getEmail().equals(email) && r.getPass().equals(pass)) {
                session.setAttribute("user", r);
                response.sendRedirect("Dashboard.jsp");
            } else {
                session.setAttribute("Invalid", "Invalid Email or Password");
                response.sendRedirect("LoginView.jsp");
            }
        } else {
            session.setAttribute("Invalid", "User not found");
            response.sendRedirect("LoginView.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
