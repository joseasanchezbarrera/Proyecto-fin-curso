var contr;
var confContr;

function validar() {
	if(contr.value!=="" && confContr.value!=="") {
		if(contr.value!=confContr.value) {
			alert("Contraseñas distintas");
		}else {
			document.frm1.submit();
		}
	}else {
		alert("Contraseñas vacias");
	}
}

window.onload=function() {
	contr=document.frm1.contraseña;
	confContr=document.frm1.confContraseña;
	
	document.frm1.botonEnviar.addEventListener('click', validar);
    	
}