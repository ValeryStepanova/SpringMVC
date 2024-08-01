
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorization Page</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/authorization">
    <label for="name">Username</label>
    <input type="text" id="name" name="name">
    <label for="surname">Surname</label>
    <input type="text" id="surname" name="surname">
    <button type="submit">Save</button>
</form>
</body>
</html>
