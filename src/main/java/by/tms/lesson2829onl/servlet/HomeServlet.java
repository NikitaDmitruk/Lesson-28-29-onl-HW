package by.tms.lesson2829onl.servlet;

import by.tms.lesson2829onl.model.Operation;
import by.tms.lesson2829onl.service.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/")  // localhost:8080
public class HomeServlet extends HttpServlet {

    private final OperationService service = new OperationService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double num1 = Double.parseDouble(req.getParameter("num1"));
        Double num2 = Double.parseDouble(req.getParameter("num2"));
        String type = req.getParameter("type");
        Operation operation = new Operation(num1, num2, type);
        Double result = service.execute(operation).getResult();
        req.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/pages/home.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/home.jsp").forward(req, resp);
    }
}
