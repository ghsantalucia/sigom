/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-05-22 03:00:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ocorrencia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"pt-BR\">\r\n");
      out.write("\r\n");
      out.write("  <head>\r\n");
      out.write("    \r\n");
      out.write("    <!-- META TAGS -->\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- TITULO -->\r\n");
      out.write("    <title>Ocorrência</title>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- FAVICON -->\r\n");
      out.write("    <link rel=\"icon\" href=\"\" type=\"image/x-icon\" />\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"\" type=\"image/x-icon\" />\r\n");
      out.write("    \r\n");
      out.write("    <!-- BOOTSTRAP -->\r\n");
      out.write("    <link href=\"css/bootstrap/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/bootstrap/bootstrap-responsive.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/bootstrap/custom.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- jQUERY --> \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery/jquery-ui.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery/jquery.mobile.datepicker.css\">\r\n");
      out.write("    <script src=\"js/jquery/jquery-1.10.2.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery/jquery-ui.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- ARQUIVOS DEFAULT -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/forms.css\" />\r\n");
      out.write("    <script src=\"js/forms.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("    <div class='form_container'>\r\n");
      out.write("      <form action=\"\" method=\"post\" class=\"form-horizontal\">\r\n");
      out.write("        <fieldset>\r\n");
      out.write("\r\n");
      out.write("        <!-- Form Name -->\r\n");
      out.write("        <legend>Ocorrência</legend>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"cpeccv\">cpeccv</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"cpeccv\" name=\"cpeccv\" type=\"text\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"rg\">Registro Geral (RG)</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"rg\" name=\"rg\" type=\"text\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"perito\">Perito</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"perito\" name=\"perito\" type=\"text\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"fotografo\">Fotógrafo</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"fotografo\" name=\"fotografo\" type=\"text\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"motorista\">Motorista</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"motorista\" name=\"motorista\" type=\"text\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"gerente\">Gerente Chefe</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"gerente\" name=\"gerente\" type=\"text\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"comunicante\">Comunicante</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"comunicante\" name=\"comunicante\" type=\"text\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\">Data da comunicação</label>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("            <input id=\"data_comunicacao\" type=\"text\" class=\"input-xlarge datepick\">\r\n");
      out.write("\r\n");
      out.write("            <input type='hidden' id=\"dia_comunicacao\" name='dia_comunicacao'/>\r\n");
      out.write("            <input type='hidden' id=\"mes_comunicacao\" name='mes_comunicacao'/>\r\n");
      out.write("            <input type='hidden' id=\"ano_comunicacao\" name='ano_comunicacao'/>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"hora_comunicacao\">Hora da comunicação</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"hora_comunicacao\" name=\"hora_comunicacao\" type=\"text\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Select Basic -->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"tipo_pericia\">Tipo de perícia</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <select id=\"tipo_pericia\" name=\"tipo_pericia\" class=\"input-xlarge\">\r\n");
      out.write("              <option>morte violenta</option>\r\n");
      out.write("              <option>morte a esclarecer</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"data_inic_pericia\">Data de início da perícia</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"data_inic_pericia\" name=\"data_inic_pericia\" type=\"text\" placeholder=\"\" class=\"input-xlarge datepick\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"hora_inic_pericia\">Hora de início da perícia</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"hora_inic_pericia\" name=\"hora_inic_pericia\" type=\"text\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"data_fim_pericia\">Data de fim da perícia</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"data_fim_pericia\" name=\"data_fim_pericia\" type=\"text\" placeholder=\"\" class=\"input-xlarge datepick\">\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"hora_fim_pericia\">Hora de fim da perícia</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"hora_fim_pericia\" name=\"hora_fim_pericia\" type=\"text\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"data_fato\">Data do fato</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"data_fato\" name=\"data_fato\" type=\"text\" placeholder=\"\" class=\"input-xlarge datepick\">\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"hora_fato\">Hora do Fato</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"hora_fato\" name=\"hora_fato\" type=\"text\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Select Basic -->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"tipo_oc\">Tipo de ocorrência</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <select id=\"tipo_oc\" name=\"tipo_oc\" class=\"input-xlarge\">\r\n");
      out.write("              <option>homicídio</option>\r\n");
      out.write("              <option>suicídio</option>\r\n");
      out.write("              <option>acidente</option>\r\n");
      out.write("              <option>morte a esclarecer</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"delegacia_local\">Delegacia Local</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"delegacia_local\" name=\"delegacia_local\" type=\"text\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"equipe_atendente\">Equipe Atendente</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"equipe_atendente\" name=\"equipe_atendente\" type=\"text\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Text input-->\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\" for=\"bo_delegacia\">Boletim de ocorrência</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input id=\"bo_delegacia\" name=\"bo_delegacia\" type=\"text\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <input type='submit' value='Próximo formulário'/>\r\n");
      out.write("\r\n");
      out.write("        </fieldset>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}