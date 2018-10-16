/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.GestionnaireVisite;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SARRINFO
 */
public class Visite extends HttpServlet {

    public static String URL = "/Error.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

     try{
        //on récupère la session de la requête
        HttpSession session = request.getSession();
        GestionnaireVisite ges = new GestionnaireVisite();
        if (session == null) {
            response.sendRedirect(request.getContextPath() + URL);
        }

        String action = request.getParameter("action");
        String dateVisite = request.getParameter("dateVisite");

        if (action.equals("Ajouter")) 
        {
            URL = "/WEB-INF/Restreint/displayListRDV.jsp";
            Date date = ges.formaterDate(dateVisite);
            ges.gererListVisite(date);
            session.setAttribute("ListVisite", ges.getListVisite());
        } 
        if(action.equals("supprimer"))
        {
            int index = Integer.parseInt(request.getParameter("index"));
            ges.supprimerVisite(index);
            URL = "/WEB-INF/Restreint/displayListRDV.jsp";
        }
        if(action.equals("terminer"))
        {
            URL = "/display.jsp";
        }
        RequestDispatcher disp = request.getServletContext().getRequestDispatcher(URL);
        disp.forward(request, response);
        
        }
        catch(Exception ex)
        {
            request.setAttribute("erreur", ex.getMessage());
            RequestDispatcher disp = request.getServletContext().getRequestDispatcher(URL);
            disp.forward(request, response);
        }

    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
