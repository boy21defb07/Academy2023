<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Mis Pokemons</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header"Align="center">
			<h2>Mis Pokemons</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			<input type="button" value="Agregar Pokemon"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Nombre</th>
					<th>Tipo</th>
					<th>Region</th>
					<th>Acciones</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempPokemons" items="${pokemons}">
				
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/pokemon/showFormForUpdate">
						<c:param name="pokeId" value="${tempPokemons.id}" />
					</c:url>					

					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/pokemon/delete">
						<c:param name="pokeId" value="${tempPokemons.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempPokemons.nombre} </td>
						<td> ${tempPokemons.tipo} </td>
						<td> ${tempPokemons.region} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}" class="add-button">Actualizar</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Deseas Abandonar a tu Pokemon?'))) return false" class="add-button">Abandonar</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









