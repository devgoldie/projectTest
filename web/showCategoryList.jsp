<%-- 
    Document   : showCategoryList
    Created on : Mar 21, 2018, 7:53:49 PM
    Author     : NATSAMA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Category</title>
    </head>
    <body>
        <h1>Category List</h1>
        <ul>
            <c:forEach items="${mainCategory}" var="mainCategory">
                <li>
                    ${mainCategory.categoryName}
                    <c:if test="${not empty mainCategory.categoryCollection}">
                        <ul>
                            <c:forEach items="${mainCategory.categoryCollection}" var="subCategory">
                                <li>
                                    ${subCategory.categoryName}
                                </li>
                            </c:forEach>
                        </ul>
                    </c:if>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
