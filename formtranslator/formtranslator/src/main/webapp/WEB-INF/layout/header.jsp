<%@ page contentType="text/html; charset=utf-8" language="java"
	pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%>
<%@page import="com.janousek.formtranslator.common.SessionContext"%>

<div id="header">
<div id="languageSelectDiv"> 
<stripes:form beanclass="${beanClass}" id="languageForm">
<stripes:label for="language" title="selectLanguage"/>
<stripes:select name="language" class="floatRight" id="languageSelect" value="${pageContext.request.locale.language}">
<stripes:options-enumeration enum="com.janousek.formtranslator.enums.LanguageEnum"/>
</stripes:select>
<stripes:submit name="changeLocale" style="display:none"></stripes:submit>
</stripes:form>
</div>
<script>
$( "#languageSelect" ).change(function() {
$( "#languageForm" ).submit();
});
</script>

</div> 


