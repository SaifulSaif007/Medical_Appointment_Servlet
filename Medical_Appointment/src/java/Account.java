/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Olku
 */
public class Account extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
  
             DBConnect db = new DBConnect();
        Connection con = db.getCon();
        String name ="";
        String email ="";
        String pass="";
        String addr ="";
        String age = "";
        String gender="";
        String bt ="";
         name = request.getParameter("name");
         email = request.getParameter("email");
         pass = request.getParameter("pass");
         age = request.getParameter("age");
        gender = request.getParameter("gender");
         addr = request.getParameter("address");
         bt = request.getParameter("acc");
        
         if( name.length()!=0 && email.length()!=0 && pass.length()!=0 && age.length()!=0 
                 && gender.length()!=0 && addr.length()!=0){
              String sql = "update userinfo set Name=?, Password=?, Age=?, Gender=?, Address=? where Email=? ";
              
                   PreparedStatement statement = con.prepareStatement(sql);
                   statement.setString(1, name);
                   statement.setString(2, pass);
                   statement.setString(3, age);
                   statement.setString(4, gender);
                   statement.setString(5, addr);
                   statement.setString(6, email);
                   
                  // System.out.println(name + pass + age + gender +addr +email);
                  
              int rowUpdated =  statement.executeUpdate();
                 if(rowUpdated<=0){
                     PrintWriter out = response.getWriter();
                     out.println("<script type=\"text/javascript\">");
                    out.println("alert('User or password incorrect');");
                    out.println("location='Account.jsp';");
                    out.println("</script>");
                 }
                 else{
                     PrintWriter out = response.getWriter();
                     out.println("<script type=\"text/javascript\">");
                    out.println("done");
                    out.println("location='Account.jsp';");
                    out.println("</script>");
                 }
              
                 con.close();
                 if(bt.equals("Update")){
                     response.sendRedirect("Account.jsp");
                 }
                 
                if(bt.equals("Appointment")){
                 request.setAttribute("name", request.getParameter("name"));
                 getServletConfig().getServletContext()
                   .getRequestDispatcher("/Appointment.jsp").forward(request, response);
                 }
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
        try {
            processRequest(request, response);
      
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
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
