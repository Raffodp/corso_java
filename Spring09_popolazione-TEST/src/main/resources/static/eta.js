const URL_ETA = 'http://localhost:8080/api/eta';
const SELECT_INT1 = document.getElementById('selectIntEta1');
const SELECT_INT2 = document.getElementById('selectIntEta2');
const SELECT_BOTTONE = document.getElementById('trovaIntervallo');
const SELECT_INTERVALLO = document.getElementById('intervalloEta');
let clicked = null;

fetch(URL_ETA).then(e => e.json()).then(eta => {

	for (const e of eta) {
		let opt = document.createElement('option');
		opt.innerHTML = e.eta;
		SELECT_INT1.appendChild(opt);
	}
})

SELECT_INT1.addEventListener("change", async () => {
	clicked = false;
	const eta = await loadEta();
	for (const e of eta) {
		let opt = document.createElement('option');
		opt.innerHTML = e.eta;
		SELECT_INT2.appendChild(opt);
	}
})

async function loadEta() {

	let response = await fetch(URL_ETA);
	let eta = await response.json();
	return eta;
}

SELECT_BOTTONE.addEventListener("click", async () => {
	const eta = await loadInt();
	if(!clicked){
		clicked = true;
	for (const e of eta) {
		let row = SELECT_INTERVALLO.insertRow();
		
		let cell1 = row.insertCell();
		cell1.innerHTML= e.eta
		
		let cell2 = row.insertCell();
		cell2.innerHTML= e.maschi
		
		let cell3 = row.insertCell();
		cell3.innerHTML= e.femmine
		
		let cell4 = row.insertCell();
		cell4.innerHTML= e.totale
	}
}else{
window.alert("Cambia l'intervallo per una nuova ricerca!");
}
})

async function loadInt() {

	let response = await fetch(URL_ETA+"/intervallo-eta"+"/min/"+SELECT_INT1.value+"/max/"+SELECT_INT2.value);
	let eta = await response.json();
	return eta;
}