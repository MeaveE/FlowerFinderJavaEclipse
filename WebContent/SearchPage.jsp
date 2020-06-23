
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import ="java.util.*" %>
<%@ page import ="com.ca.business.Flower" %>
<HTML>

<HEAD>
<link rel="stylesheet" href="SearchCss.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
</HEAD>

<div class="topnav">
  <a class="active" href="SearchPage.jsp"><i class="fa fa-home"></i></a>
 <div class="search-container">
    <form action="FrontController" method="post">
    <input type="hidden" name="action" value="Search" />
      <input type="text" placeholder="Search.." name="flowerserach">
      <button type="submit"><i class="fa fa-search" title="Submit"></i></button>
    </form>
  </div>
</div>

<table>

<tr> <th>Image</th><th>PlantName</th>
<%
List<Flower> flowers;
flowers = (List)(request.getSession().getAttribute("flowers"));

if (flowers != null){

  for (Flower f : flowers){ 
%>

	<tr>
	  <td><img src="<%=f.getImage()%>" height="50" width="50"></td>
	  <td><%=f.getFlowerName()%></td>
	  <td><form action="Display.jsp">
    		<input type="submit" value="Profile" />
				</form></td>
	</tr>

<% 
  }
}
%>
</table>







</HTML>