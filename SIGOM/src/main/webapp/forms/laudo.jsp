<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-BR">

	<head>
		<!-- ARQUIVOS DO HEAD COMPARTILHADOS POR TODOS OS FORMULÁRIOS -->
		<jsp:include page="forms_head.jsp" />
	    
		<!-- TITULO -->
		<title>Laudo</title>
		
	</head>
  
	<body>

		<div class='form_container'>
		  <form class="form-horizontal">
		    <fieldset>

		    <!-- Form Name -->
		    <legend>Laudo</legend>

		    <!-- Text input-->
		    <div class="control-group">
		      <label class="control-label" for="solicitante_laudo">Solicitante do Laudo</label>
		      <div class="controls">
		        <input id="solicitante_laudo" name="solicitante_laudo" type="text" placeholder="" class="input-xlarge">
		        
		      </div>
		    </div>

		    <!-- Text input-->
		    <div class="control-group">
		      <label class="control-label" for="num_fotos">Fotos anexadas</label>
		      <div class="controls">
		        <input id="num_fotos" name="num_fotos" type="text" placeholder="" class="input-xlarge">
		        
		      </div>
		    </div>

		    <!-- Textarea -->
		    <div class="control-group">
		      <label class="control-label" for="historico_laudo">Histórico da ocorrência</label>
		      <div class="controls">                     
		        <textarea id="historico_laudo" name="historico_laudo"></textarea>
		      </div>
		    </div>

		    <!-- Textarea -->
		    <div class="control-group">
		      <label class="control-label" for="conclusao">Conclusão do laudo</label>
		      <div class="controls">                     
		        <textarea id="conclusao" name="conclusao"></textarea>
		      </div>
		    </div>

		    </fieldset>
		    </form>

		    <input type='submit' value='Próximo formulário'/>

		    </fieldset>
		  </form>
		</div>

	</body>

</html>