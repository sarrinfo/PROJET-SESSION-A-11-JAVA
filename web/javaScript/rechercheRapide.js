/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function searchParLocalite() {   
    var listLocalite = [
    "Cote des neiges",
    "Montreal Nord",
    "Saint Laurent",
    "Saint Leonard",
    "Cote Vertu",
    "Dame des graces",
    "Montreal",
    "Quebec"              
    ];
    
    $(function () {
        $.each(listLocalite, function(index, value){ 
        alert(value);
        });        
    });
};

function choix(){
    document.getElementById("choix").id = "visible";
}
function searchParType(){
    document.getElementById("visible").id = "choix";
    document.getElementById("selectType").id = "visible";
}
function searchParLocalite(){
    document.getElementById("visible").id = "choix";
    document.getElementById("selectLocalite").id = "visible";
}

function searchSecteur(){
    document.getElementById("visible").id = "selectLocalite";
         $("#bla").submit(); 
}

