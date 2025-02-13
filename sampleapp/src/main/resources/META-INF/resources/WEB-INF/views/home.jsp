<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample JSP</title>
</head>
<body>
<h1>Hello from JSP!</h1>
<form method="post" action="saveItem">
 
Enter item name <br/>
<input type='text' name='itemname'/><br/>
 
Enter price
<input type='text' name='price'/><br/>
<input type='submit' value='save'/>
</form>
<form method="get" action="saveBill">
 
Enter bill name <br/>
<input type='text' name='billno'/><br/>
 
Enter price
<input type='text' name='price'/><br/>
<input type='submit' value='save'/>
</form>
</body>
</html>