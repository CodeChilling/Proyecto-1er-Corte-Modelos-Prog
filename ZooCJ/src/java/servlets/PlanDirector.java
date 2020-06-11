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
        Assignator selection = new Assignator();

        try (PrintWriter out = response.getWriter()) {

            info = selection.assignation(Integer.parseInt(request.getParameter("selection_plan")));
            info.setInTime(request.getParameter("time_in"));
            info.setOutTime(request.getParameter("time_out"));
            info.setVisiterAmmount(request.getParameter("visiter_ammount"));

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">\n"
                    + "        <title>ZooTycon</title>\n"
                    + "        <link rel=\"icon\"  type=\"image/png\" href=\"https://img.freepik.com/vector-gratis/vector-zoologico-animal_74440-1792.jpg?size=626&ext=jpg\">\n"
                    + "\n"
                    + "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n"
                    + "    <link rel=\"stylesheet\" href=\"css/plan_style.css\">\n"
                    + "    <link rel=\"stylesheet\" href=\"css/form_style.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<div id=\"main-container\">\n"
                    + "\n"
                    + "		<table>\n"
                    + "			<thead>\n"
                    + "				<tr>\n"
                    + "					<th>Descripcion</th><th>Seleccionado</th>\n"
                    + "				</tr>\n"
                    + "			</thead>\n"
                    + "\n"
                    + "			<tr>\n"
                    + "				<td>Plan: </td><td>" + info.getPlanName() + "</td>\n"
                    + "			</tr>\n"
                    + "			<tr>\n"
                    + "				<td>Beneficios: </td><td>" + info.getBenefits() + "</td>\n"
                    + "			</tr>\n"
                    + "			<tr>\n"
                    + "				<td>Desde: </td><td>" + info.getInTime() + "</td>\n"
                    + "            </tr>\n"
                    + "            <tr>\n"
                    + "				<td>Hasta </td><td>" + info.getOutTime() + "</td>\n"
                    + "			</tr>\n"
                    + "			<tr>\n"
                    + "				<td>Visitantes</td><td>" + info.getVisiterAmmount() + "</td>\n"
                    + "            </tr>\n"
                    + "            <tr>\n"
                    + "				<td>Precio</td><td>" + info.getPrice() + "</td>\n"
                    + "            </tr>\n"
                    + "            <tr>\n"
                    + "                <form action=\"SavePlan\" method=\"GET\">\n"
                    + "				<td><input type=\"submit\" value=\"Editar\" class=\"btn btn-secondary btn-lg\"></td><td><a class=\"btn btn-primary btn-lg\" href=\"success.jsp\">Enviar</a></td>\n"
                    + "                </form>\n"
                    + "            </tr>\n"
                    + "        </table>\n"
                    + "\n"
                    + "    </div>");

            out.println("</body>");
            out.println("</html>");

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    public static Ticket getTicket() {
        return info;
    }

}
