package br.com.goldcalled.GoldCalled.vo;

public class UsuarioLogado {
    public static Usuario usuario;
    private static UsuarioLogado instancia;

    public static UsuarioLogado getInstancia(){
        if (instancia == null){
            instancia = new UsuarioLogado();
        }
        return instancia;
    }
}
