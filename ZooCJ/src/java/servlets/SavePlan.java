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
import prototype.abstractEntities.Ticket;
import prototype.client.Client;
import singleton.Instance;

/**
 *
 * @author jackl
 */
public class SavePlan extends HttpServlet {
    

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
        
        
        
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        processRequest(request, response);
        Client client = new Client();
        
        try (PrintWriter out = response.getWriter()) {
            
            if(Instance.alreadyInstance()){   
                    /* TODO output your page here. You may use following sample code. */
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Plan</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<form action=\"PlanDirector\" method=\"get\" id=\"form\" enctype=\"multipart/form-data\">" + 
                                "<select name=\"selection_plan\" id=\"selection_plan\" placeholder=\"Select your favorite plan:\"required>"
                                +"<option id=\"op1\" value=\"3\">Silver</option>\n"
                                +"<option id=\"op2\" value=\"2\">Golden</option>\n" 
                                +"<option id=\"op3\" value=\"1\">Platinum</option> "
                                +"</select>"
                                +"<p type=\"Arrival time:\"><input name=\"time_in\" id=\"time_in\" placeholder=\"Arrival time\" required></input></p>"
                                +"<p type=\"Exit time:\"><input name=\"time_out\" id=\"time_out\" placeholder=\"Exit time\" required></input></p>"
                                +"<p type=\"Visiters ammount:\"><input name=\"visiter_ammount\" id=\"visiter_ammount\" placeholder=\"Visiters ammount\" required></input></p>"
                                +"<button>Submit</button>"
                                + "</form>");
                    out.println("</body>");
                    out.println("</html>");
                    Instance only = Instance.getInstance();
            }else{
                    Ticket cloned = client.cloned(PlanDirector.getTicket());
                    /* TODO output your page here. You may use following sample code. */
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Plan</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<form action=\"PlanDirector\" method=\"get\" id=\"form\" enctype=\"multipart/form-data\">Datos anteiores " 
                                +"<p type=\"Info:\">Actual plan: " +cloned.getPlanName()+ "</p>"
                                +"<select name=\"selection_plan\" id=\"selection_plan\" placeholder="+cloned.getPlanName()+">"
                                +"<option id=\"op1\" value=\"3\">Silver</option>\n"
                                +"<option id=\"op2\" value=\"2\">Golden</option>\n" 
                                +"<option id=\"op3\" value=\"1\">Platinum</option> "
                                +"</select>"
                                +"<p type=\"Arrival time:\">Previously arrival time: <input name=\"time_in\" id=\"time_in\" placeholder=" +cloned.getInTime()+ "></input></p>"
                                +"<p type=\"Exit time:\">Previously exit time: <input name=\"time_out\" id=\"time_out\" placeholder=" +cloned.getOutTime()+ "></input></p>"
                                +"<p type=\"Visiters ammount:\">Previously visiters ammount: <input name=\"visiter_ammount\" id=\"visiter_ammount\" placeholder="+cloned.getVisiterAmmount()+"></input></p>"
                                +"<button>Submit</button>"
                                + "</form>");
                    out.println("</body>");
                    out.println("</html>");
            }
      }
        
    }
    

}
