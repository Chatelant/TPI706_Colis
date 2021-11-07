package gestiondecolis;
import gestiondecolis.jpa.Colis;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import fr.usmb.m2isc.mesure.ejb.MesureEJB;
//import fr.usmb.m2isc.mesure.jpa.Mesure;

@WebServlet(name = "enregistrement", value = "/enregistrement")
public class EnregistrementColis extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    private ColisEJB ejb;

    public EnregistrementColis() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/enregistrement.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String poids = request.getParameter("poids");
        String valeur = request.getParameter("valeur");
        String origine = request.getParameter("origine");
        String destination = request.getParameter("destination");

        PrintWriter out = response.getWriter();
        out.println(poids);
        out.println(valeur);
        out.println(origine);
        out.println(destination);

        Colis c = ejb.addColis(Double.parseDouble(poids), Double.parseDouble(valeur), origine, destination);
        out.println(c.getId());

    }
}