//GABRIEL HAMADA SANTALUCIA 130216 - 12/09/2014

$(document).ready(function () {
	
	$('.buttons').click(function(){ 
		if(($('#visor').html() == '0')&&($(this).html() != '.')&&($(this).attr('class') != "buttons op")){
			$('#visor').html($(this).html());
		} else {
			$('#visor').append($(this).html()); 
		}
	});
	
	$('.op').click(function(){ 
		
		if(active == 0){ 
			active = 1;
		} 
		else{
			operacao();
			$('#visor').append($(this).html());
			active = 1;
		}
		
	});
	
	$('#result').click(function(){ operacao(); });
	
});

var active = 0;

function operacao(){
	
	active = 0;
	
	//MULTIPLICACAO
	var r = ($('#visor').html()).split('*');
	if(r.length>1){
		res = parseFloat(r[0]) * parseFloat(r[1]);
	}
	//DIVISAO
	var r = ($('#visor').html()).split('/');
	if(r.length>1){
		res = parseFloat(r[0]) / parseFloat(r[1]);
	}
	//ADICAO
	var r = ($('#visor').html()).split('+');
	if(r.length>1){
		res = parseFloat(r[0]) + parseFloat(r[1]);
	}
	//SUBTRACAO
	var r = ($('#visor').html()).split('-');
	if(r.length>1){
		res = parseFloat(r[0]) - parseFloat(r[1]);
	}
	
	
	if(res == parseInt(res)){
		res = parseInt(res);
	}
	
	if((!res)&&(res != 0)){
		res = "error";
	}
	
	$('#visor').html(res);
}

//GABRIEL HAMADA SANTALUCIA 130216 - 12/09/2014