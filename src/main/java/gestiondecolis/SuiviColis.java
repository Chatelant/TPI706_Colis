package gestiondecolis;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "suiviColis", value = "/suivi")
public class SuiviColis extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SuiviColis() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("/suivi.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}