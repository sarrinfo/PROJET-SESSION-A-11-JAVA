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
            <title>Liste des rendez vous</title>
            <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        </head>
        <body>
            <div > 
                <div class="container">


                    <div class="row">
                        <div class="col-sm-9">
                            <div id="main" class="cellule grand">
                            <jsp:include page="compteClient.jsp"></jsp:include>
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <form  class="text-center" name="fValider" action="Visite" method="POST">
                                <div class="cellule moyen">

                                    <div>
                                    <c:forEach varStatus="listRDV" items="${listRDV}">
                                        <div >
                                            <div >  
                                                <p><input type="radio" checked="checked" name="dateVisite" value="${listRDV.current.toString()}" />${listRDV.current.toString()}</p>
                                            </div>
                                        </div>
                                    </c:forEach>
                                    <div >

                                    </div>
                                </div>
                            </div>
                            <div class="cellule petit">
                                <input type="hidden" value="Ajouter" name="action" />
                                <input class="btn-outline-success" type="submit" value="Ajouter" name="bAjouter" />
                                <a href="ControleurPrincipale?action=appartement">Nouvel recherche</a>
                                <c:if test="${empty message}">
                                    <p>${message}<p>
                                    </c:if>
                            </div>
                        </form>        
                    </div>
                </div>


            </div>
        </div > 

    </body>
</html>

