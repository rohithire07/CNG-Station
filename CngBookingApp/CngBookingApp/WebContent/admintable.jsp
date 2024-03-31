<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="Cngstation.DbConnection" %>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta name="description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
   
    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <!-- Font-icon css-->
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  </head>
  <body class="app sidebar-mini">
    <!-- Navbar-->
    <header class="app-header"><a class="app-header__logo" href="index.html">View Station</a>
      <!-- Sidebar toggle button--><a class="app-sidebar__toggle" href="#" data-toggle="sidebar" aria-label="Hide Sidebar"></a>
      <!-- Navbar Right Menu-->
      <ul class="app-nav">
       
        </li>
      
              </div>
            </div>
          
        <!-- User Menu-->
        
        </li>
      </ul>
    </header>
   

       
        <div>
          <h1><i class="fa fa-th-list"></i> Data Table</h1>
          <p>Table to display analytical data effectively</p>
        </div>
        <ul class="app-breadcrumb breadcrumb side">
          <li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
          <li class="breadcrumb-item">Tables</li>
          <li class="breadcrumb-item active"><a href="#">Data Table</a></li>
        </ul>
      </div>
      <div class="row">
        <div class="col-md-12">
          <div class="tile">
            <div class="tile-body">
              <div class="table-responsive">
                <table class="table table-hover table-bordered" id="sampleTable">
                  <thead>
					<% Connection con=DbConnection.connect();
					
					String taluka= request.getParameter("taluka");
					PreparedStatement pstmt=con.prepareStatement("select * from cngstation");
					
					ResultSet rs=pstmt.executeQuery();%>

                    <!-- Users -->
                    <div class="table-responsive-xl">
                        <table class="table text-nowrap mb-0">
                            <thead>
                            <tr>
                               
                                <th class="font-weight-semi-bold border-top-0 py-2">Pump Name</th>
                                <th class="font-weight-semi-bold border-top-0 py-2">Address</th>
                                   <th class="font-weight-semi-bold border-top-0 py-2">City</th>
                                   <th class="font-weight-semi-bold border-top-0 py-2">District</th>
                                   <th class="font-weight-semi-bold border-top-0 py-2">Taluka</th>
                                <th class="font-weight-semi-bold border-top-0 py-2">Open Time</th>
                                <th class="font-weight-semi-bold border-top-0 py-2">Close Time</th>
                                <th class="font-weight-semi-bold border-top-0 py-2">Mobile No.</th>
                                 <th class="font-weight-semi-bold border-top-0 py-2">Latitude</th>
                                 <th class="font-weight-semi-bold border-top-0 py-2">Longitude</th>
                                  <th class="font-weight-semi-bold border-top-0 py-2">CNG</th>
                            </tr>
                            <%while(rs.next()){%>
                            </thead>
                            <tbody>
                            <tr>
                                
                                
                              	 <td class="py-3"><%=rs.getString(1) %></td>
                                 <td class="py-3"><%=rs.getString(6) %></td>
                                 <td class="py-3"><%=rs.getString(7) %></td>
                                 <td class="py-3"><%=rs.getString(9) %></td>
                             	 <td class="py-3"><%=rs.getString(8) %></td>
                              	 <td class="py-3"><%=rs.getString(4) %></td>
                             	 <td class="py-3"><%=rs.getString(5) %></td>
                                 <td class="py-3"><%=rs.getString(2) %></td>
                                 <td class="py-3"><%=rs.getString(10) %></td>
                                  <td class="py-3"><%=rs.getString(11) %></td>
									
                                   
                                   
                                 <td class="py-3"><span class="badge badge-pill badge-success"><%=rs.getString(12) %></td>
                                
                            </tr>
                            
                            <% }%>
                            
                            </tbody>
                        </table>
                        
                    </div>
                    <!-- End Users -->
                </div>
            </div>


        </div>

        
    </div>
</main>


<script src="public/graindashboard/js/graindashboard.js"></script>
<script src="public/graindashboard/js/graindashboard.vendor.js"></script>

</body>
</html>
</body>
</html>