<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>LIST</h1>
    <ul>
        <c:forEach items="${students}" var="student">
            <li>${student.getFirstName()}</li>
        </c:forEach>
    </ul>