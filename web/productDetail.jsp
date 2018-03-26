<%-- 
    Document   : productDetail
    Created on : Mar 22, 2018, 10:41:41 AM
    Author     : NATSAMA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Detail</title>
    </head>
    <body>
        <h1>${product.productName}</h1>
        <h3>Basic Information</h3>
        <ul>
            <li>${product.productID}</li>
            <li>${product.productName}</li>
            <li>${product.productDesc}</li>
            <li>${product.unitsInStock}</li>
            <li>${product.unitsOnOrder}</li>
            <li>${product.basePrice}</li>
            <li>${product.unitPrice}</li>
            <li>${product.dateCreated}</li>
            <li>${product.dateUpdated}</li>
            <li>${product.discontinued}</li>
            <li>${product.colID.colName}</li>
            <li>${product.discountID.discountName}</li>
        </ul>
        <h3>Detailed Information</h3>
        <table border="1">
            <tr>
                <td>Category</td>
                <td>
                    <ul>
                        <c:forEach items="${product.categoryCollection}" var="category">
                            <li>${category.categoryName}</li>
                        </c:forEach>
                    </ul>
                </td>
            </tr>
            <c:forEach items="${product.variantCollection}" var="variant">
                <tr>
                    <td>${variant.variantGroupID.variantGroupName}</td>
                    <td>${variant.variantValue}</td>
                </tr>     
            </c:forEach>
                <tr>
                    <td>Ring Size Available</td>
                    <td>
                        <c:forEach items="${product.ringSizeCollection}" var="ringsize">
                            ${ringsize.ringSizeValue}&nbsp;
                        </c:forEach>
                    </td>
                </tr>
        </table>
        
        <h3>Customer's Review</h3>
        <c:if test="${not empty product.reviewCollection}">
            <c:forEach items="${product.reviewCollection}" var="review">
                <strong>${review.customer.userName}</strong><br/>
                <strong>Rating: ${review.rating} stars</strong><br/>
                ${review.content}<br/>
            </c:forEach>
        </c:if>
    </body>
</html>
