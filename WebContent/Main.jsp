<%@page import="com.sun.xml.internal.stream.Entity"%>
<%@page import="java.util.Date"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="qian.web.model.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;UTF-8");
%>
<!-- <a href="UserSearchServlet">查询</a> -->
<%-- <a href="logout.jsp">注销</a>
<br/>
<fmt:formatDate value="<%=new Date()%>" pattern="yyyy-MM-dd HH:mm:ss"/>
<br>
<fmt:formatDate value="<%=new Date()%>" type="both" timeStyle="full"/>
<br>
<fmt:formatNumber value="123456.3" pattern="###,###.##"></fmt:formatNumber>
<br>
<fmt:formatNumber value="123456.3" type="currency"></fmt:formatNumber>
<br>
${fn:escapeXml("<br>")}
${fn:substring("hello,erveryone",0,5)}
<c:choose>
    <c:when test="${seesionScope.getName()=='125800'}">
            <p>欢迎你；</p>${seesionScope.getName()};
    </c:when>
    <c:otherwise>
          <p> 欢迎你：游客；；</p> 
    </c:otherwise>
</c:choose>
<p>欢迎你!</p>
<br/>修改
<br/> --%>
<%-- <a href="UserSearchServlet">所有查询</a>

<br/>
<br/>
    <table border="1" cellspacing="4" cellpadding="10" bgcolor="yellow">
    <c:forEach var="all" items="${requestScope.List}" varStatus="i" step="1">
    	<tr>
        <td>${all.id }</td>
        <td>${all.name }</td>
        <td>${all.password}</td>
        <td>${all.statues==0 ? "用户":"管理员"}</td>
        <td><a href="UpdateUser?id=${all.id}">修改 </a> &nbsp<a href="DeleteUser?id=${all.id}">删除</a> &nbsp<a href="AddUser.jsp">添加</a></td>
    	</tr> 																																			
    </c:forEach>  	
    </table>
     --%>
      
<p>当前在线人数:${applicationScope.online}</p>
<a href="PageSearchServlet">分页查询</a>
<br/>
<br/>
    <%
    ArrayList<Entity> listt=(ArrayList)request.getAttribute("userlist");
    
    if(listt!=null){
    %>
   
    <table border="1" cellspacing="4" cellpadding="10" bgcolor="green">
    <c:forEach var="all" items="${userlist}" varStatus="i" step="1">
    	<tr>
        <td>${all.id }</td>
        <td>${all.name }</td>
        <td>${all.password}</td>
        <td>${all.statues==0 ? "用户":"管理员"}</td>
        <td><a href="UpdateUser?id=${all.id}">修改 </a> &nbsp<a href="DeleteUser?id=${all.id}">删除</a> &nbsp<a href="AddUser.jsp">添加</a></td>
    	</tr>
    																																			
    </c:forEach>
        <tr  align="center"><td colspan="5">
           
           <c:if test="${curretPage!=1}">
            <a href="PageSearchServlet?currentPage=${currentPage-1}">上一页</a>
            
         </c:if>
           &nbsp
          <c:if test="${curretPage!=totalPage}">
            <a href="PageSearchServlet?currentPage=${currentPage+1}">下一页</a>
         </c:if> 
       
        
           </td>
        </tr>	
    </table>
  <% } %>





<%--  <%
   ArrayList<Entity> list=(ArrayList<Entity>)request.getAttribute("List");
%> 
   
<%
if(list!=null){
%>   <table border="1" cellspacing=”4” cellpadding="10" bgcolor="yellow"
		color="yellow" align="center">
	 <tr><td style="width: 60px;height: 10px;">id&nbsp;&nbsp;&nbsp;   </td> <td style="width: 80px;height: 10px;">name&nbsp;&nbsp;&nbsp; </td><td style="width: 110px;height: 10px;">password&nbsp;&nbsp;&nbsp;  </td><td style="width: 90px;height: 10px;">status&nbsp;&nbsp;&nbsp;  </td></tr>
     </table>
	<%	
	   for(Entity e:list){
     %>  
    <table border="1" cellspacing=”4” cellpadding="10" bgcolor="yellow"
		color="y	ellow" align="center">
		<tbody>
    <tr><td style="width: 60px;height: 10px;"><%=e.getId() %> </td> <td style="width: 80px;height: 10px;"><%=e.getName() %> </td><td style="width: 110px;height: 10px;"><%=e.getPassword() %> </td> <td  style="width: 90px;height: 10px;"><%=e.getStatues()%>  </td></tr>
        </tbody>
    </table>
<%		   
	   }
   }
%>
 --%>
</body>
</html>