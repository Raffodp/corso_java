const URL_ETA = 'http://localhost:8080/api/eta/';
const SELECT_INT1 = document.getElementById('selectIntEta1');
const SELECT_INT2 = document.getElementById('selectIntEta2');
const SELECT_BOTTONE = document.getElementById('trovaIntervallo')

fetch(URL_ETA).then(e => e.json()).then(eta => {

	for (const e of eta) {
		let opt = document.createElement('option');
		opt.innerHTML = e.eta;
		SELECT_INT1.appendChild(opt);
	}

SELECT_INT1.addEventListener("change", async () => {
	const eta = await loadEta();
	for (const e of eta) {
		let opt = document.createElement('option');
		opt.innerHTML = e.eta;
		SELECT_INT2.appendChild(opt);
	}
})


async function loadInt() {

	let response = await fetch(URL_ETA+"/min/"+SELECT_INT1.value+"/max/"+SELECT_INT2.value);
	let eta = await response.json();
	return eta;
	
	
}
SELECT_BOTTONE.addEventListener("click", async () => {
	const eta = await loadInt();
	for (const e of eta) {
		let tr = document.createElement('tr');
		tr.appendChild(tr);
		let td = document.createElement('td');
		td.appendChild(td);
		td.innerHTML = e.eta;
		let opt = document.createElement('tr');
		let opt = document.createElement('td');
		opt.innerHTML = e.femmina;
		SELECT_INT2.appendChild(opt);
	}
})
})