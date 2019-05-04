
let inputs = document.querySelectorAll(".valor");

let exchangeRates;

let selectCurrency = document.getElementById("selectCurrency");
let selectCurrencyType = document.getElementById("selectCurrencyType");

let obtainCurrency = document.getElementById("obtainCurrency");
let obtainCurrencyType = document.getElementById("obtainCurrencyType");

let url = 'https://api.exchangeratesapi.io/latest?symbols=USD,GBP,JPY,EUR';
fetch(url)
  .then(r => r.json())
  .then(data => {
	  this.exchangeRates = data;
    document.querySelector('#USD')
      .dataset.cambio = data.rates.USD;
    document.querySelector('#GBP')
      .dataset.cambio = data.rates.GBP;  
    document.querySelector('#JPY')
      .dataset.cambio = data.rates.JPY;
    document.querySelector('#EUR')
      .dataset.cambio = data.rates.EUR;

    inputs.forEach(input => {
      input.value = input.dataset.cambio;
    });
  })
  .catch(error => console.error(error))

function valorCambiado(input) {
  console.log(this.exchangeRates);
  let factor = input.value / input.dataset.cambio;
  inputs.forEach(campo => {
    campo.value = (campo.dataset.cambio * factor).toFixed(2);
  })
}

function getCambio() {
	console.log(this.exchangeRates);
	if (this.selectCurrency.value) {
		switch (this.selectCurrencyType.value) {
			case "selectEUR":
				this.getCambioEuros();
				break;
			case "selectUSD":
				this.getCambioDolar();
				break;
			case "selectGBP":
				this.getCambioLibra();
				break;
			case "selectJPY":
				this.getCambioYen();
				break;
			}
	} else {
		this.obtainCurrency.value = null;
	}
}

function getCambioEuros() {
	switch (this.obtainCurrencyType.value) {
	case "obtainEUR":
		this.obtainCurrency.value = (this.selectCurrency.value * 1).toFixed(2);
		break;
	case "obtainGBP":
		this.obtainCurrency.value = (this.selectCurrency.value * this.exchangeRates.rates.GBP).toFixed(2);
		break;
	case "obtainUSD":
		this.obtainCurrency.value = (this.selectCurrency.value * this.exchangeRates.rates.USD).toFixed(2);
		break;
	case "obtainJPY":
		this.obtainCurrency.value = (this.selectCurrency.value * this.exchangeRates.rates.JPY).toFixed(2);
		break;
		
	default:
		break;
	}
}

function getCambioDolar() {
	switch (this.obtainCurrencyType.value) {
	case "obtainUSD":
		this.obtainCurrency.value = (this.selectCurrency.value * 1).toFixed(2);
		break;
	case "obtainGBP":
		this.obtainCurrency.value = (this.selectCurrency.value * this.exchangeRates.rates.GBP).toFixed(2);
		break;
	case "obtainEUR":
		this.obtainCurrency.value = (this.selectCurrency.value * this.exchangeRates.rates.EUR).toFixed(2);
		break;
	case "obtainJPY":
		this.obtainCurrency.value = (this.selectCurrency.value * this.exchangeRates.rates.JPY).toFixed(2);
		break;
		
	default:
		break;
	}
}

function getCambioLibra() {
	switch (this.obtainCurrencyType.value) {
	case "obtainGBP":
		this.obtainCurrency.value = (this.selectCurrency.value * 1).toFixed(2);
		break;
	case "obtainEUR":
		this.obtainCurrency.value = (this.selectCurrency.value * this.exchangeRates.rates.EUR).toFixed(2);
		break;
	case "obtainUSD":
		this.obtainCurrency.value = (this.selectCurrency.value * this.exchangeRates.rates.USD).toFixed(2);
		break;
	case "obtainJPY":
		this.obtainCurrency.value = (this.selectCurrency.value * this.exchangeRates.rates.JPY).toFixed(2);
		break;
		
	default:
		break;
	}
}

function getCambioYen() {
	switch (this.obtainCurrencyType.value) {
	case "obtainJPY":
		this.obtainCurrency.value = (this.selectCurrency.value * 1).toFixed(2);
		break;
	case "obtainGBP":
		this.obtainCurrency.value = (this.selectCurrency.value * this.exchangeRates.rates.GBP).toFixed(2);
		break;
	case "obtainUSD":
		this.obtainCurrency.value = (this.selectCurrency.value * this.exchangeRates.rates.USD).toFixed(2);
		break;
	case "obtainEUR":
		this.obtainCurrency.value = (this.selectCurrency.value * this.exchangeRates.rates.EUR).toFixed(2);
		break;
		
	default:
		break;
	}
}












