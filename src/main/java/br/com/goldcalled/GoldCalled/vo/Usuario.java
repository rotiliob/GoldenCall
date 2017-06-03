package br.com.goldcalled.GoldCalled.vo;

import javax.persistence.*;
import java.util.List;

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

    //-------------------End Variable-------------------//
    //--------------------------------------------------//

    @OneToMany(mappedBy="usuario")
    private List<Chamado> chamados;

    //-------------------------------------------------//
    //-------------------Constructor-------------------//
    public Usuario() {
    }

    public Usuario( String login, String senha, String tipoUsuario, Pessoa pessoa, List<Chamado> chamados) {
        this.login = login;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
        this.chamados = chamados;

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

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }

    //-------------------End Getters and Setters-------------------//
    //-------------------------------------------------------------//

}
