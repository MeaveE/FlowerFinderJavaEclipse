
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import ="java.util.*" %>
<%@ page import ="com.ca.business.Flower" %>
<HTML>
	
<%
List<Flower> flowers;
flowers = (List)(request.getSession().getAttribute("flowers"));

if(flowers != null)
	Flower f = flowers;

%>
	
	<img src="<%=flowers.getImage()%>" height="100" width="100">
	<h1><%=flowers.getFlowerName()%></h1>
	<h3><%=flowers.getDescription()%></h3>
	<h3><%=flowers.getSeason()%></h3>
	<h3><%=flowers.getHabitat()%></h3>



</HTML>