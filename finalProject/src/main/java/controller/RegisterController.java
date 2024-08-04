package controller;

import java.io.IOException;
import java.util.ArrayList;
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

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lname = request.getParameter("lname");
        String fname = request.getParameter("fname");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        int Mobno;

        try {
            Mobno = Integer.parseInt(request.getParameter("Mobno"));
        } catch (NumberFormatException e) {
            HttpSession session = request.getSession();
            session.setAttribute("message", "Invalid mobile number format.");
            response.sendRedirect("Register.jsp");
            return;
        }

        DonorDao ddao = new Donorimpl();
        Register r = new Register(lname, fname, email, pass, Mobno);
        List<Register> lst = new ArrayList<>();
        lst.add(r);
        int i = ddao.register(lst);

        HttpSession session = request.getSession();
        if (i > 0) {
            session.setAttribute("message", "Registered Successfully");
            response.sendRedirect("index.html");
        } else {
            session.setAttribute("message", "Customer not Registered");
            response.sendRedirect("Register.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
