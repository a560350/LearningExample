 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Check Box Test</title>
</head>
<body>
<form action="listData" method="post">
<table align="center">
<tr>
<td>Select An Item :</td>
<td> <select name="comments" multiple>
<option value="comment1">I am an intelligent</option>
<option value="comment2">I am a brave person</option>
<option value="comment3">I am a hard worker</option>
<option value="comment4">I am a timid person</option>
</select>
</td>
</tr>
<tr>
<td><input type="submit" value="Send"></td>
<td></td>
</tr>
</table>
</form>
</body>
</html>