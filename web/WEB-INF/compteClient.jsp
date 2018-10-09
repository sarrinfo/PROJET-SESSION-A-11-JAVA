<%-- 
    Document   : compteClient
    Created on : 2018-10-08, 16:42:50
    Author     : SARRINFO
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <c:if test="${ListVisite.size() > 0}">
            <h1>Liste de vous rendez prevu</h1>
            <table class="text-center">
                <thead>
                    <tr >
                        <th>Numero</th>
                        <th>Date visite</th>
                        <th>Type du bien</th>
                        <th>Nom</th>
                        <th>Prenom</th>
                        <th>Autres</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach varStatus="ListVisite" items="${ListVisite}">
                        <tr>
                            <td>${ListVisite.index+1}</td> 
                            <td>${ListVisite.current.toString()}</td>                
                            <td>${ListVisite.current.bienimmobilier.typeBienimmobilier}</td>
                            <td>${ListVisite.current.employe.nom}</td>
                            <td>${ListVisite.current.employe.prenom}</td>
                            <td>
                                <form class="row" action="Visite">
                                    <input type="hidden" name="action" value="supprimer" />
                                    <input type="hidden" name="index" value="${ListVisite.index}" />
                                    <a href="Visite?action=supprimer&index=${ListVisite.index}">
                                        <img src="images/poubelle.png" alt=""/>
                                    </a>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <form class="navbar-right" action="Visite">
                <input type="hidden" name="action" value="terminer" /><br><br><br>
                <input class="btn-outline" type="submit" value="Terminer" />
            </form>
        </c:if>
    </body>
</html>
