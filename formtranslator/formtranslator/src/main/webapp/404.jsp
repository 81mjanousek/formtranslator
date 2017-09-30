<%@ page contentType="text/html; charset=utf-8" language="java" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%> 
<stripes:layout-render name="/WEB-INF/layout/defaultLayout.jsp" title="Chyba 404">


<stripes:layout-component name="contents">

<div id="content">
<h1>Stránka nenalezena (chyba 404)</h1>

<p>Je nám líto, ale požadovaná stránka se bohužel na serveru nenachází - patrně byla odstraněna, přemístěna nebo přejmenována.</p>

<h4>Doporučené řešení problému:</h4>

<ul>
	<li>Pokud jste zadali adresu do prohlížeče ručně, zkontrolujte případné překlepy.</li>
	<li>Přejděte na <a href="./index.jsp">úvodní stránku</a> webu a dál pokračujte odtud.</li>
 	<li>Návrat <a href="javascript: history.back();">zpět na předchozí stránku.</a></li>
</ul>

<p>Pokud problémy setrvávají, kontaktujte, prosím, administrátora.</p>

<p><a href="./index.jsp">&raquo;&nbsp;Zpět na úvodní stránku</a></p>

</div>	

</stripes:layout-component>
</stripes:layout-render>
