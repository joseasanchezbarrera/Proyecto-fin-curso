
function Alta() {
	document.formulario1.submit();
}

function Baja() {
	document.formulario2.submit();
}

function ListadoBomberos() {
	document.formulario3.submit();
}

function Modificar() {	
	document.formulario4.submit();
	
	}

function Buscar() {
	document.formulario5.submit();
}

function InicioCRUD() {
	document.formulario6.submit();
}

function setManejadorEventos() {
	document.formulario1.botonAlta.addEventListener("click", Alta);
	document.formulario2.botonBaja.addEventListener("click", Baja);
	document.formulario3.botonListar.addEventListener("click", ListadoBomberos);
	document.formulario4.botonModificar.addEventListener("click", Modificar);
	document.formulario5.botonBuscar.addEventListener("click", Buscar);
	document.formulario6.botonInicioCRUD.addEventListener("click", InicioCRUD);
}

window.onload=function() {
	setManejadorEventos();
}