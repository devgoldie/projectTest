<%-- 
    Document   : showCustomerAddress
    Created on : Mar 24, 2018, 5:07:37 PM
    Author     : htp06
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Address</title>
    </head>
    <body>
        <h1>Customer's Address List</h1>
        <table border="1" cellpadding="5px">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Customer</th>
                    <th>Number</th>
                    <th>Street</th>
                    <th>Ward</th>
                    <th>District</th>
                    <th>City</th>
                    <th>Date Created</th>
                    <th>Date Updated</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="cusAddress" items="${list}">
                    <tr>
                        <td>${cusAddress.addressID}</td>
                        <td>${cusAddress.customerID.userName}</td>
                        <td>${cusAddress.number}</td>
                        <td>${cusAddress.street}</td>
                        <td>${cusAddress.ward}</td>
                        <td>${cusAddress.district}</td>
                        <td>${cusAddress.city}</td>
                        <td>Date created</td>
                        <td>Date updated</td>
                        <td>
                            <a href="ShowAddressDetailServlet?id=${cusAddress.addressID}">Details</a>&nbsp;|&nbsp;
                            <a href="UpdateDetailServlet?id=${cusAddress.addressID}">Update</a>&nbsp;|&nbsp;
                            <a href="DeleteAddressServlet?id=${cusAddress.addressID}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
