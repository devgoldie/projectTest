<%-- 
    Document   : customer
    Created on : Mar 24, 2018, 4:31:37 PM
    Author     : htp06
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer</title>
    </head>
    <body>
        <h1>Customer List</h1>
        <table border="1" cellpadding="5px">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>User Name</th>
                    <th>Password</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Date Of Birth</th>
                    <th>Date Created</th>
                    <th>Date Updated</th>
                    <th>Gender</th>
                    <th>Phone 1</th>
                    <th>Phone 2</th>
                    <th>Points</th>
                    <th>Membership</th>
                    <th>Discount Value</th>
                    <th>Free Shipping</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="cus" items="${list}">
                    <tr>
                        <td>${cus.customerID}</td>
                        <td>${cus.userName}</td>
                        <td>${cus.password}</td>
                        <td>${cus.firstName}</td>
                        <td>${cus.lastName}</td>
                        <td>${cus.email}</td>
                        <td>${cus.dateOfBirth}</td>
                        <td>${cus.dateCreated}</td>
                        <td>${cus.dateUpdated}</td>
                        <td>${cus.gender}</td>
                        <td>${cus.phone1}</td>
                        <td>${cus.phone2}</td>
                        <td>${cus.points}</td>
                        <td>${cus.membership}</td>
                        <td>${cus.discountValue}</td>
                        <td>${cus.freeShipping}</td>
                        <td>
                            <a href="ShowCustomerDetailServlet?id=${cus.customerID}">Details</a>&nbsp;|&nbsp;
                            <a href="UpdateDetailServlet?id=${cus.customerID}">Update</a>&nbsp;|&nbsp;
                            <a href="DeleteCustomerServlet?id=${cus.customerID}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
