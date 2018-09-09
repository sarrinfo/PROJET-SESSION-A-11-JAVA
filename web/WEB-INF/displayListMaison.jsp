<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : displayListALouer
    Created on : 2018-08-04, 14:51:24
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="jspf/navBar.jspf"></jsp:include>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
        <title>Maison a louer</title>
    </head>
    <body >
         <ul class="pagination justify-content-center">
            <li class="page-item"><a class="page-link" href="#"><</a></li>
            <li class="page-item"><a class="page-link" href="#">1</a></li>
            <li class="page-item"><a class="page-link" href="#">2</a></li>
            <li class="page-item"><a class="page-link" href="#">></a></li>
        </ul> 
         <c:forEach varStatus="list" items="${listImm}">
        <div style="padding : 10px 250px 10px 250px">
            <div class="form-control btn-outline-success">
                <img style="width: 250px " src="images/image${list.index}.jpg" alt="no image"/>
                <p>${list.current.getTypeImmeuble()}</p>
            </div>
        </div>
        </c:forEach>
        <ul class="pagination justify-content-center">
            <li class="page-item"><a class="page-link" href="#"><</a></li>
            <li class="page-item"><a class="page-link" href="#">1</a></li>
            <li class="page-item"><a class="page-link" href="#">2</a></li>
            <li class="page-item"><a class="page-link" href="#">></a></li>
        </ul> 
    </body>
</html>
