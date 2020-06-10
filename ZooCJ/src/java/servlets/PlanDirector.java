/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import prototype.abstractEntities.*;
import prototype.client.*;
import prototype.concreteEntities.*;

/**
 *
 * @author jackl
 */
public class PlanDirector extends HttpServlet {
    private static Ticket info;

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
        processRequest(request, response);
        Assignator selection = new Assignator();
        
        try (PrintWriter out = response.getWriter()) {
            
            info=selection.assignation(Integer.parseInt(request.getParameter("selection_plan")));
            info.setInTime(request.getParameter("time_in"));
            info.setOutTime(request.getParameter("time_out"));
            info.setVisiterAmmount(request.getParameter("visiter_ammount"));
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PlanDirector</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Plan: " + info.getPlanName() + "</p>");
            out.println("<p>Benefits: " + info.getBenefits() + "</p>");
            out.println("<p>Arrival Time: " + info.getInTime() + "</p>");
            out.println("<p>Exit Time: " + info.getOutTime() + "</p>");
            out.println("<p>Visiters: " + info.getVisiterAmmount() + "</p>");
            out.println("<p>Price: " + info.getPrice() + "</p>");
            out.println("<form action=\"SavePlan\" method=\"get\" id=\"form2\" enctype=\"multipart/form-data\">"
                        +"<button>Submit</button>"
                        +"</form>");
            out.println("</body>");
            out.println("</html>");
            
            
          
        }
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        Assignator selection = new Assignator();
        
        try (PrintWriter out = response.getWriter()) {
            
            
            
            
            info=selection.assignation(Integer.parseInt(request.getParameter("selection_plan")));
            info.setInTime(request.getParameter("time_in"));
            info.setOutTime(request.getParameter("time_out"));
            info.setVisiterAmmount(request.getParameter("visiter_ammount"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PlanDirector</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Plan: " + info.getPlanName() + "</p>");
            out.println("<p>Benefits: " + info.getBenefits() + "</p>");
            out.println("<p>Arrival Time: " + info.getInTime() + "</p>");
            out.println("<p>Exit Time: " + info.getOutTime() + "</p>");
            out.println("<p>Visiters: " + info.getVisiterAmmount() + "</p>");
            out.println("<p>Price: " + info.getPrice() + "</p>");
            out.println("<form action=\"SavePlan\" method=\"get\" id=\"form2\" enctype=\"multipart/form-data\">"
                        +"<button>Editar</button>"
                        +"<a href=\"success.jsp\">Confirmar</a>"
                        +"</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    public static Ticket getTicket(){
        return info;
    }


}
