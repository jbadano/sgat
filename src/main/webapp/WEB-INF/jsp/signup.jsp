<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Usuario</title>
<link href="../../bootstrap/css/bootstrap.css" rel="stylesheet" />
<link href="../../datepicker/css/datepicker.css" rel="stylesheet" />
<link href="../../assets/css/bootstrap-united.css" rel="stylesheet" />

<style>
.green {
	font-weight: bold;
	color: green;
}

.message {
	margin-bottom: 10px;
}

.error {
	color: #ff0000;
	font-size: 0.9em;
	font-weight: bold;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>

</head>
<body>

	<div class="navbar navbar-default">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-responsive-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>

		<div class="navbar-collapse collapse navbar-responsive-collapse">
			<!--<form class="navbar-form navbar-right">
				<input type="text" class="form-control" placeholder="Search">
			</form>-->
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/">Home</a></li>
				<li class="active"><a href="signup">Reg&iacute;strate</a></li>
				<li><a href="login">Accede</a></li>
			</ul>
		</div>
		<!-- /.nav-collapse -->
	</div>

	<script src="../../jquery-1.8.3.js">
		
	</script>

	<script src="../../bootstrap/js/bootstrap.js">
		
	</script>

	<script src="../../datepicker/js/bootstrap-datepicker.js">
		
	</script>


	<div class="container">
		<div class="jumbotron">
			<div>
				<h1>Bienvenido al formulario de registro</h1>
				<p>Reg&iacute;strate ya!</p>
			</div>
		</div>

		<div></div>
	</div>

	<c:if test="${not empty it.message}">
		<div class="green">${it.message}</div>
	</c:if>

	<div class="col-lg-6 col-lg-offset-3">
		<div class="well">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
						<form:form id="myForm" method="post" action="signup"
							class="bs-example form-horizontal">
							<fieldset>
								<legend>Formulario de Registro de Usuario</legend>

								<div class="form-group">
									<label for="userNameInput" class="col-lg-3 control-label">User
										Name</label>
									<div class="col-lg-9">
										<input type="text" class="form-control" name="userName"
											id="userNameInput" placeholder="User Name"
											value="${it.usuario.userName}" />
									</div>
								</div>

								<div class="form-group">
									<label for="passwordInput" class="col-lg-3 control-label">Password</label>
									<div class="col-lg-9">
										<input type="password" class="form-control" name="password"
											id="passwordInput" placeholder="Password"
											value="${it.usuario.password}" />
									</div>
								</div>

								<div class="form-group">
									<label for="nombreInput" class="col-lg-3 control-label">Nombre</label>
									<div class="col-lg-9">
										<input type="text" class="form-control" name="nombre"
											id="nombreInput" placeholder="Nombre"
											value="${it.usuario.nombre}" />
									</div>
								</div>

								<div class="form-group">
									<label for="apellidoInput" class="col-lg-3 control-label">Apellido</label>
									<div class="col-lg-9">
										<input type="text" class="form-control" name="apellido"
											id="apellidoInput" placeholder="Apellido"
											value="${it.usuario.apellido}" />
									</div>
								</div>

								<div class="form-group">
									<label for="fechaNacimientoInput" class="col-lg-3 control-label">Fecha de Nacimiento</label>
									<div class="date form_date col-lg-9"
										data-date-format="mm/dd/yyyy" data-date-viewmode="years">
										<c:set var="myDate">
											<fmt:formatDate pattern="MM/dd/yyyy"
												value="${it.usuario.fechaNacimiento}" />
										</c:set>
										<input type="text" class="form-control" name="fechaNacimiento"
											id="fechaNacimientoInput" placeholder="Fecha de Nacimiento"
											value="${myDate}" />
									</div>
								</div>

								<div class="form-group">
									<label for="emailAddressInput" class="col-lg-3 control-label">Email
										Address</label>
									<div class="col-lg-9">
										<input type="text" class="form-control" name="emailAddress"
											id="emailAddressInput" placeholder="Email Address"
											value="${it.usuario.emailAddress}" />
									</div>
								</div>

								<div class="col-lg-9 col-lg-offset-3">
									<button class="btn btn-default">Cancel</button>

									<button class="btn btn-primary" data-toggle="modal"
										data-target="#themodal">Registrarse</button>
									<div id="themodal" class="modal fade" data-backdrop="static">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal"
														aria-hidden="true">&times;</button>
													<h3>Reg&iacute;strate</h3>
												</div>
												<div class="modal-body">
													<p>Est&aacute; seguro que desea continuar?</p>
													<div class="progress progress-striped active">
														<div id="doitprogress" class="progress-bar"></div>
													</div>
												</div>
												<div class="modal-footer">
													<a href="#" class="btn btn-default" data-dismiss="modal">Cerrar</a>
													<input type="submit" value="Yes" id="yesbutton"
														class="btn btn-primary" data-loading-text="Guardando.."
														data-complete-text="Guardado Completo!">
												</div>
											</div>
										</div>
									</div>

								</div>

							</fieldset>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script>
		$(function() {
			$('#fechaNacimientoInput').datepicker();
		});
	</script>

	<script type="text/javascript">
		$(function() {
			var yesButton = $("#yesbutton");
			var progress = $("#doitprogress");

			yesButton.click(function() {
				yesButton.button("loading");

				var counter = 0;
				var countDown = function() {
					counter++;
					if (counter == 11) {
						yesButton.button("complete");
					} else {
						progress.width(counter * 10 + "%");
						setTimeout(countDown, 100);
					}
				};

				setTimeout(countDown, 100);
			});

		});
	</script>


</body>
</html>