<%-- 
    Document   : bienvenue
    Created on : 2018-08-03, 15:15:29
    Author     : SARRINFO
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="jspf/navBar.jspf"></jsp:include>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SEN IMMOBILIER</title>
    </head>
    <body>
        <h1>Bienvenue : <c:out value="${sessionScope.sessionUtilisateur.email}"/> </h1>
    </body>
</html>
