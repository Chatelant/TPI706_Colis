<%--
  Created by IntelliJ IDEA.
  User: kosmie
  Date: 08/10/2021
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Suivre mon colis</title>
</head>
<body>
    <h1>Suivre mon colis</h1>
    <hr/>
    <form method="post">
        <div>
            <label for="inputsuivi">Identifiant colis : </label>
            <input id="inputsuivi" type="text" name="inputsuivi" required/>
        </div>
        <input type="submit" value="Rechercher"/>
    </form>

    <br/>
    <p>${colis_id}</p>
    <ul>
        <li>${colis_poids}</li>
        <li>${colis_valeur}</li>
        <li>${colis_origine}</li>
        <li>${colis_destination}</li>
        <li>${colis_latitude}</li>
        <li>${colis_longitude}</li>
        <li>${colis_emplacement}</li>
        <li>${colis_etat}</li>
    </ul>

    <br/>
    <a href="progression" class="edit_colis">Modifier</a>
    <button type="button" class="suppr_colis">Supprimer</button>

    <br/>
    <a href="index">Back</a>
</body>
</html>
