<%-- 
    Document   : connexion
    Created on : 2018-08-01, 17:09:36
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="jspf/navBar.jspf"></jsp:include>
    <!DOCTYPE html>
    <html>
        <head>
            <title >Recommencez</title>
        </head>

        <body>
            <div class="container pt-3">
                <div class="row justify-content-center">
                    <div class="col-sm-6 col-md-4">
                        <div id="fConnexion" class="card border-info text-center">
                            <div class="card-header">

                                </br>CONNEXION </br>
                            </div>
                            <div class="card-body">
                                <img>
                                <h4 class="text-center">Bienvenue</h4>
                                <form class="form-signin" action="<c:url value="/Connexion" />" name="Formulaire" onsubmit="return verifForm(this)" method="post">

                                <input class="form-control mb-2" type="text" id="email" name="email" placeholder="ex :123@yahoo.com" value="${utilisateur.email}" size="30" onblur="verifMail(this)">

                                <input class="form-control mb-2" id="motdepasse" type="password" minlength="8" name="motdepasse" size="30" placeholder="minimum 8 caracteres"onblur="verifPWD(this)">
                                <button type="submit" class="btn btn-outline-dark btn-lg btn-block mb-1" >Connecter</button>
                                <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
                                <c:choose>
                                    <c:when test="${!empty sessionScope.sessionUtilisateur}">
                                        <p class="succes">
                                            Vous etes connectée(e) avec l'adresse : ${sessionScope.sessionUtilisateur.email}
                                        </p>
                                    </c:when>
                                    <c:when test="${empty sessionScope.sessionUtilisateur}">
                                        <p class="erreur">
                                            Le mot de passe ou l'indenfiant est incorrect
                                        </p>
                                    </c:when>

                                </c:choose>
                            </form>
                        </div>
                    </div>
                    <a href="inscription.html" class="float-right">Creer un compte</a>
                </div>
            </div>
        </div >

    </body>
</html>
