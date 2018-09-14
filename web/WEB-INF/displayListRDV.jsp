<%-- 
    Document   : displayListRDV
    Created on : 2018-09-13, 19:59:31
    Author     : SARRINFO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="jspf/navBar.jspf"></jsp:include>
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Liste Rendez Vous Disponible</title>
        </head>
        <body>
            <form  style="text-align: right" name="fValider" action="#" method="POST">
            <c:forEach varStatus="listRDV" items="${listRDV}">
                <div style="padding : 10px 250px 10px 250px">
                    <div class="form-control btn-outline-success">  
                        <p><input type="radio" name="action" value="${listRDV.current.datevisite}" />${listRDV.current.datevisite}</p>
                    </div>
                </div>
            </c:forEach>
            <div style="padding : 10px 250px 10px 250px">
                <input class="btn-outline-success" type="submit" value="Annuler" name="bAnnuler" />
                <input class="btn-outline-success" type="submit" value="valider" name="bValider" />
            </div>
        </form>
    </body>
</html>

