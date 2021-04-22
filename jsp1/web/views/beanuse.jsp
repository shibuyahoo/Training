<%@ page language="java" %>
<%@ page import="java.util.List,java.util.ArrayList" %>
<html>
<head>
<title>
My First JSP Page
</title>
</head>
<body>
<h1 align="center">Welcome to my home page</h1>
<p> The current time is <%= new java.util.Date() %></p>
<%!
double randNumber=Math.random();
public String convertCase(){
	return "shibu".toUpperCase();
}
%>
<p>The random number is<%= randNumber %></p>
<%= convertCase() %>
<jsp:useBean id="student" class="app.model.Student">
<jsp:setProperty name="student" property="name" value="Shibu"/>
<jsp:setProperty name="student" property="school" value="St Josephs"/>
</jsp:useBean>

<p> Name of student is <jsp:getProperty name="student" property="name"/></p>
<p> School of student is <%= student.getSchool() %></p>
</body>
</html>