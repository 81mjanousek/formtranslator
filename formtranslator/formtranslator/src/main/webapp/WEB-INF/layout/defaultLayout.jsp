<%@ page contentType="text/html; charset=utf-8" language="java" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<stripes:layout-definition>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en" ng-app="translator">
	<head>
	<stripes:layout-component name="html-head">
		<%@ include file="/WEB-INF/layout/html-head.jsp" %>
	</stripes:layout-component>
	<stripes:layout-component name="javascript"/>
	</head>
	<body>
		
	<!-- header -->
	<stripes:layout-component name="header">
	    <%@ include file="/WEB-INF/layout/header.jsp" %>
	</stripes:layout-component>
	

<!-- <div style="float:right;"> -->
<%-- <fmt:message key="app_info_version_title"/> --%>
<%-- <%=AppContextParam._get().getVersion()%> --%>
<!-- </div> -->

<stripes:layout-component name="contents" />


	<!-- footer -->
	<stripes:layout-component name="footer">
	    <%@ include file="/WEB-INF/layout/footer.jsp" %>
	</stripes:layout-component>

	</body>	
</html>
</stripes:layout-definition>