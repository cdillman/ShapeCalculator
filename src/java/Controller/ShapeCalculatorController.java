/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RectangleAreaCalculator;
import model.CircleAreaCalculator;
import model.TriangleRightAngleCalculator;

/**
 *
 * @author Corbin
 */
@WebServlet(name = "ShapeCalculatorController", urlPatterns = {"/shapes"})
public class ShapeCalculatorController extends HttpServlet {

    private static final String CALC_TYPE = "calcType";
    private static final String DEST = "shapeCalculatorResult.jsp";
    
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            double answer = 0.0;
            String leng = request.getParameter("len");
            String widt = request.getParameter("wid");
            String radi = request.getParameter("radius");
            String a = request.getParameter("a");
            String b = request.getParameter("b");
            String calcType = request.getParameter(CALC_TYPE);
            String msg;
            
            RectangleAreaCalculator rec = new RectangleAreaCalculator();
            CircleAreaCalculator cir = new CircleAreaCalculator();
            TriangleRightAngleCalculator tri = new TriangleRightAngleCalculator();
            
            if(calcType.equalsIgnoreCase("rectangle")){
                out.println("The Area of the Rectangle is: ");
                msg = rec.getArea(leng, widt) + "";
                request.setAttribute("msg", msg);
                
            }
            else if(calcType.equalsIgnoreCase("circle")){
                out.println("The Area of the Circle is: ");
                msg = cir.getArea(radi) + "";
                request.setAttribute("msg", msg);
                
            }
            else if(calcType.equalsIgnoreCase("triangle")){
                out.println("The Third Side of the Right Triangle is: ");
                msg = tri.getSideC(a, b) + "";
                request.setAttribute("msg", msg);
                
            }
            
            
            RequestDispatcher view = 
                    request.getRequestDispatcher(DEST);
            view.forward(request, response);
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
