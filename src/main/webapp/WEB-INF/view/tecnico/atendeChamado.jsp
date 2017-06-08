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

        <a href="/tecnico/tecnicoIndex"><u><p>Início</u></p></a>
                   <a href="/tecnico/listaChamadoTec"><u><p>Lista de Chamados</a></u></p>
                   <a href="/tecnico/listaChamadoTecConcluido"><u><p>Meus Chamados Realizados</u></p></a>
                   <a href="/"><u><p>Sair</u></p></a>

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

          <form name="formContato" action="/concluiChamado" method="post">

               <label>Id do chamado<label/><input type="text" name="id" value="${chamado.id}" readonly></input>
               <label>Matrícula<label/><input type="text" name="matricula" value="${chamado.matricula}" readonly></input>
               <label>Ramal<label/><input type="text" name="ramal"value="${chamado.ramal}"readonly></input>
               <label>Setor<label/><input type="text" name="chamado.usuario.setor"value="${chamado.usuario.setor}"readonly></input>
               <label>Tipo<label/><input type="text" name="tipoChamado"value="${chamado.tipoChamado}"readonly></input>

               <input type="hidden" name="chamado.usuario.id"value="${chamado.usuario.id}"/>
               <label>Nome Cliente<label/><input type="text" value="${chamado.usuario.nome}"readonly></input>
               <label>Descrição<label/><textarea name="descricaoChamado" value="${chamado.descricaoChamado}"readonly>${chamado.descricaoChamado}</textarea>

               <c:if test = "${chamado.parecerTecnico == null}">
                    <label>Parecer Tecnico<label/><textarea name="parecerTecnico" rows="7" required></textarea>
                    <input type="submit" value="Concluir Chamado">
               </c:if>

               <c:if test = "${chamado.parecerTecnico != null}">
                    <label>Parecer Tecnico<label/><textarea name="parecerTecnico" rows="7" value="${chamado.parecerTecnico}" readonly>${chamado.parecerTecnico}</textarea>
                </c:if>

               <a href="/tecnico/listaChamadoTec" style="position:relative left: 17%"><u>Lista de Chamados</a></u>


               <div style="clear: both"></div>
          </form>


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