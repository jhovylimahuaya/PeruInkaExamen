<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2"></div>
		<div class="span10">


			<legend>Formulario Enterprice : ${opc}</legend>
			<form:form commandName="enterprice" action="saveEnterprice" method="POST">

				<table>
					<tr>
						<td>Nombre:</td>
						<td><form:input path="businessName" />
						<td />
					</tr>
					<tr>
						<td>ruc:</td>
						<td><form:input path="ruc" />
						<td />
					</tr>
					<tr>
						<td>Direccion:</td>
						<td><form:input path="address" />
						<td />
					</tr>
					<tr>
						<td>telefono:</td>
						<td><form:input path="phone" />
						<td />
					</tr>

					<tr>
						<td>Estado</td>
						<td><form:select path="statusEnterprice.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusEnterprice}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
					</tr>


					<tr>
						<td colspan="2"><button type="submit" class="btn btn-success">Guardar</button>
						<td />
					</tr>
				</table>

				<input type="hidden" name="opc" id="opc" value="${opc}">
				<form:hidden path="id" />
				<br>


			</form:form>


		</div>
	</div>
</div>


