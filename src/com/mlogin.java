package com;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author miracle
 */
public class mlogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
             
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
                //processRequest(request, response);
     response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
     out.println("entered");
     String uname=request.getParameter("user"); 
     String pass=request.getParameter("pass");
     
     if(uname.equals(pass))
     {
         out.println(" valid user");
     }
 
            }

}