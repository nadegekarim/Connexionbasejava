<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact</title>
</head>
<body>
 <h2>Consultation des détails d'un consultant</h2>
 <fieldset>
 <p> Nom : ${contact.nom}</p>
<p> Prénom : ${contact.prenom}</p>
<p> Date de naissance : ${contact.datenaissance}</p>
<p> Télephone : ${contact.telephone}</p>
<p> Url du réseau social : ${contact.url}</p>
<p> Poste : ${contact.poste}</p>
<p> Spécialité : ${contact.specialite}</p>
 </fieldset>

<a href="ChoixServlet">Retour à la recherche</a>
</body>
</html>