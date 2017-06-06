<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="iso-8859-1">

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"><!--reconhece tamanho da tela de diversos dispostivos-->

    <!--aqui chama o css -->
    <link rel="stylesheet" href="/css/main.css">
    <link href="/icons/favicon.png" rel="shortcut icon"/>

    <script src="/js/jquery-2.2.3.min.js"></script>


    <link rel="stylesheet" href="/css/owl.carousel.css">

    <link href="/carrossel/owl.carousel.css" rel="stylesheet"/>
    <script src="/carrossel/owl.carousel.min.js" async></script>
    <title>Gold Called</title>
</head>
<body>

<!--CABECALHO-->
<header class="cabecalho">
    <nav>

        <figure class="logo"><img src="/img/espaco.PNG"></figure>
        <figure class="logo"><img src="/img/espaco.PNG"></figure>
        <span title="button-menu"></span>
        <ul class="menu">

            <!--troca isso aqui pelo link de um uma pagina com lista de todos os chamado de apenas um usuario-->
            <li><a href="/usuario/chamadosRealizadosUsuario">Acompanhar Meus Chamados</a></li>
        </ul>
    </nav>
</header>

<main>
    <div class="titulo">
        <h1 class="title-secao">Vizualização do Chamado</h1>
    </div>

    <div class="dicasTexto" >
        <p class="textochamado">Observe os campos com atenção para atender o chamado</p>
    </div>


    <section data-content class="institucional">
        <section class="centro">

            <form name="formContato" class="formContato" action="#">

                <label><p>Matricula</p><h2>${chamado.matricula}</h2><p style="left: 5%;position: relative; ">codigo: </p><h2>${chamado.usuario.id}</h2></label>
                <label><p>Ramal</p><h2>${chamado.ramal}</h2></label>
                <label><p>Data de Abertura</p><br><h2>${chamado.dataCriacao}</h2></label>

                <label><p>O usuário está em: </p> <h2>${chamado.usuario.setor}</h2></label>

                <h3>Detalhes do chamado</h3>

                <label> <p>Equipamentos ou softwares?</p> <h2>${chamado.tipoChamado}</h2> </label>


                <label>
                    <p>Resumo do Problema:</p>
                    <textarea  rows="7"  readonly>${chamado.descricaoChamado}</textarea>
                </label>

                <label>
                    <p>Relatório Técnico:</p>
                    <textarea name="parecerTecnico"  rows="7" readonly>${chamado.parecerTecnico}</textarea>
                </label>

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