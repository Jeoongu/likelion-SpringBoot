<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>View Profiles</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Occupation</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${profiles}" var="profile">
                    <tr>
                        <td>${profiles.name}</td>
                        <td>${profiles.age}</td>
                        <td>${profiles.occupation}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>