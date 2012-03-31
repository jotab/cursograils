<html>
	<head>
		<title>Calculadora</title>
	</head>
	
	<body>
		<h1>Calculadora Grails</h1>
		<g:if test="${flash.mensagem}"> 
			<h2 style="color: red">${flash.mesagem}</h2>
		</g:if>
		<form action="resultado" method="post">
			A: <input type="text" name="A">
			<br/>
			B: <input type="text" name="B">
			<br/>	
			<input type="submit" value="+"/>	
		<form>
	</body>
	
</html>