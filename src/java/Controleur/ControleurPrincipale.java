/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;


import DAO.AnnonceDAO;
import DAO.BienImmobilierDAO;
import DAO.HibernateUtil;
import DAO.ImmeubleDAO;
import Modele.Annonce;
import Modele.Bienimmobilier;
import Modele.Immeuble;
import java.io.IOException;

import java.util.List;
import java.util.Locale;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class ControleurPrincipale extends HttpServlet {

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

        
        Locale localeReq = request.getLocale();
        
        //on récupère la session de la requête
        HttpSession session = request.getSession();
        session.setAttribute("langue", localeReq.getLanguage());

        if (session == null) {
            response.sendRedirect(VUE);
        }
        // Shopping shop = new Shopping();

        String action = request.getParameter("action");

        if (action.equals("acceuil")) {
            VUE = "/display.jsp";
    
        } else if (action.equals("appartement")) {
            VUE = "/WEB-INF/displayListALouer.jsp";
           // List<Bienimmobilier> listApp = BienImmobilierDAO.allBienImmobiliers();
            List<Annonce> listApp = AnnonceDAO.allAnnonces();
            session.setAttribute("listApp", listApp);
//            HibernateUtil.getSessionFactory().close();

        } else if (action.equals("maison")) {

            VUE = "/WEB-INF/displayListMaison.jsp";
            List<Immeuble> listImm = ImmeubleDAO.allImmeubles();
            session.setAttribute("listImm", listImm);
            //HibernateUtil.getSessionFactory().close();
        }
            ServletContext sc = getServletContext();
            RequestDispatcher rd = sc.getRequestDispatcher(VUE);
            rd.forward(request, response);
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
