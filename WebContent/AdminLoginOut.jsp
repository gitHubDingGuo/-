<%@page import="java.util.TreeSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
        HttpSession s=request.getSession();
        String accountNmuber=(String)s.getAttribute("adminName");
    	ServletContext a = getServletContext();
        TreeSet<String> adminLists=(TreeSet)a.getAttribute("AdminList");
        if(adminLists.contains(accountNmuber)){
        	adminLists.remove(accountNmuber);
        }
        s.invalidate();
        response.sendRedirect("AdminLogin.jsp");
%>
</body>
</html>