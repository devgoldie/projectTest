<%-- 
    Document   : showProduct
    Created on : Mar 21, 2018, 6:09:00 PM
    Author     : NATSAMA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>
    </head>
    <body>
        <h1>Product List</h1>
        <table border="1" cellpadding="5px">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Product Name</th>
                    <th>Product Description</th>
                    <th>Units in Stock</th>
                    <th>Units on Order</th>
                    <th>Base Price</th>
                    <th>Unit Price</th>
                    <th>Date Created</th>
                    <th>Date Updated</th>
                    <th>Discontinued</th>
                    <th>Collection ID</th>
                    <th>Discount ID</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="product" items="${list}">
                    <tr>
                        <td>${product.productID}</td>
                        <td>${product.productName}</td>
                        <td>${product.productDesc}</td>
                        <td>${product.unitsInStock}</td>
                        <td>${product.unitsOnOrder}</td>
                        <td>${product.basePrice}</td>
                        <td>${product.unitPrice}</td>
                        <td>${product.dateCreated}</td>
                        <td>${product.dateUpdated}</td>
                        <td>${product.discontinued}</td>
                        <td>${product.colID.colName}</td>
                        <td>${product.discountID.discountName}</td>
                        <td>
                            <a href="ShowProductDetailServlet?id=${product.productID}">Details</a>&nbsp;|&nbsp;
                            <a href="UpdateDetailServlet?id=${product.productID}">Update</a>&nbsp;|&nbsp;
                            <a href="DeleteProductServlet?id=${product.productID}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
