<%-- 
    Document   : displayDetailsBienALouer
    Created on : 2018-08-04, 14:52:34
    Author     : User
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="jspf/navBar.jspf"></jsp:include>
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Details Appartement</title>
        </head>
        <body>
            <form  style="text-align: right" name="fRDV" action="Recherche" method="POST">
            <c:forEach varStatus="listDetail" items="${listDetail}">

                <input type="hidden" name="action" value="visite" />
                <input type="hidden" name="bien" value="${listDetail.current.id.bienid}" />

                <div style="padding : 10px 250px 10px 250px">
                    <div class="form-control btn-outline-success">
                        <span>
                            <img style="width: 250px " src="images/image${listDetail.index}.jpg" alt=""/>
                            <p>Loyer mensuel : ${listDetail.current.prixLoyer} $</p>
                            <p>Type de l'Apprtement : ${listDetail.current.typeBienimmobilier}</p>
                        </span>
                    </div>

                    <div class="form-control btn-outline-success">
                        <p>A completer par une liste de photos de l'appartement</p>
                    </div>
                </div>
            </c:forEach>
            <div style="padding : 10px 250px 10px 250px">
                <input class="btn-outline-success" type="submit" value="Prendre rendez-vous" name="bRDV" />
            </div>
        </form> 
    </body>
</html>
