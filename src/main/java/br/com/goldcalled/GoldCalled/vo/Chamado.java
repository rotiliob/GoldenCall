package br.com.goldcalled.GoldCalled.vo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "chamado")
public class Chamado {
    //----------------------------------------------//
    //-------------------Variable-------------------//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chamado", nullable = false, unique = true)
    private long id;
    @Column(name = "data_criacao")
    private LocalDate dataCriacao;
    @Column(name = "data_conclusao")
    private LocalDate dataConclusao;
    @Column(name = "status", nullable = false)
    private String status = "Aberto";
    @Column(name = "tipo_chamado", nullable = false)
    private String tipoChamado;
    @Column(name = "descricao_chamado", nullable = false)
    private String descricaoChamado;
    @Column(name = "parecer_tecnico")
    private String parecerTecnico;
    @Column(name = "matricula")
    private String matricula;
    @Column(name = "ramal")
    private String ramal;
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
    //-------------------End Variable-------------------//
    //--------------------------------------------------//

    //-------------------------------------------------//
    //-------------------Constructor-------------------//
    public Chamado() {
    }

    public Chamado(long id, LocalDate dataCriacao, LocalDate dataConclusao, String status, String tipoChamado, String descricaoChamado, String parecerTecnico, String matricula, String ramal, Usuario usuario) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataConclusao = dataConclusao;
        this.status = status;
        this.tipoChamado = tipoChamado;
        this.descricaoChamado = descricaoChamado;
        this.parecerTecnico = parecerTecnico;
        this.matricula = matricula;
        this.ramal = ramal;
        this.usuario = usuario;
    }

    //-------------------End Constructor-------------------//
    //-----------------------------------------------------//

    //---------------------------------------------------------//
    //-------------------Getters and Setters-------------------//
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getParecerTecnico() {
        return parecerTecnico;
    }

    public void setParecerTecnico(String parecerTecnico) {
        this.parecerTecnico = parecerTecnico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTipoChamado() {
        return tipoChamado;
    }

    public void setTipoChamado(String tipoChamado) {
        this.tipoChamado = tipoChamado;
    }

    public String getDescricaoChamado() {
        return descricaoChamado;
    }

    public void setDescricaoChamado(String descricaoChamado) {
        this.descricaoChamado = descricaoChamado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    //-------------------End Getters and Setters-------------------//
    //-------------------------------------------------------------//
}
