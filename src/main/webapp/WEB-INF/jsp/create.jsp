<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <c:form method="post" action="create" modelAttribute="student">
        <c:label path="firstName">First Name:</c:label>
        <c:input path="firstName"/>
        <c:label path="lastName">Last Name:</c:label>
        <c:input path="lastName"/>
        <input type="submit"/>
    </c:form>
</body>
</html>