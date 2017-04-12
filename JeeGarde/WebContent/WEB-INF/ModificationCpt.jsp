<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="./ASSETS/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="./ASSETS/login.css" rel="stylesheet" media="screen">

<script src="https://code.jquery.com/jquery-3.1.1.js"></script>
<script src="./ASSETS/js/login.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%@include file="/WEB-INF/head.jsp" %>
</head>

<body onload="myfunction()">
<div class="container" id="formulaire">
<h2>informations du compte</h2><br>
<div class="row">
<div class="col-md-6">
	<div class="input-group">
		<span class="input-group-addon id="basic-addon1">Nom</span>
		<input id="mod1"  type="text" disabled="disabled" class="form-control"  name="NomUser" value="${nomuser}"  required="" autofocus="" aria-describedby="basic-addon1"><br>
	</div>
		<label>Prénom:</label>
		<input id="mod2" type="text" disabled="disabled" class="form-control" name="PrenomUser"	value="${prenomuser}" required="" autofocus=""><br>
		<label>Adresse Mail:</label>
		<input id="mod3" type="text" disabled="disabled" class="form-control" name="MailUser" value="${mailuser}" required="" autofocus=""><br>
		<label>Code Postal:</label>
		<input id="mod4" type="text" disabled="disabled" class="form-control" name="codePostalUser" value="${codepostaluser}" required="" autofocus=""><br><br>

</div>
<div class="col-md-6">

		<label>Nom:</label>
		<input id="mod1" type="text" disabled="disabled" class="form-control"  name="NomUser" value="${nomuser}"  required="" autofocus="" /><br>
		<label>Prénom:</label>
		<input id="mod2" type="text" disabled="disabled" class="form-control" name="PrenomUser"	value="${prenomuser}" required="" autofocus="" /><br>
		<label>Adresse Mail:</label>
		<input id="mod3" type="text" disabled="disabled" class="form-control" name="MailUser" value="${mailuser}" required="" autofocus="" /><br>
		<label>Code Postal:</label>
		<input id="mod4" type="text" disabled="disabled" class="form-control" name="codePostalUser" value="${codepostaluser}" required="" autofocus="" /><br><br>
					
	</div>
</div>
		<button id="btModifier" class="btn btn-md btn-primary btn-block" name="modifier" value="modifier" onclick="modifier()">Modifier les informations</button>	
		<button id="btenregistrer" class="btn btn-md btn-primary btn-block" name="Creation" value="Creation" type="Submit" >Enregistrer les modifications</button>	
		<button id="btannuler" class="btn btn-md btn-danger btn-block" name="annuler" value="annuler" onclick="annuler()" type="Submit">Annulation</button>		
</div>

</body>
</html>