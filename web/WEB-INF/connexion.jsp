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
        <script type="text/javascript" src="javaScript/script.js"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css"> 
    </head>

    <body>
        <p class='Compte'>
        <a href="Deconnexion">Deconnexion / </a>
        </p>
        <div >
            <h1>CONNEXION</h1>
            <form action="<c:url value="/Connexion" />" name="Formulaire" onsubmit="return verifForm(this)" method="post">
                </br>
                <label>Identifiant :</label> <input type="text" name="email" placeholder="ex :123@yahoo.com" value="${utilisateur.email}" size="30" onblur="verifMail(this)"></ol>
                <span class="obligatoire"> *</span>
                <span id="email"></span>
                <span class="erreur">${form.erreurs['email']}</span>
                </br></br></br>
                <label>Mot de passe :</label><input type="password" minlength="8" name="motdepasse" size="30" placeholder="minimum 8 caracteres"onblur="verifPWD(this)" >
                <span class="obligatoire"> *</span>
                <span id="motdepasse"></span>
                <span class="erreur">${form.erreurs['motdepasse']}</span>
                </br></br></br>
                <label> Soumettre : </label><button type="submit" name="mEnvoyer" value="Envoyer" >Envoyer</button>
                </br></br></br>
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
                <a  href="inscription.html">S'inscrire</a>
        </div>
    </body>
</html>
