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

import Cngstation.DbConnection;
import Cngstation.Getset;

/**
 * Servlet implementation class addcng
 */
public class addcng extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addcng() {
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
		int total=0;
		 try {
			 Connection con=DbConnection.connect();
	    int amount = Integer.parseInt(request.getParameter("cng"));
	    String mob=Getset.getMob( );
	    
			PreparedStatement pstmt=con.prepareStatement("select * from cngstation where mobile=?");
			pstmt.setString(1,mob);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				 int amount1 = rs.getInt(12);
				 total=amount1+amount;
			
			
			PreparedStatement pstmt1=con.prepareStatement("UPDATE cngstation SET cngkg=? where mobile=?");
			pstmt1.setInt(1, total);
			pstmt1.setString(2, mob);
			int i =pstmt1.executeUpdate();
			if(i>0){
					response.sendRedirect("viewcng.html");
			}
			}
	 		
			
			
				} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    
	    
	}
	
    
	
}

