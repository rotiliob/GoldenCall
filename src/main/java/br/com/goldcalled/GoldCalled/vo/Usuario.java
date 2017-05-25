package br.com.goldcalled.GoldCalled.vo;

import javax.persistence.*;
import java.awt.*;

@Entity
public class Usuario extends Pessoa{
    //----------------------------------------------//
    //-------------------Variable-------------------//
    @Column(name = "nome_usuario", nullable = false)
    private String login;
    @Column(name = "senha", nullable = false)
    private String senha;
    @Column(name = "tipo_usuario", nullable = false)
    private String tipoUsuario;

    @OneToMany
    private Chamado chamado;
    //-------------------End Variable-------------------//
    //--------------------------------------------------//

    //-------------------------------------------------//
    //-------------------Constructor-------------------//
    public Usuario() {
    }

    public Usuario( String login, String senha, String tipoUsuario, Pessoa pessoa) {
        this.login = login;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }
    //-------------------End Constructor-------------------//
    //-----------------------------------------------------//

    //---------------------------------------------------------//
    //-------------------Getters and Setters-------------------//

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    //-------------------End Getters and Setters-------------------//
    //-------------------------------------------------------------//

}
