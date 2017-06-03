<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="iso-8859-1">

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"><!--reconhece tamanho da tela de diversos dispostivos-->

    <!--aqui chama o css -->
    <link rel="stylesheet" href="css/main.css">
    <link href="icons/favicon.png" rel="shortcut icon"/>

    <script src="js/jquery-2.2.3.min.js"></script>


    <link rel="stylesheet" href="css/owl.carousel.css">

    <link href="carrossel/owl.carousel.css" rel="stylesheet"/>
    <script src="carrossel/owl.carousel.min.js" async></script>
    <title>Gold Called</title>
</head>
<body>

<!--CABECALHO-->
<header class="cabecalho">
    <nav>

        <figure class="logo"><img src="img/espaco.PNG"></figure>
        <figure class="logo"><img src="img/espaco.PNG"></figure>
        <span title="button-menu"></span>
        <ul class="menu">

            <!--troca isso aqui pelo link de um uma pagina com lista de todos os chamado de apenas um usuario-->
            <li><a href="acompanhaMeusChamados.php">Acompanhar Meus Chamados</a></li>
        </ul>
    </nav>
</header>

<main>
    <div class="titulo">
        <h1 class="title-secao">Cadastro Para Chamados</h1>
    </div>

    <div class="dicasTexto" >
        <p class="textochamado">Preencha todos os campos como conforme as instruções</p>
    </div>


    <section data-content class="institucional">
        <section class="centro">

            <form name="formContato" class="formContato" action="/criarChamado" th:action="@{/criarChamado}" th:="${chamado}"method="post">

                <label><p>Matricula</p><input type="text" name="matricula" required></label>
                <label><p>Ramal</p><input type="text" name="ramal" ></label>

                <h3>Detalhes do chamado</h3>

                <label>
                    <p>Equipamentos ou softwares?</p>
                    <select name="tipoChamado">
                        <option value="null"></option>
                        <option value="equipamentos">equipamentos</option>
                        <option value="softwares">softwares</option>
                        <option value="outros">Outros...</option>
                    </select>
                </label>


                <label>
                    <p>Descreva o problema</p>
                    <textarea name="descricaoChamado"  rows="7"></textarea>
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

</footer>
</body>
</html>