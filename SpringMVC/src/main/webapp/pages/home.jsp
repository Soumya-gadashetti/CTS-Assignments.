<html>
<head>
	<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
	<title>Welcome</title>
</head>
	<body>
	<section style="padding: 10px ;" ></section>
	<h1>${pageTitle}</h1>
		<h3>Hello Every One</h3>
		
		<ol>
			<c:forEach var="d" items="${developers }">
				<li>${d }</li>
				</c:forEach>
		</ol>
	</body>
</html>