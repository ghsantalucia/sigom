/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-05-23 05:58:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ocorrencia_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\t<head>\r\n");
      out.write("\t\t<!-- ARQUIVOS DO HEAD COMPARTILHADOS POR TODOS OS FORMULÁRIOS -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "forms_head.jsp", out, false);
      out.write("\r\n");
      out.write("\t    \r\n");
      out.write("\t\t<!-- TITULO -->\r\n");
      out.write("\t\t<title>Ocorrência</title>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</head>\r\n");
      out.write("  \r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class='form_container'>\r\n");
      out.write("\t\t\t<fieldset class=\"form-horizontal\">\r\n");
      out.write("\r\n");
      out.write("\t\t        <!-- Form Name -->\r\n");
      out.write("\t\t        <legend>Ocorrência</legend>\r\n");
      out.write("\r\n");
      out.write("\t\t        <!-- MENU SUPERIOR -->      \r\n");
      out.write("\t\t        <center>\r\n");
      out.write("\t\t        <div class=\"btn-group buttons_top\" role=\"group\" aria-label=\"...\">\r\n");
      out.write("\r\n");
      out.write("\t\t           <button type=\"button\" class=\"btn btn-default\" onclick=\"window.location.href='home.jsp'\">\r\n");
      out.write("\t\t            <span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Início\r\n");
      out.write("\t\t          </button>\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t           <button type=\"button\" class=\"btn btn-default\" onclick=\"window.location.href='ocorrencia.jsp?oc=*'\">\r\n");
      out.write("\t\t            <span class=\"glyphicon glyphicon-arrow-left\" aria-hidden=\"true\"></span> Voltar\r\n");
      out.write("\t\t          </button>\r\n");
      out.write("\r\n");
      out.write("\t\t          <button type=\"button\" class=\"btn btn-default\" onclick=\"window.location.href='concluir.jsp?oc=*'\">\r\n");
      out.write("\t\t            <span class=\"glyphicon glyphicon-ok-sign\" aria-hidden=\"true\"></span> Concluir\r\n");
      out.write("\t\t          </button>\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t        </center>\r\n");
      out.write("\t\t    \t\r\n");
      out.write("\t\t    \t<!-- LISTA DE FORMULARIOS FILHOS -->\r\n");
      out.write("\t\t    \t<div class=\"list-group\">\r\n");
      out.write("\t\t\t\t\t<span class=\"list-group-item active\">Vítimas \r\n");
      out.write("\t\t        \t\t<span data-container=\"body\" data-toggle=\"popover\" data-placement=\"left\" data-content=\"Vivamus sagittis lacus vel augue laoreet rutrum faucibus.\" class=\"glyphicon glyphicon-info-sign form_info\"></span>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t<a href=\"criar.jsp?form=vitima&oc=*\" class=\"list-group-item\"><span class='glyphicon glyphicon-plus-sign'></span> <b>Adicionar nova vítima</b></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"vitima.jsp?oc=*&vit=*\" class=\"list-group-item\">Vítima 001</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t    \t<!-- LISTA DE FORMULARIOS FILHOS -->\r\n");
      out.write("\t\t    \t<div class=\"list-group\">\r\n");
      out.write("\t\t\t\t\t<span class=\"list-group-item active\">Locais \r\n");
      out.write("\t\t        \t\t<span data-container=\"body\" data-toggle=\"popover\" data-placement=\"left\" data-content=\"Vivamus sagittis lacus vel augue laoreet rutrum faucibus.\" class=\"glyphicon glyphicon-info-sign form_info\"></span>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t  <a href=\"criar.jsp?form=endereco&oc=*\" class=\"list-group-item\"><span class='glyphicon glyphicon-plus-sign'></span> <b>Adicionar novo local</b></a>\r\n");
      out.write("\t\t\t\t  <a href=\"endereco.jsp?oc=*&end=*\" class=\"list-group-item\">Local Imediato</a>\r\n");
      out.write("\t\t\t\t  <a href=\"endereco.jsp?oc=*&end=*\" class=\"list-group-item\">Local Mediato</a>\r\n");
      out.write("\t\t\t\t  <a href=\"endereco.jsp?oc=*&end=*\" class=\"list-group-item\">Local Relacionado</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t    \t<!-- LISTA DE FORMULARIOS FILHOS -->\r\n");
      out.write("\t\t    \t<div class=\"list-group\">\r\n");
      out.write("\t\t\t\t\t<span class=\"list-group-item active\">Vestígios \r\n");
      out.write("\t\t        \t\t<span data-container=\"body\" data-toggle=\"popover\" data-placement=\"left\" data-content=\"Vivamus sagittis lacus vel augue laoreet rutrum faucibus.\" class=\"glyphicon glyphicon-info-sign form_info\"></span>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t  <a href=\"criar.jsp?form=vestigio&oc=*\" class=\"list-group-item\"><span class='glyphicon glyphicon-plus-sign'></span> <b>Adicionar novo vestígio</b></a>\r\n");
      out.write("\t\t\t\t  <a href=\"vestigio.jsp?oc=*&ves=*\" class=\"list-group-item\">Vestígio 001</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t    \t<!-- LISTA DE FORMULARIOS FILHOS -->\r\n");
      out.write("\t\t    \t<div class=\"list-group\">\r\n");
      out.write("\t\t\t\t\t<span class=\"list-group-item active\">Equipes de Socorro \r\n");
      out.write("\t\t        \t\t<span data-container=\"body\" data-toggle=\"popover\" data-placement=\"left\" data-content=\"Vivamus sagittis lacus vel augue laoreet rutrum faucibus.\" class=\"glyphicon glyphicon-info-sign form_info\"></span>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t  <a href=\"criar.jsp?form=equipeSocorro&oc=*\" class=\"list-group-item\"><span class='glyphicon glyphicon-plus-sign'></span> <b>Adicionar nova equipe</b></a>\r\n");
      out.write("\t\t\t\t  <a href=\"equipeSocorro.jsp?oc=*&eq=*\" class=\"list-group-item\">SAMU</a>\r\n");
      out.write("\t\t\t\t  <a href=\"equipeSocorro.jsp?oc=*&eq=*\" class=\"list-group-item\">Bombeiros</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t    \t<!-- LISTA DE FORMULARIOS FILHOS -->\r\n");
      out.write("\t\t    \t<div class=\"list-group\">\r\n");
      out.write("\t\t\t\t\t<span class=\"list-group-item active\">Pessoas \r\n");
      out.write("\t\t        \t\t<span data-container=\"body\" data-toggle=\"popover\" data-placement=\"left\" data-content=\"Vivamus sagittis lacus vel augue laoreet rutrum faucibus.\" class=\"glyphicon glyphicon-info-sign form_info\"></span>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t  <a href=\"criar.jsp?form=pessoa&oc=*\" class=\"list-group-item\"><span class='glyphicon glyphicon-plus-sign'></span> <b>Adicionar nova pessoa</b></a>\r\n");
      out.write("\t\t\t\t  <a href=\"pessoa.jsp?oc=*&pes=*\" class=\"list-group-item\">Pessoa 001</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t    \t<!-- LISTA DE FORMULARIOS FILHOS -->\r\n");
      out.write("\t\t    \t<div class=\"list-group\">\r\n");
      out.write("\t\t\t\t\t<span class=\"list-group-item active\">Observações\r\n");
      out.write("\t\t        \t\t<span data-container=\"body\" data-toggle=\"popover\" data-placement=\"left\" data-content=\"Vivamus sagittis lacus vel augue laoreet rutrum faucibus.\" class=\"glyphicon glyphicon-info-sign form_info\"></span>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t  <a href=\"criar.jsp?form=observacao&oc=*\" class=\"list-group-item\"><span class='glyphicon glyphicon-plus-sign'></span> <b>Adicionar nova observação</b></a>\r\n");
      out.write("\t\t\t\t  <a href=\"observacao.jsp?oc=*&obs=*\" class=\"list-group-item\">Observação do cadáver</a>\r\n");
      out.write("\t\t\t\t  <a href=\"observacao.jsp?oc=*&obs=*\" class=\"list-group-item\">Observação dos exames</a>\r\n");
      out.write("\t\t\t\t  <a href=\"observacao.jsp?oc=*&obs=*\" class=\"list-group-item\">Observação da conclusão</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t    </fieldset>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
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
