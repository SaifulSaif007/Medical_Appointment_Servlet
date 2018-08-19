/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Olku
 */
public class Login extends HttpServlet {

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
        String name = request.getParameter("Uname");
        String pass = request.getParameter("pass");
        DBConnect db = new DBConnect();
        Connection con = db.getCon();
     
        /*PreparedStatement statement = con.prepareStatement("insert into user(name,pass) values (?,?)");
        statement.setString(1, name);
        statement.setString(2, pass);
        statement.executeUpdate();
        statement.close();*/
        String query = "select * from userinfo where Name = '"+name+"' and Password = '"+pass+"'";
        Statement statement=null;
        ResultSet result=null;
        statement = con.createStatement();
        result = statement.executeQuery(query);
        if(result.next()){
            System.out.println("ok....done");
            String U_name = result.getString(1);
            System.out.println("here: " + U_name);
            
          /*  request.setAttribute("Uname",result.getString(1));
            request.setAttribute("Email",result.getString(2));
            request.setAttribute("Age",result.getString(4));
            request.setAttribute("Gender",result.getString(5));
            request.setAttribute("Addr",result.getString(6));
            */
            HttpSession session = request.getSession(true);
           
            synchronized (session){
                session.setAttribute("Uname", result.getString(1));
                session.setAttribute("Email", result.getString(2));
                session.setAttribute("pass", result.getString(3));
                session.setAttribute("Age", result.getString(4));
                session.setAttribute("Gender", result.getString(5));
                session.setAttribute("Addr", result.getString(6));
            }
            System.out.println(name);
            response.sendRedirect("Account.jsp");
            //getServletConfig().getServletContext()
              //      .getRequestDispatcher("/Account.jsp").forward(request, response);
         
            
        }
        else{
            System.out.println("no");
            PrintWriter out = response.getWriter();
                   out.println("<script type=\"text/javascript\">");
                    out.println("alert('User or password incorrect');");
                    out.println("location='Login.jsp';");
                    out.println("</script>");
            response.sendRedirect("Login.jsp");
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
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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


