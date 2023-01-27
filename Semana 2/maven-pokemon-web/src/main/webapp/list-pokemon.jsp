<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Pokemon App</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<body>

	<div id="wrapper">
		<div id="header" align="center">
			<h2>Mis Pokemons</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Student -->
			
			<input type="button" value="Agregar Pokemon" 
				   onclick="window.location.href='add-pokemon.jsp'; return false;"
				   class="add-student-button"
			/>
			
			<table>
			
				<tr>
					<th>Nombre</th>
					<th>Tipo</th>
					<th>Region</th>
					<th>Modificacion</th>
				</tr>
				
				<c:forEach var="tempPoke" items="${THE_POKEMON}">
					
					<!-- set up a link for each student -->
					<c:url var="tempLink" value="pokeControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="pokeId" value="${tempPoke.id}" />
					</c:url>

					<!--  set up a link to delete a student -->
					<c:url var="deleteLink" value="pokeControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="pokeId" value="${tempPoke.id}" />
					</c:url>
																		
					<tr>
						<td> ${tempPoke.nombre} </td>
						<td> ${tempPoke.tipo} </td>
						<td> ${tempPoke.region} </td>
						<td> 
			
							<a class="add-student-button" href="${tempLink}">Actualizar</a> 
						
							<a class="add-student-button" href="${deleteLink}"
							onclick="if (!(confirm('seguro que deseas abandonar a tu pokemon?'))) return false">
							Abandonar</a>	
						</td>
					</tr>
				
				</c:forEach>
				
			</table>
		
		</div>
	
	</div>
</body>


</html>








