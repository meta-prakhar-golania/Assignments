<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.io.IOException"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<%		
	try {
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","123Asdfg12");
		PreparedStatement ps=con.prepareStatement("select * from studentregister where firstname=? and lastname=? order by class");
		ps.setString(1, firstname);
		ps.setString(2, lastname);
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmd=rs.getMetaData();  
		int row=rsmd.getColumnCount();
		if( row>0 )
%>
		<h1>Result:</h1><br>
			<table id="displayData">
		<tr>
			<th>Student Name</th>
			<th>Father's Name</th>
			<th>Email</th>
			<th>Class</th>
			<th>Age</th>
			<th></th>
		</tr>
		
		<%
			while (rs.next()) {
				int id = rs.getInt("idstudentregister");
		%>
		
		<tr>
			<td><%=rs.getString("firstname") +" "+ rs.getString("lastname")%></td>
			<td><%=rs.getString("fathername")%></td>
			<td><%=rs.getString("email")%></td>
			<td><%=rs.getInt("class")%></td>
			<td><%=rs.getInt("age")%></td>
		</tr>
	
<%		
		}
		con.close();
	}
		catch (Exception ex) {
				out.println("Unable to connect to database.");
		}
%>
</body>
</html>