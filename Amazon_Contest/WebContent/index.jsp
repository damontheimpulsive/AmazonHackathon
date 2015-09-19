<!DOCTYPE html>
<html>
<head>
<title>Login and Registration Page</title>
<link rel="stylesheet" href="css/jquery-ui.css">
<link rel="stylesheet" href="css/style.css">

<script src="js/jquery-1.11.1.js"></script>
<script src="js/jquery-ui.js"></script>

<script>
$(function() {
  $( "#tabs" ).tabs();
});
</script>

</head>

<body>
	<div class="wrapper">
		<div class="container">
			<div id="tabs">
				<ul>
					<li><a href="#login">Login</a></li>
					<li><a href="#register">Register</a></li>
				</ul>
				<div id="login">

					<form method="get" action="LoginController">
						<label for="username">UserName:</label> <br /> <input type="text"
							name="username" id="username" /> <br /> <label for="password">Password:</label>
						<br /> <input type="password" name="password" id="password" /> <br />
						<br /> <input type="submit" value="Login">
					</form>
				</div>
				<div id="register">
					<form method="get" action="RegistrationController">
						<label for="name">Name:</label><br /> <input type="text"
							name="name" id="name" /> <br /> <label for="email">Email:</label><br />
						<input type="text" name="email" id="email" /> <br /> <label
							for="password">Password:</label><br />
							 <input type="password"
							name="password" id="password" /> <br />
							 <label for="confirmpassword">Confirm Password:</label><br />
						<input type="text" name="confirmpassword" id="confirmpassword" /> <br /> <br /> <input
							type="submit" value="Register">
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>