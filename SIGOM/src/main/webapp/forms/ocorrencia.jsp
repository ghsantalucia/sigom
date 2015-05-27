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
			<form action="" method="post" class="form-horizontal">
	        	<fieldset>

			        <!-- Form Name -->
			        <legend>Ocorrência</legend>

			        <!-- MENU SUPERIOR -->      
			        <center>
			        <div class="btn-group buttons_top" role="group" aria-label="...">

			          	<button type="button" class="btn btn-default" onclick="window.location.href='edicao.jsp?r=/SIGOMweb/home.jsp'">
			            	<span class="glyphicon glyphicon-home" aria-hidden="true"></span> Início
			          	</button>
			          	
			          	<button type="button" class="btn btn-default" onclick="window.location.href='edicao.jsp?r=ocorrencia_forms.jsp?oc=${param.oc}'">
			            	<span class="glyphicon glyphicon-arrow-right" aria-hidden="true"></span> Próximo
			          	</button>

			        </div>
			        </center>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="cpeccv">cpeccv</label>
			          <div class="controls">
			            <input id="cpeccv" name="cpeccv" type="text" placeholder="" class="input-xlarge">
			            
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="rg">Registro Geral (RG)</label>
			          <div class="controls">
			            <input id="rg" name="rg" type="text" placeholder="" class="input-xlarge">
			            
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="perito">Perito</label>
			          <div class="controls">
			            <input id="perito" name="perito" type="text" placeholder="" class="input-xlarge">
			            
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="fotografo">Fotógrafo</label>
			          <div class="controls">
			            <input id="fotografo" name="fotografo" type="text" placeholder="" class="input-xlarge">
			            
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="motorista">Motorista</label>
			          <div class="controls">
			            <input id="motorista" name="motorista" type="text" placeholder="" class="input-xlarge">
			            
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="gerente">Gerente Chefe</label>
			          <div class="controls">
			            <input id="gerente" name="gerente" type="text" placeholder="" class="input-xlarge">
			            
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="comunicante">Comunicante</label>
			          <div class="controls">
			            <input id="comunicante" name="comunicante" type="text" placeholder="" class="input-xlarge">
			            
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label">Data da comunicação</label>
			          
			          <div class="controls">

			            <input id="data_comunicacao" type="text" class="input-xlarge datepick">

			            <input type='hidden' id="dia_comunicacao" name='dia_comunicacao'/>
			            <input type='hidden' id="mes_comunicacao" name='mes_comunicacao'/>
			            <input type='hidden' id="ano_comunicacao" name='ano_comunicacao'/>
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="hora_comunicacao">Hora da comunicação</label>
			          <div class="controls">
			            <input id="hora_comunicacao" name="hora_comunicacao" type="text" placeholder="" class="input-xlarge">
			          </div>
			        </div>

			        <!-- Select Basic -->
			        <div class="control-group">
			          <label class="control-label" for="tipo_pericia">Tipo de perícia</label>
			          <div class="controls">
			            <select id="tipo_pericia" name="tipo_pericia" class="input-xlarge">
			              <option>morte violenta</option>
			              <option>morte a esclarecer</option>
			            </select>
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="data_inic_pericia">Data de início da perícia</label>
			          <div class="controls">
			            <input id="data_inic_pericia" name="data_inic_pericia" type="text" placeholder="" class="input-xlarge datepick">
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="hora_inic_pericia">Hora de início da perícia</label>
			          <div class="controls">
			            <input id="hora_inic_pericia" name="hora_inic_pericia" type="text" placeholder="" class="input-xlarge">
			            
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="data_fim_pericia">Data de fim da perícia</label>
			          <div class="controls">
			            <input id="data_fim_pericia" name="data_fim_pericia" type="text" placeholder="" class="input-xlarge datepick">
			            
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="hora_fim_pericia">Hora de fim da perícia</label>
			          <div class="controls">
			            <input id="hora_fim_pericia" name="hora_fim_pericia" type="text" placeholder="" class="input-xlarge">
			            
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="data_fato">Data do fato</label>
			          <div class="controls">
			            <input id="data_fato" name="data_fato" type="text" placeholder="" class="input-xlarge datepick">
			            
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="hora_fato">Hora do Fato</label>
			          <div class="controls">
			            <input id="hora_fato" name="hora_fato" type="text" placeholder="" class="input-xlarge">
			            
			          </div>
			        </div>

			        <!-- Select Basic -->
			        <div class="control-group">
			          <label class="control-label" for="tipo_oc">Tipo de ocorrência</label>
			          <div class="controls">
			            <select id="tipo_oc" name="tipo_oc" class="input-xlarge">
			              <option>homicídio</option>
			              <option>suicídio</option>
			              <option>acidente</option>
			              <option>morte a esclarecer</option>
			            </select>
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="delegacia_local">Delegacia Local</label>
			          <div class="controls">
			            <input id="delegacia_local" name="delegacia_local" type="text" placeholder="" class="input-xlarge">
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="equipe_atendente">Equipe Atendente</label>
			          <div class="controls">
			            <input id="equipe_atendente" name="equipe_atendente" type="text" placeholder="" class="input-xlarge">
			          </div>
			        </div>

			        <!-- Text input-->
			        <div class="control-group">
			          <label class="control-label" for="bo_delegacia">Boletim de ocorrência</label>
			          <div class="controls">
			            <input id="bo_delegacia" name="bo_delegacia" type="text" placeholder="" class="input-xlarge">
			          </div>
			        </div>

			        <!-- BOTOES -->
			        <div class='buttons_end'>
			          <button type="button" class="btn btn-default btn-lg" onclick="window.location.href='edicao.jsp?r=/SIGOMweb/home.jsp'">
			            <span class="glyphicon glyphicon-home" aria-hidden="true"></span> Início
			          </button>
			          &nbsp;&nbsp;&nbsp;
			          <button type="button" class="btn btn-default btn-lg" onclick="window.location.href='edicao.jsp?r=ocorrencia_forms.jsp?oc=${param.oc}'">
			            <span class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true"></span> Próximo
			          </button>
			        </div>
		        </fieldset>
			</form>
		</div>

	</body>

</html>