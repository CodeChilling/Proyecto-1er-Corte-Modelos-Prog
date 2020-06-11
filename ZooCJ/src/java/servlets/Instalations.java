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
        Zone area1 = east.getZone();
        //aqui van los datos de la zona este, usando metodos del objeto area
        Sector west = new westWing();
        guide.buildInfo(west);
        Zone area2 = west.getZone();
        //aqui van los datos de la zona oeste, usando metodos del objeto area
        Sector north = new northWing();
        guide.buildInfo(north);
        Zone area3 = north.getZone();
        //aqui van los datos de la zona norte, usando metodos del objeto area
        Sector south = new southWing();
        guide.buildInfo(south);
        Zone area4 = south.getZone();
        //aqui van los datos de la zona norte, usando metodos del objeto area
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Animales</title>");
            out.println("<link rel=\"stylesheet\" href=\"css/presentation_style.css\">");
            out.println("<link rel=\"icon\" type=\"image/png\" href=\"https://img.freepik.com/vector-gratis/vector-zoologico-animal_74440-1792.jpg?size=626&ext=jpg\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">");
            out.println("<!--Responsive-->");
            out.println("<link href=\"https://file.myfontastic.com/t5tNwfwUapz4yDzK3B6sfe/icons.css\" rel=\"stylesheet\">");
            out.println("</head>");
            out.println("<header class=\"header\">");
            out.println("</header>");
            out.println("<body>\n"
                    + "    <div class=\"banner\">\n"
                    + "        <span class=\"opacar\">\n"
                    + "                    <img src=\"https://images.unsplash.com/photo-1565867496556-e6f84b777af8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80\"  height = \"100%\"  width=\"100%\" alt=\"\">\n"
                    + "                </span>\n"
                    + "        <div class=\"contenedor\">\n"
                    + "            <h2 class=\"banner__titulo\">Instalaciones y Cargos</h2>\n"
                    + "            <p class=\"banner__txt\">\n"
                    + "        </div>\n"
                    + "    </div>\n"
                    + "    <main class=\"main\">\n"
                    + "        <div class=\"contenedor\">\n"
                    + "\n"
                    + "            <section class=\"cursos\">\n"
                    + "                <h2 class=\"section__titulo\">PERSONAL</h2>\n"
                    + "                <div class=\"cursos__columna\">\n"
                    + "                    <img src=" + area1.getImage() + " alt=\"\" class=\"cursos__img\">\n"
                    + "                    <div class=\"cursos__descripcion\">\n"
                    + "                        <h2 class=\"cursos__titulo\">" + area1.getInCharge() + "</h2>\n"
                    + "                        <h3 class=\"cursos__txt\">" + area1.getAreas() + "</h3>\n"
                    + "                        <div class=\"cursos__txt\">\n" + area1.getDescription()
                    + "                        </div>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "                <div class=\"cursos__columna\">\n"
                    + "                    <img src=" + area2.getImage() + " alt=\"\" class=\"cursos__img\">\n"
                    + "                    <div class=\"cursos__descripcion\">\n"
                    + "                        <h2 class=\"cursos__titulo\">" + area2.getInCharge() + "</h2>\n"
                    + "                        <h3 class=\"cursos__txt\">" + area2.getAreas() + "</h3>\n"
                    + "                        <div class=\"cursos__txt\">\n" + area2.getDescription()
                    + "                        </div>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "                <div class=\"cursos__columna\">\n"
                    + "                    <img src=" + area3.getImage() + " alt=\"\" class=\"cursos__img\">\n"
                    + "                    <div class=\"cursos__descripcion\">\n"
                    + "                        <h2 class=\"cursos__titulo\">" + area3.getInCharge() + "</h2>\n"
                    + "                        <h3 class=\"cursos__txt\">" + area3.getAreas() + "</h3>\n"
                    + "                        <div class=\"cursos__txt\">\n" + area3.getDescription()
                    + "                        </div>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "                <div class=\"cursos__columna\">\n"
                    + "                    <img src=" + area4.getImage() + " alt=\"\" class=\"cursos__img\">\n"
                    + "                    <div class=\"cursos__descripcion\">\n"
                    + "                        <h2 class=\"cursos__titulo\">" + area4.getInCharge() + "</h2>\n"
                    + "                        <h3 class=\"cursos__txt\">" + area4.getAreas() + "</h3>\n"
                    + "                        <div class=\"cursos__txt\">\n" + area4.getDescription()
                    + "                        </div>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "            </section>\n"
                    + "\n"
                    + "        </div>\n"
                    + "    </main>\n"
                    + "</body>");

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
