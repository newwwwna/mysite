<%@page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>새글등록</title>

</head>
<body>
		<jsp:include page="/WEB-INF/views/menu/header.jsp"/>
				<center>
					<h3>회원정보 변경</h3>
					<hr>
					<form action="usermodify.do" method="post">
						<table border="1" cellpadding="0" cellspacing="0" width=700px>
						<input type="hidden" name = "id" value="${id}">
							
							<tr>
								<td >비밀번호</td>
								<td >&nbsp;&nbsp;<input type="text" name="password" size="20"/></td>
							</tr>
							<tr>
								<td >이름</td>
								<td >&nbsp;&nbsp;<input type="text" name="name" size="20"/>
								</td>
							</tr>
							
							<tr>
								<td colspan="2" align="center"><input type="submit"
									value="사용자 수정" /></td>
							</tr>
							<a href="login.jsp" >로그인하기</a>
						</table>
					</form>
					<hr>
				</center>
		<jsp:include page="/WEB-INF/views/menu/footer.jsp"/>

</body>
</html>