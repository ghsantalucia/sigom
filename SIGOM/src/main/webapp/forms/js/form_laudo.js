$(window).on('ready', function(){
	
	var dataAtual = new Date();

	var diaAtual = dataAtual.getDate();	
	var anoAtual = dataAtual.getFullYear();
	var mesAtual = dataMes(dataAtual);
	console.log(mesAtual);
});

function dataMes(dataAtual){

	var mes = dataAtual.getMonth().toString();
	var retorno;

	switch(mes){
		case '0': retorno = "Janeiro"; break;
		case '1': retorno = "Fevereiro"; break;
		case '2': retorno = "Março"; break;
		case '3': retorno = "Abril"; break;
		case '4': retorno = "Maio"; break;
		case '5': retorno = "Junho"; break;
		case '6': retorno = "Julho"; break;
		case '7': retorno = "Agosto"; break;
		case '8': retorno = "Setembro"; break;
		case '9': retorno = "Outubro"; break;
		case '10': retorno = "Novembro"; break;
		default: retorno = "Dezembro";
	}
	console.log(retorno + " - " + mes);
	return retorno;
};