<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="iso-8859-1">
  
    <!--META TAGS-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"><!--redconhece tamanho da tela de diversos dispostivos-->

    <!--aqui chama o css -->
    <link rel="stylesheet" href="css/main.css">
    <link href="icons/favicon.png" rel="shortcut icon"/>

    <script src="js/jquery-2.2.3.min.js"></script>

    <!-- SCRIPT PARA FUNCIONAR O MENU RESPONSIVO -->

    <link rel="stylesheet" href="css/owl.carousel.css">

  <link href="carrossel/owl.carousel.css" rel="stylesheet"/>
  <script src="carrossel/owl.carousel.min.js" async></script>
  <title>GoldenCall - Login</title>
</head>
<body>

<!--CABECALHO-->

<main>
  <div class="titulo">
    <h1 class="title-secao">Golden Call</h1>
  </div>
  <div class="bg"></div>
  <section data-content class="institucional">
    <section class="centro">
    
      <form name="formLogin" class="formContato" action="logar" method="get">
        <label><p>Login </p><input type="text" name="login" required="" style="width: 300px"></label>
        <label><p>Senha</p><input type="password" name="senha" required="" style="width: 300px" ></label>
       
        <input type="submit" value="Entrar" style="width: 300px">
               
<div style="clear: both"></div>
<br><br>

	<a href="/cadusuario" style="font-size: 10pt; position: relative;top: 15%;left: -20%">
        Cadastrar-se </a>


      </form>

    </section>
  </section>
  <div class="bg2"></div>

</main>

<!--?php include("templateRodape.php")?-->
<div class="bg"></div>

<footer>
    <div class="rodape">
        <div class="rodapeTexto">
            <p>Castro Neves Construtora - CNPJ: 03.803.853/0001-50</p>
            <p>Rua Sebasti�o Malta Arcoverde, 85 | Parnamirim, Recife , PE</p>
            <p>(81) 3268.4149 | cnc@castronevesconstrutora.com.br</p>
        </div>
        <div style="clear: both"></div>
    </div>
</footer>
</body>
</html>