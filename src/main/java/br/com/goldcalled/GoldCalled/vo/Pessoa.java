package br.com.goldcalled.GoldCalled.vo;


import javax.persistence.*;

@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id_pessoa", nullable = false, unique = true)
    private long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "funcao", nullable = false)
    private String funcao;
    @Column(name = "setor", nullable = false)
    private String setor;

    public Pessoa() {
    }

    public Pessoa(long id, String nome, String funcao, String setor) {
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
        this.setor = setor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
