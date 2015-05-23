<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-BR">

	<head>
		<!-- ARQUIVOS DO HEAD COMPARTILHADOS POR TODOS OS FORMULÁRIOS -->
		<%@ include file="forms_head.jsp" %>
	    
		<!-- TITULO -->
		<title>Ocorrência</title>
		
	</head>
  
	<body>

		<div class='form_container'>
			<fieldset class="form-horizontal">

		        <!-- Form Name -->
		        <legend>Ocorrência</legend>

		        <!-- MENU SUPERIOR -->      
		        <center>
		        <div class="btn-group buttons_top" role="group" aria-label="...">

		        	<button type="button" class="btn btn-default" onclick="window.location.href='home.jsp'">
						<span class="glyphicon glyphicon-home" aria-hidden="true"></span> Início
		        	</button>
		        
		        	<button type="button" class="btn btn-default" onclick="window.location.href='ocorrencia.jsp?oc=${param.oc}'">
		            	<span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span> Voltar
		          	</button>

		          	<button type="button" class="btn btn-default" onclick="window.location.href='concluir.jsp?oc=${param.oc}'">
		            	<span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> Concluir
		          	</button>
		        
		        </div>
		        </center>
		    	
		    	<!-- LISTA DE FORMULARIOS FILHOS -->
		    	<div class="list-group">
					<span class="list-group-item active">Vítimas 
		        		<span data-container="body" data-toggle="popover" data-placement="left" data-content="Vivamus sagittis lacus vel augue laoreet rutrum faucibus." class="glyphicon glyphicon-info-sign form_info"></span>
					</span>
					<a href="criar.jsp?form=vitima&oc=${param.oc}" class="list-group-item"><span class='glyphicon glyphicon-plus-sign'></span> <b>Adicionar nova vítima</b></a>
					<a href="vitima.jsp?oc=${param.oc}&vit=*" class="list-group-item">Vítima 001</a>
				</div>

		    	<!-- LISTA DE FORMULARIOS FILHOS -->
		    	<div class="list-group">
					<span class="list-group-item active">Locais 
		        		<span data-container="body" data-toggle="popover" data-placement="left" data-content="Vivamus sagittis lacus vel augue laoreet rutrum faucibus." class="glyphicon glyphicon-info-sign form_info"></span>
					</span>
				  <a href="criar.jsp?form=endereco&oc=${param.oc}" class="list-group-item"><span class='glyphicon glyphicon-plus-sign'></span> <b>Adicionar novo local</b></a>
				  <a href="endereco.jsp?oc=${param.oc}&end=*" class="list-group-item">Local Imediato</a>
				  <a href="endereco.jsp?oc=${param.oc}&end=*" class="list-group-item">Local Mediato</a>
				  <a href="endereco.jsp?oc=${param.oc}&end=*" class="list-group-item">Local Relacionado</a>
				</div>

		    	<!-- LISTA DE FORMULARIOS FILHOS -->
		    	<div class="list-group">
					<span class="list-group-item active">Vestígios 
		        		<span data-container="body" data-toggle="popover" data-placement="left" data-content="Vivamus sagittis lacus vel augue laoreet rutrum faucibus." class="glyphicon glyphicon-info-sign form_info"></span>
					</span>
				  <a href="criar.jsp?form=vestigio&oc=${param.oc}" class="list-group-item"><span class='glyphicon glyphicon-plus-sign'></span> <b>Adicionar novo vestígio</b></a>
				  <a href="vestigio.jsp?oc=${param.oc}&ves=*" class="list-group-item">Vestígio 001</a>
				</div>

		    	<!-- LISTA DE FORMULARIOS FILHOS -->
		    	<div class="list-group">
					<span class="list-group-item active">Equipes de Socorro 
		        		<span data-container="body" data-toggle="popover" data-placement="left" data-content="Vivamus sagittis lacus vel augue laoreet rutrum faucibus." class="glyphicon glyphicon-info-sign form_info"></span>
					</span>
				  <a href="criar.jsp?form=equipeSocorro&oc=${param.oc}" class="list-group-item"><span class='glyphicon glyphicon-plus-sign'></span> <b>Adicionar nova equipe</b></a>
				  <a href="equipeSocorro.jsp?oc=${param.oc}&equ=*" class="list-group-item">SAMU</a>
				  <a href="equipeSocorro.jsp?oc=${param.oc}&equ=*" class="list-group-item">Bombeiros</a>
				</div>

		    	<!-- LISTA DE FORMULARIOS FILHOS -->
		    	<div class="list-group">
					<span class="list-group-item active">Pessoas 
		        		<span data-container="body" data-toggle="popover" data-placement="left" data-content="Vivamus sagittis lacus vel augue laoreet rutrum faucibus." class="glyphicon glyphicon-info-sign form_info"></span>
					</span>
				  <a href="criar.jsp?form=pessoa&oc=${param.oc}" class="list-group-item"><span class='glyphicon glyphicon-plus-sign'></span> <b>Adicionar nova pessoa</b></a>
				  <a href="pessoa.jsp?oc=${param.oc}&pes=*" class="list-group-item">Pessoa 001</a>
				</div>

		    	<!-- LISTA DE FORMULARIOS FILHOS -->
		    	<div class="list-group">
					<span class="list-group-item active">Observações
		        		<span data-container="body" data-toggle="popover" data-placement="left" data-content="Vivamus sagittis lacus vel augue laoreet rutrum faucibus." class="glyphicon glyphicon-info-sign form_info"></span>
					</span>
				  <a href="criar.jsp?form=observacao&oc=${param.oc}" class="list-group-item"><span class='glyphicon glyphicon-plus-sign'></span> <b>Adicionar nova observação</b></a>
				  <a href="observacao.jsp?oc=${param.oc}&obs=*" class="list-group-item">Observação do cadáver</a>
				  <a href="observacao.jsp?oc=${param.oc}&obs=*" class="list-group-item">Observação dos exames</a>
				  <a href="observacao.jsp?oc=${param.oc}&obs=*" class="list-group-item">Observação da conclusão</a>
				</div>

		    </fieldset>
		</div>

	</body>

</html>