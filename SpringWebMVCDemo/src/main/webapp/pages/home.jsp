

	<head>
	<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
		<title>Home</title>
	</head>
	<body>
	<section style="padding: 10px; min-height:400px;">
		<h2>Home Page</h2>
		<h2>${pageTitle}</h2>
		<ol>
			<c:forEach var="d" items="${developers }">
			<li> ${d } </li>
			</c:forEach>
		</ol>
		</section>
	</body>
