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
    <title>Title</title>
</head>
<body>
    <h1>Progression colis</h1>
    <hr/>
    <form method="post">
        <div>
            <span>Identifiant colis : ${colis_id}</span>
        </div>
        <div>
            <label>Latitude :</label>
            <input type="text" id="latitude" name="latitude" placeholder="${colis_latitude}">
        </div>
        <div>
            <label>Longitude :</label>
            <input type="text" id="longitude" name="longitude" placeholder="${colis_longitude}">
        </div>
        <div>
            <label>Emplacement :</label>
            <input type="text" id="emplacement" name="emplacement" placeholder="${colis_emplacement}">
        </div>
        <div>
            <label>Etat :</label>
            <input type="text" id="etat" name="etat" placeholder="${colis_etat}">
        </div>
        <input type="submit" value="Modifier"/>
    </form>
    <button type="button" class="suppr_colis">Supprimer</button>

    <br/>
    <a href="index">Back</a>
</body>
</html>
