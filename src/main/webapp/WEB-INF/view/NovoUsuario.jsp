<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <title>Novo Usuário</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
    <body>
      <h2>Criar Usuário</h2>

      <form action="/criar" th:action="@{/criar}" th:="${usuario}"method="post">
               Login : <input type="text" name="login" /> <br />
               Senha : <input type="password" name="senha" /> <br />
               Tipo de Acesso : <select name= "tipoUsuario">
                                  <option value="usuario">Usuário</option>
                                  <option value="administrador">Administrador</option>
                                  <option value="tecnico">Tecnico</option>
                                </select><br/>
               Nome  : <input type="text" name="nome" /> <br />
               Funcao: <input type="text" name="funcao"  /> <br />
               Setor : <input type="text" name="setor"  /> <br />
               <p> <input type="submit" value="Criar"/></p><br />
               <p><input type="reset" value="Reset"/></p>

       </form>
    </body>
 </html>