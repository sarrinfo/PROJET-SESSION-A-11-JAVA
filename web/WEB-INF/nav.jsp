<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootsrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
        <script src="javaScript/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="javaScript/script.js"></script>
        <script type="text/javascript" src="javaScript/script1.js"></script>
        <script src="javaScript/rechercheRapide.js" type="text/javascript"></script>
    </head>
    <body >
        <nav class="navbar navbar-expand-lg navbar-light bg-light ">
            <a class="navbar-brand" href="ListesBiens"><img src="images/logo.jpg" alt="Logo" ></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <fmt:setLocale value="${langue}"/>    
            <fmt:bundle basename="Internationalisation">
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto ">
                        <li class="nav-item active">
                            <a class="nav-link" href="ControleurPrincipale?action=acceuil"> <fmt:message key="acceuil"/></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="ControleurPrincipale?action=appartement"><fmt:message key="location"/></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="ControleurPrincipale?action=appartement"><fmt:message key="vente"/></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="ControleurPrincipale?action=appartement"><fmt:message key="construction"/></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="ControleurPrincipale?action=appartement"><fmt:message key="projet"/></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="ControleurPrincipale?action=appartement"><fmt:message key="outils"/></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="ControleurPrincipale?action=appartement"><fmt:message key="contact"/></a>
                        </li>
                    </ul>

                    <div class="collapse nav navbar-nav" id="bar" >
                        <form class="navbar-form navbar-right" role="search">
                            <div class="form-group" >
                                <input type="text" class="form-control" placeholder="Search" size="30" onclick="choix()"/>
                            </div>
                        </form>
                        <div id="choix" class="form-control">
                            <label for="choixType">Type</label>
                            <input type="radio" name="choix" id="choixType" value="type"  onclick="searchParType()">
                            <label for="choixPrix">Prix</label>
                            <input type="radio" name="choix" id="choixPrix" value="prix">
                            <label for="choixLocalite">Localite</label>
                            <input type="radio" name="choix" id="choixLocalite" value="localite" onclick="searchParLocalite()">
                        </div>
                        <div id="selectType" class="form-control" size="30">
                            <label for="rAppartement">Appartement</label>
                            <input type="radio" name="selectType" id="rAppartement" value="type" checked="checked">
                            <label for="rBureau">Bureau</label>
                            <input type="radio" name="selectType" id="rBureau" value="prix">
                            <label for="rMaison">Maison</label>
                            <input type="radio" name="selectType" id="rMaison" value="localite">
                        </div>
                        <div id="selectLocalite" class="form-control">
                            <select onchange="searchSecteur()">
                                <option>Cote des neiges</option>
                                <option>Montreal Nord</option>
                                <option>Pie IX</option>
                                <option>Saint Laurent</option>
                                <option>Saint Leonard</option>
                            </select>
                        </div>        
                    </div>

                    <div class="form-group">
                        <a class="btn btn-default btn-outline btn-circle collapsed"   href="connexion.html" aria-controls="nav-collapse3"><fmt:message key="connect"/></a>
                    </div>
                </div>
        </nav>
                    </fmt:bundle> 
    </body >
</html>
