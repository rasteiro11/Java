<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student confirmation form</title>
</head>
<body>
<!-- o spring mvc ira utilizar student.getFirstName e student.getLastName  -->
	The student is confirmed: ${student.firstName} ${student.lastName}
	<br><br>
	Country: ${student.country}
	<br><br>
	Favorite language: ${student.favoriteLanguage}
	<br><br>
	Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
	
	<br><br>
	
</body>
</html>