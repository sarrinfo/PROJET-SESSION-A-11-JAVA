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
            <div > 
                <div class="container"> 
                     <form  name="fRDV" action="Recherche" method="POST">
                        <c:forEach varStatus="listDetail" items="${listDetail}">
                    <div class="row">
                            <div class="col-sm-8">
                                <div id="main" class="cellule grand">

                                    <img style="width: 730px; height:390px " src="images/image1.jpg" alt=""/>

                                </div>
                            </div>
                            <div class="col-sm-4">
                                <div class="cellule moyen">

                                </div>
                                <div class="cellule petit">
                                    <input class="btn-outline-success" type="submit" value="Prendre rendez-vous" name="bRDV" />
                                </div>

                            </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-2">
                            <img class="image" style="width: 150px; height: 100px" src="images/image1.jpg" alt=" " >
                            <div class="carousel-caption">
                            </div>   
                        </div>
                        <div class="col-sm-2">
                            <img class="image" style="width: 150px; height: 100px" src="images/image1.jpg" alt=" " >
                            <div class="carousel-caption">

                            </div>   
                        </div>
                        <div class="col-sm-2">
                            <img class="image"  style="width: 150px; height: 100px" src="images/image1.jpg" alt=" " >
                            <div class="carousel-caption">
                            </div>   
                        </div>
                        <div class="col-sm-2">
                            <img class="image" style="width: 150px; height: 100px"  src="images/image1.jpg" alt=" " >
                            <div class="carousel-caption">
                            </div>   
                        </div>
                        <div class="col-sm-2">
                            <img class="image" style="width: 150px; height: 100px"  src="images/image1.jpg" alt=" " >
                            <div class="carousel-caption">
                            </div>   
                        </div>
                        <div class="col-sm-2">
                            <img class="image" style="width: 150px; height: 100px"  src="images/image1.jpg" alt=" " >
                            <div class="carousel-caption">
                            </div>   
                        </div>

                    </div>

                    <div class="row form-text">


                        <input type="hidden" name="action" value="visite" />
                        <input type="hidden" name="bien" value="${listDetail.current.id.bienid}" />
                        <div >
                            <p>Loyer mensuel : ${listDetail.current.prixLoyer} $</p>
                            <p>Type de l'Apprtement : ${listDetail.current.typeBienimmobilier}</p>
                        </div>


                    </div>
                    <div class="row form-text">

                        <h3>MAISON A VENDRE</h3>

                    </div>
                </div>
            </div >
        </c:forEach>
    </form>
</body>
</html>