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
    <title>Enregistrer un colis</title>
</head>
<body>
    <h1>Enregistrer un colis</h1>
    <hr/>
    <form action="enregistrer" method="post">
        <div>
            <label for="poids">Poids :</label>
            <input type="text" id="poids" name="poids">
        </div>
        <div>
            <label for="valeur">Valeur :</label>
            <input type="text" id="valeur" name="valeur">
        </div>
        <div>
            <label for="origine">Origine :</label>
            <input type="text" id="origine" name="origine">
        </div>
        <div>
            <label for="destination">Destination :</label>
            <input type="text" id="destination" name="destination">
        </div>
        <input type="submit" value="Envoyer"/>
    </form>
    <br/>
    <p>${colis_id}</p>
    <br/>
    <a href="index">Back</a>
</body>
</html>
