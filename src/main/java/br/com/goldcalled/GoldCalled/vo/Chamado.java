package br.com.goldcalled.GoldCalled.vo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "chamado")
public class Chamado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chamado", nullable = false, unique = true)
    private long id;
    @Column(name = "num_chamado", nullable = false)
    private long numeroChamado;
    @Column(name = "data_criacao", nullable = false)
    private LocalDate dataCriacao;
    @Column(name = "data_conclusao", nullable = false)
    private LocalDate dataConclusao;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "parecer_tecnico", nullable = false)
    private String parecerTecnico;

    @OneToOne
    private Usuario usuario;

    public Chamado() {
    }

    public Chamado(long id, long numeroChamado, LocalDate dataCriacao, LocalDate dataConclusao, String status, String parecerTecnico, Usuario usuario) {
        this.id = id;
        this.numeroChamado = numeroChamado;
        this.dataCriacao = dataCriacao;
        this.dataConclusao = dataConclusao;
        this.status = status;
        this.parecerTecnico = parecerTecnico;
        this.usuario = usuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumeroChamado() {
        return numeroChamado;
    }

    public void setNumeroChamado(long numeroChamado) {
        this.numeroChamado = numeroChamado;
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
}
