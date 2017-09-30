<%@ page contentType="text/html; charset=utf-8" language="java" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%>
<stripes:layout-definition>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="cs" lang="cs">
<head>
	<title>Zakázky pod Lupou</title>

	<link type="text/css" media="screen" rel="stylesheet" title="Styl pro obrazovku" href="${pageContext.request.contextPath}/css/screen-page.css" />
	<link type="text/css" media="screen" rel="alternate stylesheet" title="Styl pro tisk" href="${pageContext.request.contextPath}/css/print.css"/>
	<link type="text/css" media="print" rel="stylesheet" href="${pageContext.request.contextPath}/css/print.css"/>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/zpl-common.js"></script>
</head>

<body>

	<div id="pg">
	<div id="header">
	<div class="lb">
	<div class="rb">
		<h1><span>Portál hlavního města Prahy</span></h1>
		<a id="link-home" href="home.html" accesskey="0">
  			<img src="${pageContext.request.contextPath}/images/texts/portal-2.gif" alt="Zpět na portál"/>
		</a>
	</div>
	</div>
	</div>
	<div class="reset">
		<hr/>
	</div>
	
	<!-- submenu -->
	<div id="submenu">
	<ul>
	<li>
		<a href="index.jsp" title="<fmt:message key='index_title'/>">
		<fmt:message key="index_nadpis" />
		</a>
	</li>
	</ul>
	</div>

	<stripes:layout-component name="econtent" />

    </div>
    <div style="visibility:hidden" id="google_analyst"><script type="text/javascript">
	var gaJsHost = "";
	var gaSetJsHost = "";
	if ("https:" == document.location.protocol) {
		gaJsHost = "https://ssl.";
		gaSetJsHost = "https://";
	} else {
		gaJsHost = "http://www.";
		gaSetJsHost = "http://";
	}
	document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
	document.write(unescape("%3Cscript src='" + gaSetJsHost + "www.praha.eu/file/129351/ga_set.js' type='text/javascript'%3E%3C/script%3E"));
</script></div>
</body>
</html>
</stripes:layout-definition>
