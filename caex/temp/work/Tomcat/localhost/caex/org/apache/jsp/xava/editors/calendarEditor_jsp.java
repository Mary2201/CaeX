/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.106
 * Generated at: 2025-07-11 23:33:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.model.meta.MetaProperty;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.openxava.web.dwr.Calendar;
import java.util.prefs.Preferences;
import org.openxava.util.Users;
import org.openxava.view.View;
import org.openxava.tab.Tab;
import org.openxava.controller.ModuleManager;
import org.openxava.controller.meta.MetaControllers;
import org.openxava.controller.meta.MetaAction;
import org.openxava.util.Dates;

public final class calendarEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/estef/Downloads/openxava-studio-7-r4-windows/openxava-studio-7-r4/workspace/caex/target/caex/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1750463948000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1745102047482L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1750463948000L));
    _jspx_dependants.put("jar:file:/C:/Users/estef/Downloads/openxava-studio-7-r4-windows/openxava-studio-7-r4/workspace/caex/target/caex/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0.tld", Long.valueOf(1153403082000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(19);
    _jspx_imports_classes.add("org.openxava.model.meta.MetaProperty");
    _jspx_imports_classes.add("java.util.Arrays");
    _jspx_imports_classes.add("org.openxava.util.Dates");
    _jspx_imports_classes.add("java.util.Collection");
    _jspx_imports_classes.add("org.openxava.web.dwr.Calendar");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("java.util.prefs.Preferences");
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaAction");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.openxava.controller.ModuleManager");
    _jspx_imports_classes.add("org.openxava.util.Users");
    _jspx_imports_classes.add("org.openxava.view.View");
    _jspx_imports_classes.add("org.openxava.tab.Tab");
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaControllers");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      org.openxava.util.Messages errors = null;
      errors = (org.openxava.util.Messages) _jspx_page_context.getAttribute("errors", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (errors == null){
        errors = new org.openxava.util.Messages();
        _jspx_page_context.setAttribute("errors", errors, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\r');
      out.write('\n');
 
ModuleManager manager = (ModuleManager) context.get(request, "manager", "org.openxava.controller.ModuleManager");
View view = (View) context.get(request, "xava_view");
Tab tab = (Tab) context.get(request, "xava_tab");
String prefNodeName = tab.getPreferencesNodeName("datePref.");
Preferences preferences = Users.getCurrentPreferences();
String datePref = preferences.get(prefNodeName,"");
String dateNamePref = preferences.get(prefNodeName + "_SimpleName","");
List<MetaProperty> metaPropertiesList = new ArrayList<>(view.getMetaPropertiesList());
List<String> datesProperties = Arrays.asList(
            "java.util.Date", "java.time.LocalDateTime", "java.sql.Timestamp", "java.time.LocalDate", 
			"java.util.Date", "java.sql.Date", "java.time.LocalDateTime", "java.sql.Timestamp");
List<String> calculatedProperties = new ArrayList<>(tab.getMetaTab().getMetaModel().getCalculatedPropertiesNames());
List<MetaProperty> datePropertyList = new ArrayList<>();
for (MetaProperty mp : metaPropertiesList) {
    if (datesProperties.contains(mp.getTypeName()) 
        && !calculatedProperties.contains(mp.getName())) {
        datePropertyList.add(mp);
    }
}
String contextPath = (String) request.getAttribute("xava.contextPath");
if (contextPath == null) contextPath = request.getContextPath();
String version = org.openxava.controller.ModuleManager.getVersion();
String action = request.getParameter("rowAction");
action=action==null?manager.getEnvironment().getValue("XAVA_CALENDAR_VIEWEVENT_ACTION"):action;
String dateFormat = Dates.dateFormatForJSCalendar(true);
String actionNew = "";
boolean hasDateTime = view.getMetaModel().hasDateTimeProperty();
for (MetaAction ma: manager.getMetaActions()) {
   if (ma.getName().equals("new")) {
       actionNew = ma.getQualifiedName();
       break;
   }
}

if (dateFormat != null) {
    dateFormat = dateFormat.replace("n", "M")
                           .replace("m", "MM")
			               .replace("d", "dd")
				           .replace("j", "d")
						   .replace("H", "H")
						   .replace("h", "h")
						   .replace("G", "hh")
						   .replace("i", "mm")
				           .replace("Y", "yyyy");
}

if (datePropertyList.size() > 1) {

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"ox-layout-detail ox-center-calendar\">\r\n");
      out.write("    <select class=\"xava_calendar_date_preferences\">\r\n");
      out.write("        <option id=\"xava_calendar_date_preferences\" value=\"");
      out.print( dateNamePref.isEmpty() ? datePropertyList.get(0).getSimpleName() : dateNamePref );
      out.write('"');
      out.write('>');
      out.print( datePref.isEmpty() ? datePropertyList.get(0).getLabel() : datePref );
      out.write("</option>\r\n");
      out.write("        ");
 
        for (int i = datePref.isEmpty() ? 1 : 0; i < datePropertyList.size(); i++) {
			MetaProperty mp = datePropertyList.get(i);
            if (datesProperties.contains(mp.getTypeName()) && !calculatedProperties.contains(mp.getName()) && !mp.getLabel().equals(datePref)) {
        
      out.write("\r\n");
      out.write("            <option value=\"");
      out.print(mp.getSimpleName());
      out.write('"');
      out.write('>');
      out.print(mp.getLabel());
      out.write("</option>\r\n");
      out.write("        ");
 
            }
        }
        
      out.write("\r\n");
      out.write("    </select>\r\n");
      out.write("</div>\r\n");
 } else { 
      out.write("\r\n");
      out.write("	<input type=\"hidden\" id=\"xava_calendar_date_preferences\" value=\"");
      out.print(datePropertyList.get(0).getSimpleName());
      out.write("\">\r\n");
 } 
      out.write("\r\n");
      out.write("<div id=\"nodata\" class=\"ox-calendar-errors ox-display-none\">\r\n");
      out.write("	<div class=\"ox-errors\">\r\n");
      out.write("		<b>");
      if (_jspx_meth_xava_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</b>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("    <input type=\"hidden\" id=\"xava_calendar_module\" value=\"");
      out.print(request.getParameter("module"));
      out.write("\">\r\n");
      out.write("    <input type=\"hidden\" id=\"xava_calendar_application\" value=\"");
      out.print(request.getParameter("application"));
      out.write("\">\r\n");
      out.write("    <input type=\"hidden\" id=\"xava_calendar_action\" value=\"");
      out.print(action);
      out.write(',');
      out.print(actionNew);
      out.write("\">\r\n");
      out.write("    <input type=\"hidden\" id=\"xava_calendar_dateFormat\" value=\"");
      out.print(dateFormat);
      out.write("\">\r\n");
      out.write("	<input type=\"hidden\" id=\"xava_calendar_hasDateTime\" value=\"");
      out.print(hasDateTime);
      out.write("\">\r\n");
      out.write("	<input type=\"hidden\" id=\"xava_calendar_nextYear\" value=\"");
      if (_jspx_meth_xava_005flabel_005f0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("	<input type=\"hidden\" id=\"xava_calendar_prevYear\" value=\"");
      if (_jspx_meth_xava_005flabel_005f1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id='xava_calendar' class='xava_calendar'></div>\r\n");
      out.write("\r\n");
      out.write("<script type='text/javascript' ");
      if (_jspx_meth_xava_005fnonce_005f0(_jspx_page_context))
        return;
      out.write(" src='");
      out.print(contextPath);
      out.write("/dwr/interface/Calendar.js?ox=");
      out.print(version);
      out.write("'></script>");
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

  private boolean _jspx_meth_xava_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f0 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    _jspx_th_xava_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fmessage_005f0.setParent(null);
    // /xava/editors/calendarEditor.jsp(90,5) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f0.setKey("calendar_error");
    int _jspx_eval_xava_005fmessage_005f0 = _jspx_th_xava_005fmessage_005f0.doStartTag();
    if (_jspx_th_xava_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_xava_005flabel_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:label
    org.openxava.web.taglib.LabelTag _jspx_th_xava_005flabel_005f0 = (org.openxava.web.taglib.LabelTag) _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody.get(org.openxava.web.taglib.LabelTag.class);
    _jspx_th_xava_005flabel_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xava_005flabel_005f0.setParent(null);
    // /xava/editors/calendarEditor.jsp(99,57) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005flabel_005f0.setKey("nextYear");
    int _jspx_eval_xava_005flabel_005f0 = _jspx_th_xava_005flabel_005f0.doStartTag();
    if (_jspx_th_xava_005flabel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005flabel_005f0);
    return false;
  }

  private boolean _jspx_meth_xava_005flabel_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:label
    org.openxava.web.taglib.LabelTag _jspx_th_xava_005flabel_005f1 = (org.openxava.web.taglib.LabelTag) _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody.get(org.openxava.web.taglib.LabelTag.class);
    _jspx_th_xava_005flabel_005f1.setPageContext(_jspx_page_context);
    _jspx_th_xava_005flabel_005f1.setParent(null);
    // /xava/editors/calendarEditor.jsp(100,57) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005flabel_005f1.setKey("prevYear");
    int _jspx_eval_xava_005flabel_005f1 = _jspx_th_xava_005flabel_005f1.doStartTag();
    if (_jspx_th_xava_005flabel_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005flabel_005f1);
    return false;
  }

  private boolean _jspx_meth_xava_005fnonce_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:nonce
    org.openxava.web.taglib.NonceTag _jspx_th_xava_005fnonce_005f0 = (org.openxava.web.taglib.NonceTag) _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody.get(org.openxava.web.taglib.NonceTag.class);
    _jspx_th_xava_005fnonce_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fnonce_005f0.setParent(null);
    int _jspx_eval_xava_005fnonce_005f0 = _jspx_th_xava_005fnonce_005f0.doStartTag();
    if (_jspx_th_xava_005fnonce_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody.reuse(_jspx_th_xava_005fnonce_005f0);
    return false;
  }
}
