<%-- 
    Document   : customerDetail
    Created on : Mar 24, 2018, 4:31:50 PM
    Author     : htp06
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Detail</title>
    </head>
    <body>
        <h1>${cus.userName}</h1>
        <h3>Basic Information</h3>
        <ul>
            <li>ID: ${cus.customerID}</li>
            <li>Name: ${cus.userName}</li>
            <li>Pass: ${cus.password}</li>
            <li>Email: ${cus.email}</li>
            <li>First name: ${cus.firstName}</li>
            <li>Last name: ${cus.lastName}</li>
            <li>D.O.B: ${cus.dateOfBirth}</li>
            <li>Address: ${cusAdd.number} ${cusAdd.street}, ${cusAdd.ward}, ${cusAdd.district}, ${cusAdd.city}</li>
            <li>Created: ${cus.dateCreated}</li>
            <li>Updated: ${cus.dateUpdated}</li>
            <li>Gender: ${cus.gender}</li>
            <li>Phone1: ${cus.phone1}</li>
            <li>Phone2: ${cus.phone2}</li>
            <li>Points: ${cus.points}</li>
            <li>Membership: ${cus.membership}</li>
            <li>Discount: ${cus.discountValue}</li>
            <li>Free Ship: ${cus.freeShipping}</li>
        </ul>
    </body>
</html>
