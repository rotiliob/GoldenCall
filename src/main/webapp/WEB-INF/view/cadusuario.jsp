<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="iso-8859-1">
    <!--?php require_once "templateChamada.php" ?-->

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
    <title>Castro neves - Contato</title>
</head>
<body>

<!--CABECALHO-->
<!--?php require_once "templateTopo.php"?-->

<main>
  <div class="titulo">
    <h1 class="title-secao">CONTATO</h1>
  </div>
  <div class="bg"></div>
  <section data-content class="institucional">
    <section class="centro">
      <form name="formContato" class="formContato" action="/criar" th:action="@{/criar}" th:="${usuario}"method="post">
        <label><p>Login</p><input type="text" name="login"></label>
        <label><p>Senha</p><input type="password" name="senha" ></label>
        <label><p>Tipo de Acesso</p>
            <select name= "tipoUsuario">
                 <option value="usuario">Usuário</option>
                 <option value="administrador">Administrador</option>
                 <option value="tecnico">Tecnico</option>
            </select><br/>
        </label>
          <label><p>Nome Completo</p><input type="text" name="nome"></label>
          <label><p>Funcão</p><input type="text" name="funcao"></label>
          <label><p>Setor</p><input type="text" name="setor"></label>

         </label>
        <input type="submit" value="Cadastrar">
<div style="clear: both"></div>
      </form>

    </section>
  </section>
  <div class="bg2"></div>

</main>

<!--?php include("templateRodape.php")?-->
<div class="bg"></div>

<footer>
    <div class="rodape">
        
        <div style="clear: both"></div>
    </div>
</footer>
</body>
</html>