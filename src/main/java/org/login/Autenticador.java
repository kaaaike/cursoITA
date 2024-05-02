package org.login;

public class Autenticador {

    public Usuario logar(String login, String senha) throws LoginException {
         if(login .equals("Kaike") && senha.equals("123mudar")) {
             return new Usuario(login);
         }
         throw new LoginException("Usuário incorreto!", login);
    }
}
