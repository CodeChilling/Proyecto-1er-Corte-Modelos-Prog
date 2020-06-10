/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import builder.abstractEntities.Sector;
import builder.concreteEntities.*;
import builder.director.Director;
import builder.products.Zone;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jackl
 */
public class Instalations extends HttpServlet {
    Director guide = new Director();
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
        response.setContentType("text/html;charset=UTF-8");
        
        
        Sector east = new eastWing();
        guide.buildInfo(east);
        Zone area = east.getZone();
        //aqui van los datos de la zona este, usando metodos del objeto area
        Sector west = new westWing();
        guide.buildInfo(west);
        area = west.getZone();
        //aqui van los datos de la zona oeste, usando metodos del objeto area
        Sector north = new northWing();
        guide.buildInfo(north);
        area = north.getZone();
        //aqui van los datos de la zona norte, usando metodos del objeto area
        Sector south = new southWing();
        guide.buildInfo(south);
        area = south.getZone();
        //aqui van los datos de la zona norte, usando metodos del objeto area
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Instalations</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Instalations at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        Sector east = new eastWing();
        guide.buildInfo(east);
        Zone area = east.getZone();
        //aqui van los datos de la zona este, usando metodos del objeto area
        Sector west = new westWing();
        guide.buildInfo(west);
        area = west.getZone();
        //aqui van los datos de la zona oeste, usando metodos del objeto area
        Sector north = new northWing();
        guide.buildInfo(north);
        area = north.getZone();
        //aqui van los datos de la zona norte, usando metodos del objeto area
        Sector south = new southWing();
        guide.buildInfo(south);
        area = south.getZone();
        //aqui van los datos de la zona norte, usando metodos del objeto area
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Instalations</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Instalations at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
