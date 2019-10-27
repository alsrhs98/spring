<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String reply = request.getParameter("reply");
	out.print("-> " + reply + "<br>");
%>