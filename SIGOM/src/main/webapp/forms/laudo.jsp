<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-BR">

  <head>
    
    <!-- META TAGS -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <!-- TITULO -->
    <title>Laudo</title>
    

    <!-- FAVICON -->
    <link rel="icon" href="" type="image/x-icon" />
    <link rel="shortcut icon" href="" type="image/x-icon" />
    
    <!-- BOOTSTRAP -->
    <link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap/bootstrap-responsive.min.css" rel="stylesheet">
    <link href="css/bootstrap/custom.css" rel="stylesheet">

    <!-- jQUERY --> 
    <link rel="stylesheet" href="css/jquery/jquery-ui.css">
    <link rel="stylesheet" href="css/jquery/jquery.mobile.datepicker.css">
    <script src="js/jquery/jquery-1.10.2.js"></script>
    <script src="js/jquery/jquery-ui.js"></script>
    
    <!-- ARQUIVOS DEFAULT -->
    <link rel="stylesheet" type="text/css" href="css/forms.css" />
    <script src="js/forms.js"></script>
    <script src="js/form_laudo.js"></script>
    
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