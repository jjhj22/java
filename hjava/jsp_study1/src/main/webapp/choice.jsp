<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");

%>
<jsp:useBean id="bab"  class="test.Lunch"/>
<jsp:setProperty property="*" name="bab"/>

<jsp:getProperty property="menu" name="bab"/>
<jsp:getProperty property="price" name="bab"/>
<%=bab.getRestaurant() %>
