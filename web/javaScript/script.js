/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var formulaire = document.forms.Formulaire;

function surligne(champ, erreur)

{

   if(erreur)
   {
      champ.style.backgroundColor = "#fba";
   }
   else

      champ.style.backgroundColor = "green";

}

//Verifier la longueur d'un mot de passe 

function verifPWD(champ)

{
   if(champ.value.length < 8)

   {
      AfficherErreur(champ);
      surligne(champ, true);
      return false;
   }

   else

   {
      surligne(champ, false);
      return true;
   }

}

//Verifier la longueur d'un mot de passe 

function verifConfirmation(champ)


{
   var PWD = document.getElementById("PWD").value;
    
   if( champ.value != PWD)

   {
      AfficherErreur(champ);
      surligne(champ, true);
      return false;
   }

   else

   {
      surligne(champ, false);
      return true;
   }

}

function verifNom(champ)

{
   if(champ.value.length < 3)

   {
      AfficherErreur(champ);
      surligne(champ, true);
      return false;
   }

   else

   {
      surligne(champ, false);
      return true;
   }

}

/*  fonction qui verifie la valider d'une adresse email*/

function verifMail(champ)
{
   var regex = /^[a-zA-Z0-9._-]+@[a-z0-9._-]{2,}\.[a-z]{2,4}$/;
   if(!regex.test(champ.value))
   {
      AfficherErreur(champ);
      surligne(champ, true);
      return false;
   }
   else
   {
      surligne(champ, false);
      return true;
   }
}

/* fonction qui verifie l'ensemble du formulaire avant envoie*/
function verifForm(f)
{
   
   var mailOk = verifMail(f.email);
   var pseudoOk = verifPWD(f.motdepasse);
   var confirmationOk = verifConfirmation(f.confirmation);
   var nomOk = verifNom(f.nom);
   
//   if(verifMail(f.email)
   if(pseudoOk && mailOk && nomOk && confirmationOk ){
      return true;
  }
   else
   {
      alert("Veuillez remplir correctement tous les champs");
      return false;
   }
}

function verifFormConnection(f)
{
   
   var mailOk = verifMail(f.email);
   var pseudoOk = verifPWD(f.motdepasse);
  
   
//   if(verifMail(f.email)
   if(pseudoOk && mailOk ){
      return true;
  }
   else
   {
      alert("Veuillez remplir correctement tous les champs");
      return false;
   }
}

function AfficherErreur(champ) {
   var idEl = champ.getAttribute("name");
//   document.getElementById(idEl).textContent = " **invalide**";
   document.getElementById(idEl).style.color = "red";
}

