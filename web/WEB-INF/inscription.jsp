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
        </head>

        <body>
            <h1 class="text-center">
                a completer
            </h1>
            <div class="container pt-3">
                <div class="row justify-content-center">
                    <div class="col-sm-6 col-md-4">
                        <div id="fConnexiAon" class="card border-info text-center">
                            <div class="card-header">

                                <h3> INSCRIPTION </h3>
                            </div>
                            <div class="card-body">
                                <img>
                                <h4 class="text-center">Bienvenue</h4>
                                <form class="form-signin" action="Inscription" name="Formulaire" onsubmit="return verifForm(this)" method="post">
                                <input class="form-control mb-2" type="text" name="email" placeholder="Courriel "  onblur="verifMail(this)">
                                <span id="email"></span>
                                <span class="erreur">${form.erreurs['email']}</span>
                                <input class="form-control mb-2" type="password" minlength="8" name="motdepasse" placeholder="Mot de passe minimum 8 caracteres"onblur="verifPWD(this)" >
                                <span id="motdepasse"></span>
                                <span class="erreur">${form.erreurs['motdepasse']}</span>
                                <input class="form-control mb-2" type="password" minlength="8" name="confirmation" placeholder="Repetez mot de passe"onblur="verifConfirmation(this)" />
                                <span id="confirmation"></span>
                                <span class="erreur">${form.erreurs['confirmation']}</span>
                                <input class="form-control mb-2" type="text"   name="nom" placeholder="Votre nom" size="30" />
                                <input class="form-control mb-2" type="text"   name="prenom" placeholder="Votre prenom" />
                                <span id="nom"></span>
                                <span class="erreur">${form.erreurs['nom']}</span>
                                <input class="form-control mb-2" type="text"   name="nom" placeholder="Telephone" />
                                <button type="submit" class="btn btn-outline-dark btn-lg btn-block mb-1">Enregistrer</button>
                                <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
                            </form>	
                        </div>
                    </div>
                </div>
            </div>
        </div >
    </body>
</html>
