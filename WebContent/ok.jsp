<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="entity.Login" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

bon travaille<br>

<%
	Login log = (Login) session.getAttribute("lelogin");
	out.println(log.getNom());
	%>

<br>
Listes des taches a faire:

<form action="ServletAjoute" method="post">
	tache : <input type="text" name="latache"><br>
	<input type="submit" value="ajouter une tache">
</form>


<form action="ServletAffiche" method="post">
	<input type="submit" value="afficher des taches">
</form>


</body>
</html>