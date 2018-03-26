<%-- 
    Document   : showReview
    Created on : Mar 25, 2018, 6:04:39 PM
    Author     : htp06
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Review List</h1>
        <table border="1" cellpadding="5px">
            <thead>
                <tr>
                    <th>Product ID</th>
                    <th>Customer ID</th>
                    <th>Title</th>
                    <th>Content</th>
                    <th>Rating</th>
                    <th>Date Created</th>
                    <th>Date Updated</th>
                    <th>Admin Response</th>                    
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="rev" items="${list}">
                    <tr>
                        <td>${rev.reviewPK.productID}</td>
                        <td>${rev.reviewPK.customerID}</td>
                        <td>${rev.title}</td>
                        <td>${rev.content}</td>
                        <td>${rev.rating}</td>
                        <td>${rev.adminResponse}</td>
                        <td>${rev.dateCreated}</td>
                        <td>${rev.dateUpdated}</td>
                        <td>
                            <a href="ShowReviewDetailServlet?id=${rev.reviewPK}">Details</a>&nbsp;|&nbsp;
                            <a href="UpdateDetailServlet?id=${rev.reviewPK}">Update</a>&nbsp;|&nbsp;
                            <a href="DeleteReviewServlet?id=${rev.reviewPK}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
