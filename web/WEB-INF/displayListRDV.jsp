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
            <title>Design Responsive : Labo 1 - Correction</title>
            <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        </head>
        <body>
            <div > 
                <div class="container">
                    <form  class="text-center" name="fValider" action="Visite" method="POST">

                        <div class="row">
                            <div class="col-sm-9">
                                <div id="main" class="cellule grand">

                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="cellule moyen">
                                    <div>
                                    <c:forEach varStatus="listRDV" items="${listRDV}">
                                        <div >
                                            <div >  
                                                <p><input type="radio" name="dateVisite" value="${listRDV.current.datevisite}" />${listRDV.current.datevisite}</p>
                                            </div>
                                        </div>
                                    </c:forEach>
                                    <div >

                                    </div>
                                </div>
                            </div>
                            <div class="cellule petit">
                                <input class="btn-outline-success" type="submit" value="Annuler" name="bAnnuler" />
                                <input class="btn-outline-success" type="submit" value="valider" name="bValider" />
                            </div>

                        </div>
                    </div>

                </form>
            </div>
        </div > 

    </body>
</html>

