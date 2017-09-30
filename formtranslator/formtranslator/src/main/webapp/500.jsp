<%@ page contentType="text/html; charset=utf-8" language="java" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%> 
<%@page import="com.janousek.formtranslator.web.helper.ExceptionHelper"%>
<stripes:layout-render name="/WEB-INF/layout/defaultLayout.jsp" title="Chyba 500">

<stripes:layout-component name="menu">
</stripes:layout-component>

<stripes:layout-component name="contents">

<div id="content" style="width:100%;">
<h1>Interní chyba serveru (chyba 500)</h1>

<p>Identifikátor: <strong>${sessionScope['exception'].id}</strong> <a href="javascript:showHideElement('error_detail');">detail</a></p>

<p>Omlouváme se, ale nastala interní chyba serveru. Zřejmě se provádí úpravy nastavení serveru. Můžete to zkusit znovu nebo můžete přejít <a href="./index.jsp">na úvodní stránku</a>. Pokud problémy setrvávají, kontaktujte, prosím, administrátora.</p>

<p><a href="./index.jsp">&raquo;&nbsp;Zpět na úvodní stránku</a></p>

<pre id="error_detail" class="exception" style="display: none;">
	<%= new ExceptionHelper((Throwable)request.getSession().getAttribute("exception")) %>
</pre>

</div>	

</stripes:layout-component>
</stripes:layout-render>
