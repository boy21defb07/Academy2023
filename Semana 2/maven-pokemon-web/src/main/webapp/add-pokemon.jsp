<!DOCTYPE html>
<html>

<head>
	<title>Pokemon App</title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-student-style.css">	
</head>

<body>
	<div id="wrapper">
		<div id="header"align="center">
			<h2>Mi Pokemons</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Agregar Pokemon</h3>
		
		<form action="pokeControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="ADD" />
			
			<table>
				<tbody>
					<tr>
						<td><label>Nombre:</label></td>
						<td><input type="text" name="nombre" /></td>
					</tr>

					<tr>
						<td><label>Tipo:</label></td>
						<td><select name="tipo">
							<option value="Fuego" selected>Tipo</option>
  							<option value="Fuego">Fuego</option>
 							<option value="Agua" >Agua</option>
  							<option value="Roca">Roca</option>
							</select></td>
					</tr>

					<tr>
						<td><label>Region:</label></td>
						<td><input type="text" name="region" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Guardar" class="save" /></td>
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











