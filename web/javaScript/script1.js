/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function autocomplete (){
    $("#iRecherche").keyup(function(){ 
        $.ajax(
        {
            url : "Recherche?action=rechercheRapide&id=" + $("#iRecherche").val(),
            success :  function(data)
            {
                var list = JSON.parse("" + data + "");
                afficheMessage(list);
            }
        }); 
    }); 
} 
   

function afficheMessage(data) {
    if (data.listbien.length > 0)
    {
        for (i = 0; i < data.listbien.length -1; i++)
        {
            
            var td1 = document.createElement("td");
            td1.innerHTML = data.listbien[i].typeBienimmobilier	;
            td1.className = "popupCell";
            
            var td2 = document.createElement("td");
            td2.innerHTML = data.listbien[i].prixLoyer;
            td2.className = "popupCell";
            
            var link = document.createElement("a");
            link.appendChild(td1);
            link.appendChild(td2);
            link.setAttribute("href",
            "Recherche?action=rechercherAppartement&id1="+
                    data.listbien[i].immeubleid+"&id2="+data.listbien[i].bienid+"");
            link.className="popupItem";
            
            var tr = document.createElement("tr");
            tr.appendChild(link);
            
            var r = document.getElementById("iResultat");
            r.getElementsByTagName("tbody")[0].appendChild(tr);
            
        }

    }
}


