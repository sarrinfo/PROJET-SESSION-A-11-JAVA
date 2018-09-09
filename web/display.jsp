<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : display
    Created on : 2018-07-28, 15:27:58
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="WEB-INF/jspf/navBar.jspf"></jsp:include>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="javaScript/script1.js"></script>
        <title>Acceuil</title>
    </head>
    <body >


        <div id="demo" class="carousel slide" data-ride="carousel">
            <ul class="carousel-indicators">
                <li data-target="#demo" data-slide-to="0" class="active"></li>
                <li data-target="#demo" data-slide-to="1"></li>
                <li data-target="#demo" data-slide-to="2"></li>
                <li data-target="#demo" data-slide-to="3"></li>
                <li data-target="#demo" data-slide-to="4"></li>
                <li data-target="#demo" data-slide-to="5"></li>
                <li data-target="#demo" data-slide-to="6"></li>
                <li data-target="#demo" data-slide-to="7"></li>
                <li data-target="#demo" data-slide-to="8"></li>
                <li data-target="#demo" data-slide-to="9"></li>
            </ul>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="image" src="images/image0.jpg" alt=" ">
                    <div class="carousel-caption">
                        <h3>LOUER UN APPARTEMENT</h3>
                        <p>sacre coeur 3</p>
                    </div>   
                </div>
                <div class="carousel-item">
                    <img class="image" src="images/image1.jpg" alt=" " >
                    <div class="carousel-caption">
                        <a href="WEB-INF/displayListMaison.jsp"></a>
                        <h3>MAISON A VENDRE</h3>
                        <p>Almadies bord de la mer</p>
                    </div>   
                </div>
                <div class="carousel-item">
                    <img  class="image" src="images/image2.jpg" alt="image2" >
                    <div class="carousel-caption">
                        <h3>CHANTIER PAS A PAS</h3>
                        <p>suivre son évolution en temps réel</p>
                    </div>   
                </div>
                <div class="carousel-item">
                    <img class="image" src="images/image3.jpg" alt=" ">
                    <div class="carousel-caption">
                        <h3>LOUER UN APPARTEMENT</h3>
                        <p>sacre coeur 3</p>
                    </div>
                </div>   

                <div class="carousel-item">
                    <img class="image" src="images/image4.jpg" alt=" " >
                    <div class="carousel-caption">
                        <h3>MAISON A VENDRE</h3>
                        <p>Almadies bord de la mer</p>
                    </div>   
                </div>
                <div class="carousel-item">
                    <img  class="image" src="images/image5.jpg" alt=" ">
                    <div class="carousel-caption">
                        <h3>CHANTIER PAS A PAS</h3>
                        <p>suivre son évolution en temps réel</p>
                    </div>   
                </div>
                <div class="carousel-item">
                    <img class="image" src="images/image6.jpg" alt=" " >
                    <div class="carousel-caption">
                        <h3>LOUER UN APPARTEMENT</h3>
                        <p>sacre coeur 3</p>
                    </div>   
                </div>
                <div class="carousel-item">
                    <img class="image" src="images/image7.jpg" alt=" " >
                    <div class="carousel-caption">
                        <h3>MAISON A VENDRE</h3>
                        <p>Almadies bord de la mer</p>
                    </div>   
                </div>
                <div class="carousel-item">
                    <img  class="image" src="images/image8.jpg" alt=" " >
                    <div class="carousel-caption">
                        <h3>CHANTIER PAS A PAS</h3>
                        <p>suivre son évolution en temps réel</p>
                    </div>   
                </div>
                <div class="carousel-item">
                    <img  class="image" src="images/image9.jpg" alt=" " >
                    <div class="carousel-caption">
                        <h3>CHANTIER PAS A PAS</h3>
                        <p>suivre son évolution en temps réel</p>
                    </div>   
                </div>
            </div>
            <a class="carousel-control-prev" href="#demo" data-slide="prev">
                <span class="carousel-control-prev-icon"></span>
            </a>
            <a class="carousel-control-next" href="#demo" data-slide="next">
                <span class="carousel-control-next-icon"></span>
            </a>      
            <div id="recherche" class="carousel-caption" >

                <form name="autofillform" action="Recherche">
                    <table border="0" cellpadding="5"> 
                        <tbody>
                            <tr>
                                <td>
                                    <input type="text" size="80" placeholder="Rechercher par : Ville, region, secteur, rue" id="iRecherche" onkeyup="doSearch()">
                                </td>
                            </tr>
                            <tr>
                                <td id="auto-row" colspan="2">
                                    <table id="iResultat" class="popupBox" />
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>

    </body>
</html>
