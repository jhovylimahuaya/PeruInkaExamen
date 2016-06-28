<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Bienvenido a la cadena de hotel PeruInka

<br>
<a href="frmCustomer">Nuevo Cliente</a>
<br>
<display:table name="${clientes}" id="p" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Empresa" property="enterprice.businessName" />
	<display:column title="person" property="person.completeName" />
	<display:column title="Estado" property="statusCustomer.description" />
	
	<display:column title="OPC">
		<a href="editCustomer?id_=${p.id}">Modificar</a>
		<a href="deleteCustomer?id_=${p.id}">Eliminar</a>
	</display:column>
	
</display:table>