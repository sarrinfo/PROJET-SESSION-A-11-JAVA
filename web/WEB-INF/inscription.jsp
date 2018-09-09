<%-- 
    Document   : inscription
    Created on : 2018-08-03, 14:19:44
    Author     : SARRINFO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="jspf/navBar.jspf"></jsp:include>
<!DOCTYPE html>
<html>
    <head>
        <title >Recommencez inscription</title>
        <script type="text/javascript" src="javaScript/script.js"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css"> 
    </head>

    <body>
        <div >
            <form action="Inscription" name="Formulaire" onsubmit="return verifForm(this)" method="post">
                </br>
                <label>Identifiant :</label> <input type="text" name="email" placeholder="ex :123@yahoo.com" size="30" onblur="verifMail(this)"></ol>
                <span class="obligatoire"> *</span>
                <span id="email"></span>
                <span class="erreur">${form.erreurs['email']}</span>
                </br></br></br>
                <label>Mot de passe :</label><input type="password" minlength="8" name="motdepasse" size="30" placeholder="minimum 8 caracteres"onblur="verifPWD(this)" >
                <span class="obligatoire"> *</span>
                <span id="motdepasse"></span>
                <span class="erreur">${form.erreurs['motdepasse']}</span>
                </br></br></br>
                <label>Confirmation mot de passe :</label><input type="password" minlength="8" name="confirmation" size="30" placeholder="Repetez mot de passe"onblur="verifConfirmation(this)" />
                <span class="obligatoire"> *</span>
                <span id="confirmation"></span>
                <span class="erreur">${form.erreurs['confirmation']}</span>
                </br></br></br>
                 <label>Nom : </label><input type="text"   name="nom" placeholder="Votre nom utilisateur" size="30" onblur="verifNom(this)" />
                <span class="obligatoire"> *</span>
                <span id="nom"></span>
                <span class="erreur">${form.erreurs['nom']}</span>
                </br></br></br>
                <label> Soumettre : </label><button type="submit" name="mEnvoyer" value="Envoyer" >Envoyer</button>
                </br></br></br>
                <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
            </form>	
        </div>
    </body>
</html>
