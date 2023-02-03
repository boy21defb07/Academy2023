<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Agregar Pokemon</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-pokemon-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header" Align="center">
			<h2>Mis Pokemons</h2>
		</div>
	</div>

	<div id="container">
		<h3>Guardar o Actualizar Pokemon</h3>
	
		<form:form action="savePokemon" modelAttribute="pokemon" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />
					
			<table>
				<tbody>
					<tr>
						<td><label>Nombre:</label></td>
						<td><form:input path="Nombre" /></td>
					</tr>
				
					<tr>
						<td><label>Tipo:</label></td>
						<td><form:input path="Tipo" /></td>
					</tr>

					<tr>
						<td><label>Region:</label></td>
						<td><form:input path="Region" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Guardar" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/pokemon/list">Back to List</a>
		</p>
	
	</div>

</body>

</html>










