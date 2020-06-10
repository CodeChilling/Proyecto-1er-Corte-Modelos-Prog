/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import factoryMethod.abstractEntities.Animal;
import factoryMethod.abstractEntities.Researcher;
import factoryMethod.concreteEntities.Guide;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jackl
 */
public class Animals extends HttpServlet {

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
        
        int aux=0;
        int auxBeta=1;
        int auxA=2;
        int auxB=9;
        Researcher employ = new Guide();
        ArrayList example = new ArrayList<>();
        
        try (PrintWriter out = response.getWriter()) {
            
            for(int i=0;i<12;i++){
                for(int j=0;j<9;j++){
                    example.add(employ.accessToAnimalData(i).getData().get(j));
                }                
            }
            
            
           
            /*
            para acceder a los datos de los animales vamos a hacer esto por ejemplo:
            animals.get(i).get(j);
            con i accedemos al primer animal y con j al primer dato del animal que esta en i, 
            se necesitaría un for (posiblemente) para acceder a todos los datos y a todos los animales
            */
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Animales</title>");
            out.println("<link rel=\"stylesheet\" href=\"css/presentation_style.css\">");
            out.println("<link rel=\"icon\" type=\"image/png\" href=\"imagenes/gym.png\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">");
            out.println("<!--Responsive-->");
            out.println("<link href=\"https://file.myfontastic.com/t5tNwfwUapz4yDzK3B6sfe/icons.css\" rel=\"stylesheet\">");
            out.println("</head>");
            out.println("<header class=\"header\">");
            out.println("</header>");
            out.println("<body>");
            out.println("<div class=\"banner\">");
            out.println("<span class=\"opacar\">");
            out.println("<img src=\"https://s.rfi.fr/media/display/84de4e76-8ae8-11ea-8972-005056bff430/w:1240/p:16x9/Tiger%20in%20Indonesian%20zoo.webp\"  height = \"100%\"  width=\"100%\" alt=\"\">");
            out.println("</span>");
            out.println("<div class=\"contenedor\">");
            out.println("<h2 class=\"banner__titulo\">Animales</h2>");
            out.println("<p class=\"banner__txt\">");
            out.println("</div>");
            out.println("</div>");
            out.println("<main class=\"main\">");
            out.println("<div class=\"contenedor\">");
            out.println("<section class=\"cursos\">");
            out.println("<h2 class=\"section__titulo\">CARACTERISTICAS</h2>");
            for(int i=0;i<12;i++){
                out.println("<div class=\"cursos__columna\">");
                out.println("<img src="+example.get(aux) + " alt=\"\" class=\"cursos__img\">");
                aux=aux+9;
                out.println("<div class=\"cursos__descripcion\">");
                out.println("<h2 class=\"cursos__titulo\">"+example.get(auxBeta)+"</h2>");
                auxBeta=auxBeta+9;
                out.println("<div class=\"cursos__txt\">");
                for(int j=auxA;j<auxB;j++){
                    out.println("<P>" + example.get(j)+"</p>");
                }
                out.println("</div>");
                out.println("</div>");
                auxA=auxA+9;
                auxB=auxB+9;
                out.println("</div>");
            }
            out.println("</section>");
            out.println("</div>");
            out.println("</main>");
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
        try (PrintWriter out = response.getWriter()) {
           
            
           
            /*
            para acceder a los datos de los animales vamos a hacer esto por ejemplo:
            animals.get(i).get(j);
            con i accedemos al primer animal y con j al primer dato del animal que esta en i, 
            se necesitaría un for (posiblemente) para acceder a todos los datos y a todos los animales
            */
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Animals</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Animals at " + request.getContextPath() + "</h1>");
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
