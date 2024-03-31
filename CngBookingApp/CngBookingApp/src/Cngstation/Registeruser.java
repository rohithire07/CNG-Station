package Cngstation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registeruser
 */
public class Registeruser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registeruser() {
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
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		String password = request.getParameter("password");
		String city = request.getParameter("city");
		try {
			Connection con = DbConnection.connect();
			PreparedStatement pstmt=con.prepareStatement("insert into user values(?,?,?,?,?)");
			
			pstmt.setString(1,name);
			pstmt.setString(2,email);
			pstmt.setString(3,mobile);
			pstmt.setString(4,password);
			pstmt.setString(5,city);
			int i=pstmt.executeUpdate();
			if(i>0)
			{
				response.sendRedirect("dashboard.html");	
			}
			else
			{
				response.sendRedirect("index.html");
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

