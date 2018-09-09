/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var req;
var isIE;
var Rechercher;
var Resultat;
var autoRow;

function init() {
    Rechercher = document.getElementById("iRecherche");
    Resultat = document.getElementById("iResultat");
    autoRow = document.getElementById("auto-row");
    Resultat.style.top = getElementY(autoRow) + "px";
}

function doSearch() {  //ajax
    alert("Hello");
    var url = "Recherche?action=recherche&id=" + escape(Rechercher.value);
    req = initRequest();
    
    req.open("GET", url, true);
    
    req.onreadystatechange = callback;//fonction utilisateur
    
    req.send(null);
}

function initRequest() {
    if (window.XMLHttpRequest) {
        if (navigator.userAgent.indexOf('MSIE') != -1) {
            isIE = true;
        }
        return new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        isIE = true;
        return new ActiveXObject("Microsoft.XMLHTTP");//IE 6 ou 7
    }
}

function callback() {
    clearTable();

    if (req.readyState == 4) {
        if (req.status == 200) {
           
            parseMessages(req.responseXML);  // affichage
            
        }
    }
}

function appendComposer(firstName,lastName,composerId) {

    var row;
    var cell;
    var linkElement;
    
    if (isIE) {
        Resultat.style.display = 'block';
        row = Resultat.insertRow(Resultat.rows.length);
        cell = row.insertCell(0);
    } else {
        Resultat.style.display = 'table';
        row = document.createElement("tr");
        cell = document.createElement("td");
        row.appendChild(cell);
        Resultat.appendChild(row);
    }

    cell.className = "popupCell";

    linkElement = document.createElement("a");
    linkElement.className = "popupItem";
    linkElement.setAttribute("href", "autocomplete?action=lookup&id=" + composerId);
    
    linkElement.appendChild(document.createTextNode(firstName + " " + lastName));
    
    cell.appendChild(linkElement);
}

function clearTable() {
    if (Resultat.getElementsByTagName("tr").length > 0) {
        Resultat.style.display = 'none';
        for (loop = Resultat.childNodes.length -1; loop >= 0 ; loop--) {
            Resultat.removeChild(Resultat.childNodes[loop]);
        }
    }
}

function getElementY(element){
    
    var targetTop = 0;
    
    if (element.offsetParent) {
        while (element.offsetParent) {
            targetTop += element.offsetTop;
            element = element.offsetParent;
        }
    } else if (element.y) {
        targetTop += element.y;
    }
    return targetTop;
}

function parseMessages(responseXML) {
    
    // no matches returned
    if (responseXML == null) {
        return false;
    } else {

        var composers = responseXML.getElementsByTagName("composers")[0];

        if (composers.childNodes.length > 0) {
            Resultat.setAttribute("bordercolor", "black");
            Resultat.setAttribute("class", "liste");
    
            for (loop = 0; loop < composers.childNodes.length; loop++) {
                var composer = composers.childNodes[loop];
                var firstName = composer.getElementsByTagName("firstName")[0];
                var lastName = composer.getElementsByTagName("lastName")[0];
                var composerId = composer.getElementsByTagName("id")[0];
                appendComposer(firstName.childNodes[0].nodeValue,
                    lastName.childNodes[0].nodeValue,
                    composerId.childNodes[0].nodeValue);
            }
        }
    }
}

