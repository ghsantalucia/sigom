<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-BR">

	<head>
		<!-- ARQUIVOS DO HEAD COMPARTILHADOS POR TODOS OS FORMULÁRIOS -->
	    <%@ include file="forms_head.jsp" %>

		<!-- TITULO -->
		<title>Isolamento do local</title>
		
	</head>
  
	<body>

	    <div class='form_container'>
	      <form action="" method="post" class="form-horizontal">
	        <fieldset>

	        <!-- Form Name -->
	        <legend>Isolamento do local</legend>

	        <!-- MENU SUPERIOR -->
	        <center>
	        <div class="btn-group buttons_top" role="group" aria-label="...">
	          <button type="button" class="btn btn-default" onclick="window.location.href='edicao.jsp?r=home.jsp'">
	            <span class="glyphicon glyphicon-home" aria-hidden="true"></span> Início
	          </button>
	          <button type="button" class="btn btn-default" onclick="window.location.href='edicao.jsp?r=endereco.jsp?oc=${param.oc}%26end=${param.end}'">
	            <span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span> Voltar
	          </button>
	        </div>
	        </center>



			<!-- Text input-->
			<div class="control-group">
			  <label class="control-label" for="instituicao">Instituição</label>
			  <div class="controls">
			    <input id="instituicao" name="instituicao" type="text" placeholder="" class="input-xlarge">
			    
			  </div>
			</div>

			<!-- Text input-->
			<div class="control-group">
			  <label class="control-label" for="viatura">Viatura</label>
			  <div class="controls">
			    <input id="viatura" name="viatura" type="text" placeholder="" class="input-xlarge">
			    
			  </div>
			</div>

			<!-- Text input-->
			<div class="control-group">
			  <label class="control-label" for="batalhao">Batalhão</label>
			  <div class="controls">
			    <input id="batalhao" name="batalhao" type="text" placeholder="" class="input-xlarge">
			    
			  </div>
			</div>

			<!-- Text input-->
			<div class="control-group">
			  <label class="control-label" for="responsaveis">Responsáveis</label>
			  <div class="controls">
			    <input id="responsaveis" name="responsaveis" type="text" placeholder="" class="input-xlarge">
			    
			  </div>
			</div>

			<!-- Multiple Radios -->
			<div class="control-group">
			  <label class="control-label" for="isolamento_contento">Isolamento</label>
			  <div class="controls radio_controls">
			    <label class="radio" for="isolamento_contento-0">
			      <input type="radio" name="isolamento_contento" id="isolamento_contento-0" value="true" checked="checked">
			      Adequado
			    </label>
			    <label class="radio" for="isolamento_contento-1">
			      <input type="radio" name="isolamento_contento" id="isolamento_contento-1" value="false">
			      Inadequado
			    </label>
			  </div>
			</div>

			<!-- Textarea -->
			<div class="control-group">
			  <label class="control-label" for="observacao_isolamento"></label>
			  <div class="controls">                     
			    <textarea id="observacao_isolamento" name="observacao_isolamento" placeholder="Observação do isolamento"></textarea>
			  </div>
			</div>

			<!-- Multiple Radios -->
			<div class="control-group">
			  <label class="control-label" for="preservacao_contento">Preservação</label>
			  <div class="controls radio_controls">
			    <label class="radio" for="preservacao_contento-0">
			      <input type="radio" name="preservacao_contento" id="preservacao_contento-0" value="true" checked="checked">
			      Adequada
			    </label>
			    <label class="radio" for="preservacao_contento-1">
			      <input type="radio" name="preservacao_contento" id="preservacao_contento-1" value="false">
			      Inadequada
			    </label>
			  </div>
			</div>

			<!-- Textarea -->
			<div class="control-group">
			  <label class="control-label" for="observacao_preservacao"></label>
			  <div class="controls">                     
			    <textarea id="observacao_preservacao" name="observacao_preservacao" placeholder="Observação da preservação"></textarea>
			  </div>
			</div>

			<!-- Textarea -->
			<div class="control-group">
			  <label class="control-label" for="observacao_geral">Observações gerais</label>
			  <div class="controls">                     
			    <textarea id="observacao_geral" name="observacao_geral"></textarea>
			  </div>
			</div>



	        <!-- BOTOES -->
	        <div class='buttons_end'>
	          <button type="button" class="btn btn-default btn-lg" onclick="window.location.href='edicao.jsp?r=endereco.jsp?oc=${param.oc}%26end=${param.end}'">
	            <span class="glyphicon glyphicon-circle-arrow-left" aria-hidden="true"></span> Voltar
	          </button>
	        </div>

	        </fieldset>
	      </form>
	    </div>

	</body>

</html>