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


        String accountNmuber=(String)s.getAttribute("accountName");
 

    	ServletContext a = getServletContext();
        TreeSet<String> userslists=(TreeSet)a.getAttribute("userlist");
        if(userslists.contains(accountNmuber)){
        	userslists.remove(accountNmuber);
        }
        s.invalidate();
        response.sendRedirect("Login.jsp");
%>
</body>
</html>