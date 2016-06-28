<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2"></div>
		<div class="span10">


			<legend>Formulario Customer : ${opc}</legend>
			<form:form commandName="customer" action="saveCustomer" method="POST">

				<table>
					

					<tr>
						<td>Empresa:</td>
						<td><form:select path="enterprice.id">
								<option value="">Seleccione</option>
								<form:options items="${empresas}" itemValue="id"
									itemLabel="businessName" />
							</form:select></td>
					</tr>
					
					<tr>
						<td>Responsable:</td>
						<td><form:select path="person.id">
								<option value="">Seleccione</option>
								<form:options items="${personas}" itemValue="id"
									itemLabel="completeName" />
							</form:select></td>
					</tr>

					<tr>
						<td>Estado</td>
						<td><form:select path="statusCustomer.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusCustomer}" itemValue="typeCode"
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
