<!DOCTYPE html>
<html>

<head>
	<title>Update Student</title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-student-style.css">	
</head>

<body>
	<div id="wrapper">
		<div id="header" align="center">
			<h2>Mi Pokemons</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Actualizar Pokemon</h3>
		
		<form action="pokeControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="UPDATE" />

			<input type="hidden" name="pokeId" value="${THE_POKEMON.id}" />
			
			<table>
				<tbody>
					<tr>
						<td><label>Nombre:</label></td>
						<td><input type="text" name="nombre" 
								   value="${THE_POKEMON.nombre}" /></td>
					</tr>

					<tr>
						<td><label>Tipo:</label></td>
						<td><input type="text" name="tipo" 
								   value="${THE_POKEMON.tipo}" /></td>
					</tr>

					<tr>
						<td><label>Region:</label></td>
						<td><input type="text" name="region" 
								   value="${THE_POKEMON.region}" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Actualizar" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
		</form>
		
		<div style="clear: both;"></div>
		
		<p>
			<a href="pokeControllerServlet">Back to List</a>
		</p>
	</div>
</body>

</html>











