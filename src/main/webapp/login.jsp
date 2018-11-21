<%@page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>로그인</title>

</head>
<body>

	<jsp:include page="/WEB-INF/views/menu/header.jsp"/>
				<center>
					<h3>로그인</h3>
					<hr>
					<form action="login.do" method="post">
						<table border="1" cellpadding="0" cellspacing="0" width=1000px>
							<tr>
								<td width=20%>아이디</td>
								<td >&nbsp;&nbsp;<input type="text" name="id" size="20" /></td>
							</tr>
							<tr>
								<td >비밀번호</td>
								<td >&nbsp;&nbsp;<input type="password" name="password" size="20" /></td>
							</tr>
							
							<tr>
								<td colspan="2" align="center"><input type="submit"
									value="로그인" /></td>
							</tr>
							<tr>
							<td colspan="2" align="center"><h3><font color="red">	
							<%if(session.getAttribute("error")!=null) { %>		
							<%=session.getAttribute("error") %>
							<%} %></font></h3>
							</td></tr>
							<tr>
								<td colspan="2" align="center">
								<a href="joinform.do">회원가입</a>
								<a href="search.do">비밀번호 찾기</a>
								</td>
							</tr>
							
							
					</table></form>
				
					<hr>
				</center>
			<jsp:include page="/WEB-INF/views/menu/footer.jsp"/>

</body>
</html>