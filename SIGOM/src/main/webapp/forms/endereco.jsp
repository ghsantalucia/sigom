<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-BR">

  <head>
    
    <!-- META TAGS -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <!-- TITULO -->
    <title>Local</title>

    <!-- FAVICON -->
    <link rel="icon" href="../default/icon.png" type="image/x-icon" />
    <link rel="shortcut icon" href="../default/icon.png" type="image/x-icon" />
    
    <!-- BOOTSTRAP -->
    <link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap/bootstrap-responsive.min.css" rel="stylesheet">
    <link href="css/bootstrap/custom.css" rel="stylesheet">
    <link href="css/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- jQUERY --> 
    <link rel="stylesheet" href="css/jquery/jquery-ui.css">
    <link rel="stylesheet" href="css/jquery/jquery.mobile.datepicker.css">
    <script src="js/jquery/jquery-1.10.2.js"></script>
    <script src="js/jquery/jquery-ui.js"></script>
    
    <!-- ARQUIVOS DEFAULT -->
    <link rel="stylesheet" type="text/css" href="css/forms.css" />
    <script src="js/forms.js"></script>
    
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
          <button type="button" class="btn btn-default">
            <span class="glyphicon glyphicon-home" aria-hidden="true"></span> Início
          </button>
          <button type="button" class="btn btn-default">
            <span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span> Voltar
          </button>
          <button type="button" class="btn btn-default">
            <span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> Novo
          </button>
          <button type="button" class="btn btn-default">
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
            <input id="estado" name="estado" type="text" placeholder="" class="input-xlarge">
            
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
            <input id="coordenadas" name="coordenadas" type="text" placeholder="" class="input-xlarge gps">
            
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
          <button type="button" class="btn btn-default btn-lg">
            <span class="glyphicon glyphicon-circle-arrow-left" aria-hidden="true"></span> Voltar
          </button>
          &nbsp;&nbsp;&nbsp;
          <button type="button" class="btn btn-default btn-lg">
            <span class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true"></span> Próximo
          </button>
        </div>

        </fieldset>
      </form>
    </div>

  </body>

</html>