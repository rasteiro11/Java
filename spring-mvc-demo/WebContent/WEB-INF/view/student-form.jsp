<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student registration form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName"/>
		<br><br>
		Last name: <form:input path="lastName"/>
		<br><br>
		
		Country:
		<form:select path="country">
			<form:options items="${student.countryOptions}"></form:options> 
			<!--  
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="France" label="France"></form:option>
			<form:option value="Germany" label="Germany"></form:option>
			<form:option value="India" label="India"></form:option>
			-->
		</form:select>
		
		<br><br>
		
		<!-- student.setFavoriteLanguage() -->
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
		RUBY <form:radiobutton path="favoriteLanguage" value="RUBY"/>
		
		<br><br>
		Operating Systems:
		<!-- student.setOperatingSystems() -->
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
		Macintosh <form:checkbox path="operatingSystems" value="Macintosh"/>
		
		<br><br>
		
		<input type="submit" value="Submit"/>
		
	</form:form>
</body>
</html>