<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="iso-8859-1">

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"><!--redconhece tamanho da tela de diversos dispostivos-->

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

       </nav>
</header>

<main>

    <div class="bg"></div>

    <section data-content class="empreenIndex">
        <h1 class="title-secao">Chamados</h1>
        <div class="empreendimento" data-slider="empreend">

            <style type="text/css">
                .tg  {border-collapse:collapse;border-spacing:0;border-color:#aabcfe; width: 110%;left: -5%; position: relative;}
                .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#669;background-color:#e8edff;}
                .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#039;background-color:#b9c9fe;}
                .tg .tg-baqh{text-align:center;vertical-align:top}
                .tg .tg-mb3i{background-color:#D2E4FC;text-align:right;vertical-align:top}
                .tg .tg-lqy6{text-align:right;vertical-align:top}
                .tg .tg-6k2t{background-color:#D2E4FC;vertical-align:top}
                .tg .tg-yw4l{vertical-align:top}
            </style>
            <table class="tg">
                <tr>
                    <th class="tg-baqh" colspan="8"><B>Lista de Chamados</B></th>
                </tr>


                <tr>
                   <td class="tg-6k2t">Id Chamado</td>
                   <td class="tg-6k2t">Cliente</td>
                   <td class="tg-6k2t">Setor</td>
                   <td class="tg-6k2t">Descrição</td>
                   <td class="tg-mb3i">Ramal</td>
                   <td class="tg-mb3i">Data Abert.</td>
                   <td class="tg-mb3i">Data Conc.</td>
                   <td class="tg-mb3i">Status</td>
                </tr>

                <!--   // -->

                <c:forEach var="chamado" items="${chamados}">
                 <tr>
                    <td class="tg-6k2t"><a href="/tecnico/listaChamadoTec/${chamado.id}"><u>${chamado.id}</u></a></td>
                    <td class="tg-6k2t">${chamado.usuario.nome}</td>
                    <td class="tg-6k2t">${chamado.usuario.setor}</td>
                    <td class="tg-6k2t">${chamado.descricaoChamado}</td>
                    <td class="tg-mb3i">${chamado.ramal}</td>
                    <td class="tg-mb3i">${chamado.dataCriacao}</td>
                    <td class="tg-mb3i">${chamado.dataConclusao}</td>
                    <td class="tg-mb3i">${chamado.status}</td>
                  </tr>
                </c:forEach>

            </table>

        </div>

    </section>

</main>
</body>
</html>