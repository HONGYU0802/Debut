<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import= "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="ServletAffiche" method="get">

<%
ArrayList<String> poubelle = (ArrayList<String>) session.getAttribute("les taches");

for(String tache : poubelle )
	out.println(tache);
%>

</form>


</body>
</html>