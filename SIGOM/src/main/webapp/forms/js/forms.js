$(window).on('ready', function(){
	
	$('.datepick').each(function(){

		$(this).datepicker({
		    dateFormat: 'dd/mm/yy',
		    dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado'],
		    dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
		    dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
		    monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
		    monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez'],
		    nextText: 'Próximo',
		    prevText: 'Anterior'
		});
	});

	$('#data_comunicacao').on('change', function(){

		var dc = $(this).val().split('/');
		
		$('#dia_comunicacao').val(dc[0]);
		$('#mes_comunicacao').val(dc[1]);
		$('#ano_comunicacao').val(dc[2]);
	});

});

