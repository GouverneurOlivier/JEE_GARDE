function myfunction(){
	var div = document.getElementById("test");
	div.style.display="none";
	var delog = document.getElementById("delog");
	delog.style.display="block";
	var menudelog = document.getElementById("menudelog");
	menudelog.style.display="block";
	var menuCpt = document.getElementById("menuCpt");
	menuCpt.style.display="block";

 }

function modifier(){
	var btannuler = document.getElementById("btannuler");
	btannuler.style.display="block";
	var btModifier = document.getElementById("btModifier");
	btModifier.style.display="none";
	var btenregistrer = document.getElementById("btenregistrer");
	btenregistrer.style.display="block";
	var mod1 = document.getElementById("mod1");
	mod1.disabled=false;
	var mod2 = document.getElementById("mod2");
	mod2.disabled=false;
	var mod3 = document.getElementById("mod3");
	mod3.disabled=false;
	var mod4 = document.getElementById("mod4");
	mod4.disabled=false;
	var btannuler = document.getElementById("btannuler");
	btannuler.style.display="block";
}

function annuler(){
	var btannuler = document.getElementById("btannuler");
	btannuler.style.display="none";
	var btenregistrer = document.getElementById("btenregistrer");
	btenregistrer.style.display="none";
	var btModifier = document.getElementById("btModifier");
	btModifier.style.display="block";
	var mod1 = document.getElementById("mod1");
	mod1.disabled=true;
	var mod2 = document.getElementById("mod2");
	mod2.disabled=true;
	var mod3 = document.getElementById("mod3");
	mod3.disabled=true;
	var mod4 = document.getElementById("mod4");
	mod4.disabled=true;
}


