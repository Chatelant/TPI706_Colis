package gestiondecolis;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "progression", value = "/progression")
public class ProgressionColis extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ProgressionColis() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        PrintWriter out = response.getWriter();
//        String nom = request.getParameter("name");
//        out.println("Hello " + nom + " !");

        request.getRequestDispatcher("/progression.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}