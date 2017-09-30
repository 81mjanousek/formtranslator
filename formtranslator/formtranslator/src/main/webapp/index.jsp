<%@ page contentType="text/html; charset=utf-8" language="java" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<stripes:layout-render name="/WEB-INF/layout/defaultLayout.jsp">
	<stripes:layout-component name="contents">

<!-- BEGIN PAGE CONTENT -->

<div id="content">

<h1><fmt:message key="index.title"/></h1>

<p></p>

<h3><fmt:message key="index.availableForms"/></h3>

<ul style="list-style: none; margin-top: 0.6em;">
	<li><fmt:message key="index.i-485.link"/></li>
</ul>

</div>
	
	</stripes:layout-component>
</stripes:layout-render>