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
                    out.println("<head>\n" +
                                "        <meta charset=\"UTF-8\">\n" +
                                "        <title>ZooTycon</title>\n" +
                                "        <link rel=\"icon\"  type=\"image/png\" href=\"https://img.freepik.com/vector-gratis/vector-zoologico-animal_74440-1792.jpg?size=626&ext=jpg\">\n" +
                                "        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n" +
                                "        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/form_style.css\">\n");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("        <div class=\"container\">\n" +
                    "            <form action=\"PlanDirector\" class=\"form\">\n" +
                    "                <div class=\"form-header\">\n" +
                    "                    <h1 class=\"form-title\"><span>Zootycon</span></h1>\n" +
                    "                    <h3 class=\"form-title\"><span>Reserva tu Estadia</span></h3>\n" +
                    "                </div>\n" +
                    "\n" +
                    "                <div class=\"form-group\">\n" +
                    "                    <label for=\"weight\" class=\"form-label\">¿Que plan deseas?</label>\n" +
                    "                    \n" +
                    "                        <select class=\"form-control list\" id=\"selection_plan\" name=\"selection_plan\">\n" +
                    "                            <option value=\"3\">Silver</option>\n" +
                    "                            <option value=\"2\">Golden</option>\n" +
                    "                            <option value=\"1\">Platinum</option>\n" +
                    "                        </select>\n" +
                    "                </div> \n" +
                    "\n" +
                    "                <label for=\"time_in\" class=\"form-label\">Desde:</label>\n" +
                    "                <input type=\"text\" class=\"form-input\" placeholder=\"Digita la fecha de tu llegada\" name=\"time_in\" id=\"time_in\" required>\n" +
                    "\n" +
                    "                <label for=\"time_out\" class=\"form-label\">Hasta:</label>\n" +
                    "                <input type=\"text\" class=\"form-input\" placeholder=\"Digita la fecha de tu salida\" name=\"time_out\" id=\"time_out\" required>\n" +
                    "\n" +
                    "                <label for=\"visiter_ammount\" class=\"form-label\">Cantidad de visitantes:</label>\n" +
                    "                <input type=\"text\" class=\"form-input\" placeholder=\"Cantidad de personas para la reserva\" name=\"visiter_ammount\" id=\"visiter_ammount\" required>\n" +
                    "\n" +
                    "                <input type=\"submit\" value=\"Continuar\" class=\"button-submit\">\n" +
                    "\n" +
                    "            </form>\n" +
                    "        </div>\n" +
                    "\n" +
                    "        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n" +
                    "        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n" +
                    "        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>");

                    out.println("</body>");
                    out.println("</html>");
                    Instance only = Instance.getInstance();
            }else{
                    Ticket cloned = client.cloned(PlanDirector.getTicket());
                    /* TODO output your page here. You may use following sample code. */
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("        <meta charset=\"UTF-8\">\n" +
                            "        <title>ZooTycon</title>\n" +
                            "        <link rel=\"icon\"  type=\"image/png\" href=\"https://img.freepik.com/vector-gratis/vector-zoologico-animal_74440-1792.jpg?size=626&ext=jpg\">\n" +
                            "        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n" +
                            "        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/form_style.css\">");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("        <div class=\"container\">\n" +
                    "            <form action=\"PlanDirector\" class=\"form\">\n" +
                    "                <div class=\"form-header\">\n" +
                    "                    <h1 class=\"form-title\"><span>Zootycon</span></h1>\n" +
                    "                    <h3 class=\"form-title\"><span>Datos anteriores</span></h3>\n" +
                    "                </div>\n" +
                    "\n" +
                    "                <div class=\"form-group\">\n" +
                    "                    <label for=\"weight\" class=\"form-label\">Plan escogido anteriormente: "+cloned.getPlanName()+"</label>\n" +
                    "                    \n" +
                    "                        <select class=\"form-control list\" id=\"selection_plan\" name=\"selection_plan\">\n" +
                    "                            <option value=\"3\">Silver</option>\n" +
                    "                            <option value=\"2\">Golden</option>\n" +
                    "                            <option value=\"1\">Platinum</option>\n" +
                    "                        </select>\n" +
                    "                </div> \n" +
                    "\n" +
                    "                <label for=\"time_in\" class=\"form-label\">Desde(Fecha antigua): "+cloned.getInTime()+"</label>\n" +
                    "                <input type=\"text\" class=\"form-input\" placeholder=\""+cloned.getInTime()+"\" name=\"time_in\" id=\"time_in\" required>\n" +
                    "\n" +
                    "                <label for=\"time_out\" class=\"form-label\">Hasta(Fecha antigua):"+cloned.getOutTime()+"</label>\n" +
                    "                <input type=\"text\" class=\"form-input\" placeholder=\""+cloned.getOutTime()+"\" name=\"time_out\" id=\"time_out\" required>\n" +
                    "\n" +
                    "                <label for=\"visiter_ammount\" class=\"form-label\">Cantidad de visitantes(Dato anterior): "+cloned.getVisiterAmmount()+"</label>\n" +
                    "                <input type=\"text\" class=\"form-input\" placeholder=\""+cloned.getVisiterAmmount()+"\" name=\"visiter_ammount\" id=\"visiter_ammount\" required>\n" +
                    "\n" +
                    "                <input type=\"submit\" value=\"Seguramente Esta SI ES\" class=\"button-submit\">\n" +
                    "\n" +
                    "            </form>\n" +
                    "        </div>\n" +
                    "\n" +
                    "        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n" +
                    "        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n" +
                    "        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>");

                    out.println("</body>");
                    out.println("</html>");
            }
      }
        
    }
    

}
