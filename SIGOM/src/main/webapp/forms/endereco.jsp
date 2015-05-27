<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-BR">

	<head>
		<!-- ARQUIVOS DO HEAD COMPARTILHADOS POR TODOS OS FORMULÁRIOS -->
	    <%@ include file="forms_head.jsp" %>

		<!-- TITULO -->
		<title>Local</title>
		
	</head>
  
	<body>

	    <div class='form_container'>
	      <form action="" method="post" class="form-horizontal">
	        <fieldset>

	        <!-- Form Name -->
	        <legend>Local</legend>

	        <!-- MENU SUPERIOR -->      
	        <center>
	        <div class="btn-group buttons_top" role="group" aria-label="...">
	          <button type="button" class="btn btn-default" onclick="window.location.href='edicao.jsp?r=/SIGOMweb/home.jsp'">
	            <span class="glyphicon glyphicon-home" aria-hidden="true"></span> Início
	          </button>
	          <button type="button" class="btn btn-default" onclick="window.location.href='edicao.jsp?r=ocorrencia_forms.jsp?oc=${param.oc}'">
	            <span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span> Voltar
	          </button>
	          <button type="button" class="btn btn-default" onclick="window.location.href='edicao.jsp?r=criar.jsp?form=endereco%26oc=${param.oc}'">
	            <span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> Novo
	          </button>
	          <button type="button" class="btn btn-default" onclick="window.location.href='edicao.jsp?r=isolamento.jsp?oc=${param.oc}%26end=${param.end}'">
	            <span class="glyphicon glyphicon-arrow-right" aria-hidden="true"></span> Próximo
	          </button>
	        </div>
	        </center>


	        <!-- Select Basic -->
	        <div class="control-group">
	          <label class="control-label" for="tipo_local">Tipo de local</label>
	          <div class="controls">
	            <select id="tipo_local" name="tipo_local" class="input-xlarge">
	              <option>Imediato</option>
	              <option>Mediato</option>
	              <option>Relacionado</option>
	            </select>
	          </div>
	        </div>

	        <!-- Text input-->
	        <div class="control-group">
	          <label class="control-label" for="estado">Estado</label>
	          <div class="controls">
	            <input id="estado" name="estado" type="text" placeholder="" class="input-xlarge" value='Goiás'>
	            
	          </div>
	        </div>

	        <!-- Text input-->
	        <div class="control-group">
	          <label class="control-label" for="cidade">Cidade</label>
	          <div class="controls">
	            <input id="cidade" name="cidade" type="text" placeholder="" class="input-xlarge">
	            
	          </div>
	        </div>

	        <!-- Text input-->
	        <div class="control-group">
	          <label class="control-label" for="bairro">Bairro</label>
	          <div class="controls">
	            <input id="bairro" name="bairro" type="text" placeholder="" class="input-xlarge">
	            
	          </div>
	        </div>

	        <!-- Text input-->
	        <div class="control-group">
	          <label class="control-label" for="rua">Rua</label>
	          <div class="controls">
	            <input id="rua" name="rua" type="text" placeholder="" class="input-xlarge">
	            
	          </div>
	        </div>

	        <!-- Text input-->
	        <div class="control-group">
	          <label class="control-label" for="complemento">Complemento</label>
	          <div class="controls">
	            <input id="complemento" name="complemento" type="text" placeholder="" class="input-xlarge">
	            
	          </div>
	        </div>

	        <!-- Text input-->
	        <div class="control-group">
	          <label class="control-label" for="coordenadas">Coordenadas</label>
	          <div class="controls">
	            <input id="coordenadas" name="coordenadas" type="text" placeholder="latitude, longitude" class="input-xlarge gps">
	            
	          </div>
	        </div>

	        <!-- Textarea -->
	        <div class="control-group">
	          <label class="control-label" for="condicoes_tempo">Condições climáticas</label>
	          <div class="controls">                     
	            <textarea id="condicoes_tempo" name="condicoes_tempo" placeholder="Condições do tempo e iluminação do local"></textarea>
	          </div>
	        </div>

	        <!-- Textarea -->
	        <div class="control-group">
	          <label class="control-label" for="observacao">Observações</label>
	          <div class="controls">                     
	            <textarea id="observacao" name="observacao"></textarea>
	          </div>
	        </div>

	        <!-- BOTOES -->
	        <div class='buttons_end'>
	          <button type="button" class="btn btn-default btn-lg" onclick="window.location.href='edicao.jsp?r=ocorrencia_forms.jsp?oc=${param.oc}'">
	            <span class="glyphicon glyphicon-circle-arrow-left" aria-hidden="true"></span> Voltar
	          </button>
	          &nbsp;&nbsp;&nbsp;
	          <button type="button" class="btn btn-default btn-lg" onclick="window.location.href='edicao.jsp?r=endereco_forms.jsp?oc=${param.oc}%26end=${param.end}'">
	            <span class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true"></span> Próximo
	          </button>
	        </div>

	        </fieldset>
	      </form>
	    </div>

	</body>

</html>