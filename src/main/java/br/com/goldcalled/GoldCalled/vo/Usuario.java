package br.com.goldcalled.GoldCalled.vo;

import javax.persistence.*;
import java.awt.*;

@Entity
@Table(name = "usuario")
public class Usuario extends Component {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false, unique = true)
    private long id;
    @Column(name = "nome_usuario", nullable = false)
    private String login;
    @Column(name = "senha", nullable = false)
    private String senha;
    @Column(name = "tipo_usuario", nullable = false)
    private String tipoUsuario;

    @OneToOne
    private Pessoa pessoa;

    public Usuario() {
    }

    public Usuario(long id, String login, String senha, String tipoUsuario, Pessoa pessoa) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
        this.pessoa = pessoa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
