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
 * Servlet implementation class Registerpump
 */
public class Registerpump extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registerpump() {
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
		String pname = request.getParameter("pname");
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("password");
		String opentime = request.getParameter("opentime");
		String closetime = request.getParameter("closetime");
		String address = request.getParameter("address");
		String pcity = request.getParameter("pcity");
		String ptaluka = request.getParameter("ptaluka");
		String pdistrict = request.getParameter("pdistrict");
		String latitude = request.getParameter("latitude");
		String longitude = request.getParameter("longitude");
		String cngkg = request.getParameter("cngkg");
		try {
			Connection con = DbConnection.connect();
			PreparedStatement pstmt=con.prepareStatement("insert into cngstation values(?,?,?,?,?,?,?,?,?,?,?,?)");
			
			pstmt.setString(1,pname);
			pstmt.setString(2,mobile);
			pstmt.setString(3,password);
			pstmt.setString(4,opentime);
			pstmt.setString(5,closetime);
			pstmt.setString(6,address);
			pstmt.setString(7,pcity);
			pstmt.setString(8,ptaluka);
			pstmt.setString(9,pdistrict);
			pstmt.setString(10,latitude);
			pstmt.setString(11,longitude);
			pstmt.setString(12,cngkg);
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