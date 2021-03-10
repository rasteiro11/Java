<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	The Customer is confirmed: ${customer.firstName} ${customer.lastName}
	<br><br>
	Free passes: ${customer.freePasses}
	<br><br>
	Postal Code: ${customer.postalCode}
	<br><br>
	Course Code: ${customer.courseCode}
	<br><br>
</body>
</html>