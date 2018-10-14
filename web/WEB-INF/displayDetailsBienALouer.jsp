<%-- 
    Document   : displayDetailsBienALouer
    Created on : 2018-08-04, 14:52:34
    Author     : User
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="nav.jsp"></jsp:include>
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

                                    <img style="width: 730px; height:390px " src="images/image/${listDetail.current.getId().getImmeubleid()}.jpg" alt=""/>

                                </div>
                            </div>
                            <div class="col-sm-4">
                                <div class="cellule moyen">
                                    <h3 style="text-align: center">COSSEPRIM</h3><br>
                                    <p>${listDetail.current.annonces}</p><br>
                                    <p>Code : ${listDetail.current.getId().getImmeubleid()}</p><br>
                                    <p>Contact : 514-323-8323</p><br> 
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
                            <img class="image" style="width: 150px; height: 100px" src="images/image2.jpg" alt=" " >
                            <div class="carousel-caption">

                            </div>   
                        </div>
                        <div class="col-sm-2">
                            <img class="image"  style="width: 150px; height: 100px" src="images/image3.jpg" alt=" " >
                            <div class="carousel-caption">
                            </div>   
                        </div>
                        <div class="col-sm-2">
                            <img class="image" style="width: 150px; height: 100px"  src="images/image4.jpg" alt=" " >
                            <div class="carousel-caption">
                            </div>   
                        </div>
                        <div class="col-sm-2">
                            <img class="image" style="width: 150px; height: 100px"  src="images/image5.jpg" alt=" " >
                            <div class="carousel-caption">
                            </div>   
                        </div>
                        <div class="col-sm-2">
                            <img class="image" style="width: 150px; height: 100px"  src="images/image6.jpg" alt=" " >
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

                        <h3>MEUBLE</h3>

                    </div>
                </div>
            </div >
        </c:forEach>
    </form>
</body>
</html>