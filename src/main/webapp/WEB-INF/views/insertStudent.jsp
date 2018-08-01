<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Student Information</title>
</head>
<body>
	<br>
	<center><h1>Student Information</h1></center>
	<br>

	<form action="save" method="post">
	
		<table align="center">
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" placeholder="Your Name" /></td>
			</tr>
			
			<tr>
				<td>Roll No</td>
				<td><input type="text" name="rollno" placeholder="Your Roll No" /></td>
			</tr>
			
			<tr>
				<td>Age</td>
				<td><input type="text" name="age" placeholder="Your Age" /></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Add Student" /></td>
			</tr>		
		
		</table>
	
	
	
	
	</form>



</body>
</html>