<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="<s:url value="/resources/js/jquery.js"/>"></script>
<script type="text/javascript" src="<s:url value="/resources/js/myJquery.js"/>"></script>
<title>Insert title here</title>
</head>
<body>
	<h1>Formulario</h1>
	<form:form action="salvar" method="Post" commandName="pessoa">
		
		<label >Nome</label>
		<form:input type="text" path="nome"/>
		
		<label>Cpf</label>
		<form:input type="text" path="Cpf"/>
		
		<label>Email</label>
		<form:input type="text" path="email"/>
		
		<label>Telefone</label>
		<form:input type="text" path="telefone"/>
		
		<label>Cep</label>
		<form:input class="frm_cep" type="text" path="endereco.cep"/>
		<input type="button" id="btn_cep" value="Ok">
		
		<label>Rua</label>
		<form:input class="frm_rua" type="text" path="endereco.rua"/>
		
		<label>Complemento</label>
		<form:input class="frm_complemento" type="text" path="endereco.complemento"/>
		
		<label>Bairro</label>
		<form:input class="frm_bairro" type="text" path="endereco.bairro"/>
		
		<form:select class="frm_estados" path="endereco.estado">
			<option value="">--Selecione--</option>
		</form:select>

		<input type="submit" value="Salvar"/>	
	</form:form>
</body>
</html>