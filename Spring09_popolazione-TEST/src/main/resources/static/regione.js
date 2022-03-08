const URL_REGIONE = 'http://localhost:8080/api/regione/';
const SELECT_REGIONE = document.getElementById('selectIdRegione');
const SELECT_COMUNE = document.getElementById('selectIdComune');
let femmine = 0;
let maschi = 0;

fetch(URL_REGIONE).then(e => e.json()).then(regione => {

	for (const r of regione) {
		let opt = document.createElement('option');
		opt.innerHTML = r;
		SELECT_REGIONE.appendChild(opt);
	}

})

SELECT_REGIONE.addEventListener("change", async () => {
	const regione = await loadComune();
	SELECT_COMUNE.innerHTML = "";
	for (const r of regione) {
		let opt = document.createElement('option');
		opt.innerHTML = r.comune;
		SELECT_COMUNE.appendChild(opt);
	}
})


async function loadComune() {

	let response = await fetch(URL_REGIONE + SELECT_REGIONE.value);
	let regione = await response.json();
	return regione;
}


SELECT_COMUNE.addEventListener("change", async () => {
	const regione = await loadGrafico();
		femmine = regione.femmine;
		maschi = regione.maschi;
		wrap();
})

async function loadGrafico() {

	let response = await fetch(URL_REGIONE + SELECT_REGIONE.value + "/" + SELECT_COMUNE.value);
	let regione = await response.json();
	return regione;
}


function wrap() {
	//Load google charts
	google.charts.load('current', { 'packages': ['corechart'] });
	google.charts.setOnLoadCallback(drawChart);

	// Draw the chart and set the chart values
	function drawChart() {
		let data = google.visualization.arrayToDataTable([
			['Task', 'Hours per Day'],
			['Femmine', femmine],
			['Maschi', maschi],
		]);

		// Optional; add a title and set the width and height of the chart
		let options = { 'title': 'Grafico maschi e femmine', 'width': 550, 'height': 400 };

		// Display the chart inside the <div> element with id="piechart"
		let chart = new google.visualization.PieChart(document.getElementById('piechart'));
		chart.draw(data, options);
	}
}