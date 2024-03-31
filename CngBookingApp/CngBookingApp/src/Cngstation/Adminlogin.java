package Cngstation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Adminlogin
 */
public class Adminlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminlogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		 try {
			 Connection con=DbConnection.connect();
	    String email = request.getParameter("email");
	    String password = request.getParameter("password");
	    
	    
	    


			PreparedStatement pstmt=con.prepareStatement("select * from admin where email=? and password=?");
			pstmt.setString(1,email);
			pstmt.setString(2, password);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				//Getset.setAccno(rs.getInt(2));
				response.sendRedirect("viewadmin.html");
			}else{
				response.sendRedirect("Adminloginpage.html");
			}
			
	 		
			
			
				} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    
	    
	}
	
    
	
}
