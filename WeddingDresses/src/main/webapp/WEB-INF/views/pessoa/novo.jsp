<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Business Casual - Start Bootstrap Theme</title>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" type="text/css" href="<s:url value="/resources/css/bootstrap.min.css"/>"/>

    <!-- Custom CSS -->
    <link href="<s:url value="/resources/css/business-casual.css"/>" rel="stylesheet"/>
    <link href="<s:url value="/resources/css/myCss.css"/>" rel="stylesheet"/>

    <!-- Fonts -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css"/>
    <link href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css"/>


	   <!-- jQuery -->
    <script src="<s:url value="/resources/js/jquery.js"/>"></script>
     <script src="<s:url value="/resources/js/myJquery.js"/>"></script>

    <!-- Bootstrap Core JavaScript -->
	
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<div class="brand">Wedding Dresses</div>
    <div class="address-bar">3481 Melrose Place | Beverly Hills, CA 90210 | 123.456.7890</div>

    <!-- Navigation -->
    <nav class="navbar navbar-default" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!-- navbar-brand is hidden on larger screens, but visible when the menu is collapsed -->
                <a class="navbar-brand" href="index.html">Business Casual</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                       <a href="#">Home</a>
                    </li>
                    <li>
                        <a href="about.html">About</a>
                    </li>
                    <li>
                        <a href="blog.html">Blog</a>
                    </li>
                    <li>
                        <a href="contact.html">Contact</a>
                    </li>
                     <li>
                        <a href="novo">Cadastre-se</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
	
	<div class="container">
	  	<div class="row">
        	<div class="box">
         		 <div class="col-lg-12">
         		 	<h1 class="text-center">Preencha o Formulario</h1>
         		 	
         		 	<div class="col-lg-8 col-lg-offset-2">
         		 	<form:form action="salvar" method="Post" modelAttribute="pessoa">
  						<div class="form-group">
    						<label for="frm_nome">Nome</label>
    						<form:input type="text" path="nome" class="form-control" id="frm_nome" placeholder="Informe o nome" />
  						</div>
  						<div class="form-group">
    						<label for="frm_cpf">Cpf</label>
    						<form:input type="text" path="cpf" class="form-control" id="frm_cpf" placeholder="Informe o cpf"/>
  						</div>
  						
  						<div class="form-group">
    						<label for="frm_email">Email</label>
    						<form:input type="text" path="email" class="form-control" id="frm_email" placeholder="Informe o email"/>
  						</div>
  						
  						<div class="form-group">
    						<label for="frm_telefone">Telefone</label>
    						<form:input type="text" path="telefone" class="form-control" id="frm_telefone" placeholder="Informe o telefone"/>
  						</div>
  						
  						<div class="form-group">
    						<label for="frm_cep">Cep</label>
    						<form:input type="text" path="endereco.cep" class="form-control" id="frm_cep" placeholder="Informe o cep"/>
    						<a href="http://www.buscacep.correios.com.br/" target="_blank">Não sabe o cep?</a>
  						</div>
  						<input type="button" class="btn btn-default" id="btn_cep" value="ok"/>
  						
  						<h1 class="text-center head-endereco">Endereco</h1>
  						<div class="form-group frm_rua">
    						<label for="frm_rua">Logradouro</label>
    						<form:input type="text" path="endereco.rua" class="form-control" id="frm_rua" placeholder="Informe o cep acima"/>
  						</div>
  						
  						<div class="form-group frm_numero">
    						<label for="frm_numero">Numero</label>
    						<form:input type="text" path="endereco.numero" class="form-control" id="frm_numero" placeholder="Informe o numero"/>
  						</div>
  						
  						<div class="form-group frm_complemento">
    						<label for="frm_complemento">Complemento</label>
    						<form:input type="text" path="endereco.complemento" class="form-control" id="frm_complemento" placeholder="Informe o complemento"/>
  						</div>
  						
  						<div class="form-group frm_bairro">
    						<label for="frm_Bairro">Bairro</label>
    						<form:input type="text" path="endereco.bairro" class="form-control" id="frm_bairro" placeholder="Informe o bairro"/>
  						</div>
  						
  						<div class="form-group frm_estados">
    						<label for="frm_estados">Estados</label>
    						<form:select class="form-control" id="frm_estados" path="endereco.estado">
								<option value="">--Selecione--</option>
							</form:select>
  						</div>
  						
  						<div class="form-group frm_uf">
    						<label for="frm_uf">Uf</label>
    						<form:select class="form-control" id="frm_uf" path="endereco.uf">
								<option value="">--Selecione--</option>
							</form:select>
  						</div>
  						<button type="submit" class="btn btn-default">Salvar</button>
					</form:form>
                </div>
            </div>
            </div>
        </div>
	  </div>
	  
	  <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <p>Copyright &copy; Your Website 2014</p>
                </div>
            </div>
        </div>
    </footer>
	  
</body>
</html>