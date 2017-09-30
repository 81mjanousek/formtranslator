<%@ page isErrorPage="true"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<style type="text/css">
#redirect {
	overflow: hidden;
	color: black;
	font-family: Verdana, 'Geneva CE', lucida, sans-serif;
	font-size: 1em;
}
</style>
<body>
<p id="redirect">Probíhá přesměrování na chybovou stránku aplikace.</p>

<script type="text/javascript">
  var redirect = function redirect(){
  	url = location.href;
  	var rightURL = "";
  	context = '${pageContext.request.contextPath}';
  	if(url.search(context) == -1){
  	rightURL = '/404.jsp';
  	}
  	else{
  	page = '404.jsp'; 
  	expression = new RegExp(context +"/.*");  
  	rootURL = url.replace(expression, context + "/"); 
  	rightURL = rootURL + page;}
  	
  	top.location.replace(rightURL);
  };
  setTimeout(redirect, 10);
</script>
</body>
</html>