<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Bienvenido a la cadena de hotel PeruInka

<br>
<a href="frmEnterprice">Nuevo Empresa</a>
<br>
<display:table name="${empresas}" id="p" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Nombre" property="businessName" />
	<display:column title="ruc" property="ruc" />
	<display:column title="direccion" property="address" />
	<display:column title="telefono" property="phone" />
	<display:column title="Estado" property="statusEnterprice.description" />
	
	
	<display:column title="OPC">
		<a href="editEnterprice?id_=${p.id}">Modificar</a>
		<a href="deleteEnterprice?id_=${p.id}">Eliminar</a>
	</display:column>
	
</display:table>