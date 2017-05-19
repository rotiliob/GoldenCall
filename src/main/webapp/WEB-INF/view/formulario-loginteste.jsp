<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
   <body>
       <h2>Página de Login das Tarefas</h2>
       <form action="logar" method="post">
         Login: <input type="text" name="login" /> <br />
         Senha: <input type="password" name="senha" /> <br />
         <input type="submit" value="Entrar"/><br />

       </form><br/>
        <form action="/NovoUsuario" method="post">
                <input type="submit" value="Criar Usuário" />
        </form>
     </body>
   </html>

