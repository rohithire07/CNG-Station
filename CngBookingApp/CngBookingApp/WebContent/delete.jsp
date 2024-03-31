<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*" %>
<%@page import="Cngstation.DbConnection" %>
<%
String mono = request.getParameter("mono");
Connection con = DbConnection.connect();
PreparedStatement pstmt = con.prepareStatement("DELETE FROM `cngstation` WHERE  mobile=?");
pstmt.setString(1, mono);
int i = pstmt.executeUpdate();
if(i>0){
	response.sendRedirect("deletepump.jsp");
}else{
	
}


%>
</body>
</html>