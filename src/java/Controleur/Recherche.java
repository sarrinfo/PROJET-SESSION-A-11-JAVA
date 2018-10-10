/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import DAO.BienImmobilierDAO;
import DAO.VisiteDAO;
import Modele.Bienimmobilier;
import Modele.Visite;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SARRINFO
 */
public class Recherche extends HttpServlet {
        public static String VUE = "/Error.jsp";

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

        //on récupère la session de la requête
        HttpSession session = request.getSession();
        if (session == null) {
            response.sendRedirect(VUE);
        }

        String action = request.getParameter("action");
        boolean rechercherapide = false;
        if (action.equals("rechercherAppartement")) {
            
            VUE = "/WEB-INF/displayDetailsBienALouer.jsp";
            String id1 = request.getParameter("id1");
            int id2 = parseInt(request.getParameter("id2"));
            List<Bienimmobilier> listDetail = BienImmobilierDAO.simpleBienimmobilier(id1,id2);
            session.setAttribute("listDetail", listDetail);
    
        } if (action.equals("rechercheMaison")) {
            VUE = "/WEB-INF/displayDetailsBienAVendre.jsp";

        }  if (action.equals("visite")) {
            
            VUE = "/WEB-INF/displayListRDV.jsp";
            
            int idBien = parseInt(request.getParameter("bien"));
            List<Visite> listRDV = VisiteDAO.simpleVisite(idBien);
            session.setAttribute("listRDV", listRDV);
        } 
        if(rechercherapide==false){
            ServletContext sc = getServletContext();
            RequestDispatcher rd = sc.getRequestDispatcher(VUE);
            rd.forward(request, response);
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
