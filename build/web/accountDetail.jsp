<%-- 
    Document   : AccountDetail
    Created on : Mar 24, 2018, 3:56:33 PM
    Author     : htp06
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Detail</title>
        </head>
    <body>
        <h1>${acc.userName}</h1>
        <h3>Basic Information</h3>
        <ul>
            <li>${acc.accountID}</li>
            <li>${acc.userName}</li>
            <li>${acc.password}</li>
            <li>${acc.email}</li>
            <li>${acc.role}</li>
            <li>${acc.dateCreated}</li>
            <li>${acc.dateUpdated}</li>
        </ul>
    </body>
</html>
