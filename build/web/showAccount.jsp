<%-- 
    Document   : showAccount
    Created on : Mar 24, 2018, 3:56:19 PM
    Author     : htp06
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account</title>
    </head>
    <body>
        <h1>Account List</h1>
        <table border="1" cellpadding="5px">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>User Name</th>
                    <th>Password</th>
                    <th>Phone</th>
                    <th>Email</th>
                    <th>Role</th>
                    <th>Date Created</th>
                    <th>Date Updated</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="acc" items="${list}">
                    <tr>
                        <td>${acc.accountID}</td>
                        <td>${acc.userName}</td>
                        <td>${acc.password}</td>
                        <td>${acc.phone}</td>
                        <td>${acc.email}</td>
                        <td>${acc.role}</td>
                        <td>${acc.dateCreated}</td>
                        <td>${acc.dateUpdated}</td>
                        <td>
                            <a href="ShowAccountDetailServlet?id=${acc.accountID}">Details</a>&nbsp;|&nbsp;
                            <a href="UpdateDetailServlet?id=${acc.accountID}">Update</a>&nbsp;|&nbsp;
                            <a href="DeleteAccountServlet?id=${acc.accountID}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
