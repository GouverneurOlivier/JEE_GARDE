/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.76
 * Generated at: 2017-04-10 11:25:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link href=\"./ASSETS/css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link href=\"./ASSETS/login.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.1.1.js\"></script>\r\n");
      out.write("<script src=\"./ASSETS/js/login.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("    <div class=\"container\"> \r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("        \t<ul class=\"nav navbar-nav\">\r\n");
      out.write("        \t<li class=\"dropdown-toggle\">\r\n");
      out.write("          \t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" >My Garde Alterne</a>\r\n");
      out.write("          \t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("            \t\t\t<li><a href=\"#\">Gestion du compte</a></li>\r\n");
      out.write("            \t\t\t<li><a href=\"#\">Evénements</a></li>\r\n");
      out.write("            \t\t\t<li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("            \t\t\t<li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("            \t\t\t<li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("            \t\t\t<li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("            \t\t\t<li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("         \t\t\t</ul>\r\n");
      out.write("        \t</li>\r\n");
      out.write("      \t\t</ul>\r\n");
      out.write("           \r\n");
      out.write("          \t<p class=\"navbar-text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"collapse navbar-collapse\">\r\n");
      out.write("           \r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        \r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-user\"></span><strong>Compte Client</strong>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                        <form action=\"Main\" Method=\"post\" >\r\n");
      out.write("                            <div class=\"navbar-login\">\r\n");
      out.write("                                <div class=\"row\" id=\"test\">\r\n");
      out.write("                                   \r\n");
      out.write("                                    <div class=\"col-lg-12\">\r\n");
      out.write("                                      \t<p><input type=\"text\" class=\"form-control\" name=\"username\" id=\"input1\" placeholder=\"UserName\" required=\"\" autofocus=\"\" /></p>\r\n");
      out.write("                                        <p><input type=\"text\" class=\"form-control\" name=\"password\" id=\"input2\" placeholder=\"PassWord\" required=\"\" autofocus=\"\" /></p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-12\">\r\n");
      out.write("                                        <p class=\"text-left\">\r\n");
      out.write("                                            <button  class=\"btn btn-danger btn-block btn-sm\" name=\"Log\"  id=\"log\" type=\"Submit\" onclick=\"myfunction()\">Login</button>                                                                                      \r\n");
      out.write("                                        </p>\r\n");
      out.write("                                   \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <form action=\"Main\" Method=\"post\" >\r\n");
      out.write("                             <div class=\"navbar-login\">\r\n");
      out.write("                            <button  class=\"btn btn-danger btn-block btn-sm\" name=\"delog\" type=\"Submit\" value=\"delog\">DeLog</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            \r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <div class=\"navbar-login navbar-login-session\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-lg-12\">\r\n");
      out.write("                                        <p>\r\n");
      out.write("                                            <a href=\"");
      out.print(request.getContextPath()+response.encodeURL("/CreationCpt") );
      out.write("\" class=\"btn btn-primary btn-block btn-sm\">Register</a>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</head>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
