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
    <form method="post">
    <%--    <div>--%>
    <%--        <label>Identifiant :</label>--%>
    <%--        <input type="text" id="identifiant" name="identifiant">--%>
    <%--    </div>--%>
        <div>
            <label>Poids :</label>
            <input type="text" id="poids" name="poids">
        </div>
        <div>
            <label>Valeur :</label>
            <input type="text" id="valeur" name="valeur">
        </div>
        <div>
            <label>Origine :</label>
            <input type="text" id="origine" name="origine">
        </div>
        <div>
            <label>Destination :</label>
            <input type="text" id="destination" name="destination">
        </div>
    </form>
    <button>Envoyer</button>
</body>
</html>
