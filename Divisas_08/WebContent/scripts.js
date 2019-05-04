
const exchangesEUR = {
		EUR: 1.0,
		USD: 1.115,
		GBP: 0.858,
		JPY: 124.4,
		AUD: 1.60,
		CAD: 1.51,
		CHF: 1.14
}

const exchangesUSD ={
		USD: 1.0,
		EUR: 0.89,
		GBP: 0.76,
		JPY: 111.11,
		AUD: 1.42,
		CAD: 1.34,
		CHF: 1.02,
		}


const exchangesJPY ={
		JPY: 1.0,
		EUR: 0.0080,
		USD: 0.0090,
		GBP: 0.0068,
		AUD: 0.013,
		CAD: 0.012,
		CHF: 0.0092,
		}


const exchangesGBP ={
		GBP: 1.0,
		EUR: 1.17,
		USD: 1.32,
		JPY: 146.36,
		AUD: 1.88,
		CAD: 1.77,
		CHF: 1.34,
		}

const exchangesAUD = {
		EUR: 0.63,
		USD: 0.70,
		GBP: 0.53,
		JPY: 78.01,
		AUD: 1.0,
		CAD: 0.94,
		CHF: 0.71
}

const exchangesCAD = {
		EUR: 0.67,
		USD: 0.74,
		GBP: 0.56,
		JPY: 82.68,
		AUD: 1.06,
		CAD: 1.0,
		CHF: 0.76
}

const exchangesCHF = {
		EUR: 0.88,
		USD: 0.98,
		GBP: 0.75,
		JPY: 109.26,
		AUD: 1.40,
		CAD: 1.32,
		CHF: 1.0
}

let selectCurrency = document.getElementById("selectCurrency");
let selectCurrencyType = document.getElementById("selectCurrencyType");
let obtainCurrency = document.getElementById("obtainCurrency");
let obtainCurrencyType = document.getElementById("obtainCurrencyType");

function getCambio() {
	if (this.selectCurrency.value) {
		switch (this.selectCurrencyType.value) {
			case "selectEUR":
				this.getCambioEUR();
				break;
			case "selectUSD":
				this.getCambioUSD();
				break;
			case "selectGBP":
				this.getCambioGBP();
				break;
			case "selectJPY":
				this.getCambioJPY();
				break;
			case "selectAUD":
				this.getCambioAUD();
				break;
			case "selectCAD":
				this.getCambioCAD();
				break;
			case "selectCHF":
				this.getCambioCHF();
				break;
			}
	} else {
		this.obtainCurrency.value = null;
	}
}

function getCambioEUR() {
	switch (this.obtainCurrencyType.value) {
	case "obtainEUR":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesEUR.EUR).toFixed(2);
		break;
	case "obtainGBP":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesEUR.GBP).toFixed(2);
		break;
	case "obtainUSD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesEUR.USD).toFixed(2);
		break;
	case "obtainJPY":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesEUR.JPY).toFixed(2);
		break;
	case "obtainAUD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesEUR.AUD).toFixed(2);
		break;
	case "obtainCAD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesEUR.CAD).toFixed(2);
		break;
	case "obtainCHF":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesEUR.CHF).toFixed(2);
		break;
	default:
		break;
	}
}

function getCambioGBP() {
	switch (this.obtainCurrencyType.value) {
	case "obtainEUR":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesGBP.EUR).toFixed(2);
		break;
	case "obtainGBP":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesGBP.GBP).toFixed(2);
		break;
	case "obtainUSD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesGBP.USD).toFixed(2);
		break;
	case "obtainJPY":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesGBP.JPY).toFixed(2);
		break;
	case "obtainAUD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesGBP.AUD).toFixed(2);
		break;
	case "obtainCAD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesGBP.CAD).toFixed(2);
		break;
	case "obtainCHF":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesGBP.CHF).toFixed(2);
		break;
	default:
		break;
	}
}

function getCambioUSD() {
	switch (this.obtainCurrencyType.value) {
	case "obtainEUR":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesUSD.EUR).toFixed(2);
		break;
	case "obtainGBP":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesUSD.GBP).toFixed(2);
		break;
	case "obtainUSD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesUSD.USD).toFixed(2);
		break;
	case "obtainJPY":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesUSD.JPY).toFixed(2);
		break;
	case "obtainAUD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesUSD.AUD).toFixed(2);
		break;
	case "obtainCAD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesUSD.CAD).toFixed(2);
		break;
	case "obtainCHF":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesUSD.CHF).toFixed(2);
		break;
	default:
		break;
	}
}

function getCambioJPY() {
	switch (this.obtainCurrencyType.value) {
	case "obtainEUR":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesJPY.EUR).toFixed(2);
		break;
	case "obtainGBP":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesJPY.GBP).toFixed(2);
		break;
	case "obtainUSD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesJPY.USD).toFixed(2);
		break;
	case "obtainJPY":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesJPY.JPY).toFixed(2);
		break;
	case "obtainAUD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesJPY.AUD).toFixed(2);
		break;
	case "obtainCAD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesJPY.CAD).toFixed(2);
		break;
	case "obtainCHF":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesJPY.CHF).toFixed(2);
		break;
	default:
		break;
	}
}

function getCambioAUD() {
	switch (this.obtainCurrencyType.value) {
	case "obtainEUR":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesAUD.EUR).toFixed(2);
		break;
	case "obtainGBP":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesAUD.GBP).toFixed(2);
		break;
	case "obtainUSD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesAUD.USD).toFixed(2);
		break;
	case "obtainJPY":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesAUD.JPY).toFixed(2);
		break;
	case "obtainAUD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesAUD.AUD).toFixed(2);
		break;
	case "obtainCAD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesAUD.CAD).toFixed(2);
		break;
	case "obtainCHF":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesAUD.CHF).toFixed(2);
		break;
	default:
		break;
	}
}

function getCambioCAD() {
	switch (this.obtainCurrencyType.value) {
	case "obtainEUR":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesCAD.EUR).toFixed(2);
		break;
	case "obtainGBP":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesCAD.GBP).toFixed(2);
		break;
	case "obtainUSD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesCAD.USD).toFixed(2);
		break;
	case "obtainJPY":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesCAD.JPY).toFixed(2);
		break;
	case "obtainAUD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesCAD.AUD).toFixed(2);
		break;
	case "obtainCAD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesCAD.CAD).toFixed(2);
		break;
	case "obtainCHF":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesCAD.CHF).toFixed(2);
		break;
	default:
		break;
	}
}

function getCambioCHF() {
	switch (this.obtainCurrencyType.value) {
	case "obtainEUR":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesCHF.EUR).toFixed(2);
		break;
	case "obtainGBP":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesCHF.GBP).toFixed(2);
		break;
	case "obtainUSD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesCHF.USD).toFixed(2);
		break;
	case "obtainJPY":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesCHF.JPY).toFixed(2);
		break;
	case "obtainAUD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesCHF.AUD).toFixed(2);
		break;
	case "obtainCAD":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesCHF.CAD).toFixed(2);
		break;
	case "obtainCHF":
		this.obtainCurrency.value = (this.selectCurrency.value * exchangesCHF.CHF).toFixed(2);
		break;
	default:
		break;
	}
}











