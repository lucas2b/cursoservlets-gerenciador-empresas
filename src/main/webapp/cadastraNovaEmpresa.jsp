<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:url value="/novaEmpresa" var="servletNovaEmpresa" />
<c:url value="/editarEmpresa" var="servletEditarEmpresa" />
<%@taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${empty id}">
		<form action="${servletNovaEmpresa}" method="post">
			Nome: <input type="text" name="nome" value="aaaa"> <br>
			Data Criacao: <input type="text" name="data">
			<input type="submit">
		</form>
	</c:if>
	
	<c:if test="${not empty id}">
		<form action="${servletEditarEmpresa}" method="post">
			Nome: <input type="text" name="nome" value="${nome}"> <br>
			Data Criacao: <input type="text" name="data" value="<fmt:formatDate value="${data}" pattern="dd/MM/yyyy"/>">
			<input type="hidden" name="id" value="${id}">
			<input type="submit">
		</form>
	</c:if>
</body>
</html>