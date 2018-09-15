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
            <title>Biens a louer</title>
        </head>
        <body >
            <ul class="pagination justify-content-center">
                <li class="page-item"><a class="page-link" href="#"><</a></li>
                <li class="page-item"><a class="page-link" href="#">1</a></li>
                <li class="page-item"><a class="page-link" href="#">2</a></li>
                <li class="page-item"><a class="page-link" href="#">></a></li>
            </ul> 
            <div class="container">  
            <c:forEach varStatus="list" items="${listApp}">
                <div class="form-control btn-outline-primary">
                    <div class="row ">
                        <div class="col-sm-3">
                            <a href="Recherche?action=rechercherAppartement&id1=${list.current.getId().getImmeubleid()}&id2=${list.current.getId().getBienid()}">
                                <img style="width: 250px; height: 175px" src="images/image${list.index}.jpg" alt=""/>
                            </a>
                        </div>
                        <div class="col-sm-9">
                            <div class="row">
                                <div class="col-sm-10">
                                    <p>afficher le titre de l'annonce</p>
                                    <p>le type de biens</p>
                                </div>
                                <div class="col-sm-2">
                                    <p>${list.current.getPrixLoyer()}</p>
                                </div>  
                            </div>
                            <div class="row">
                                <div class="col-sm-10">
                                    <p>afficher la description</p>
                                    <p>afficher la particularite</p>
                                </div>
                                <div class="col-sm-2">
                                    <p>sdb</p>
                                </div> 

                            </div>
                        </div>  
                    </div>
                </div>

            </c:forEach>
        </div > 
        <ul class="pagination justify-content-center">
            <li class="page-item"><a class="page-link" href="#"><</a></li>
            <li class="page-item"><a class="page-link" href="#">1</a></li>
            <li class="page-item"><a class="page-link" href="#">2</a></li>
            <li class="page-item"><a class="page-link" href="#">></a></li>
        </ul> 
    </body>
</html>
