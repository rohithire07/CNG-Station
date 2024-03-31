<%@page import="Cngstation.Getset"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import ="java.sql.*" %>
<%@page import="Cngstation.DbConnection" %>

<%
			Connection con=DbConnection.connect();
String mobile = Getset.getMob();
   			int amount=Integer.parseInt(request.getParameter("amount"));
   			int bal = 0;
   			PreparedStatement pst = con.prepareStatement("select * from cngstation where mobile=?");
   			pst.setString(1, mobile);
   			ResultSet rs = pst.executeQuery();
   			while(rs.next()){
   				bal = rs.getInt(12);
   			}
   			int newbal = bal -amount;
   			PreparedStatement pstmt=con.prepareStatement("UPDATE `cngstation` SET `cngkg`=? WHERE mobile=?");
			pstmt.setInt(1, newbal);
			pstmt.setString(2, mobile);
			int i = pstmt.executeUpdate();
			if(i>0){
				response.sendRedirect("viewuser.html");
			}else{
				
			}

%>

</body>
</html>