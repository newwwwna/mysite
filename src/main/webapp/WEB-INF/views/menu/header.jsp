<%@page import="com.javalec.mysite.vo.UsersVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>header</title>
</head>
<body>

<%


UsersVO vo = (UsersVO) session.getAttribute("vo");
if (!session.isNew() || vo!=null) { 
	
response.sendRedirect("login.do");


}
%>

	<div id="header" align="center">
	<table width=1000px bgcolor="pink">
		<img src=header.jpg>
		<td align=center>	
				<h4>${vo.name}�� ȯ���մϴ�!
				<a href="logout.do">LOG-OUT</a>
			<a href="usermodify.jsp">ȸ������ ����</a></h4>
			</td>
	
		
	</table>
	</div>

</body>
</html>