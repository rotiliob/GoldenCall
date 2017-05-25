package br.com.goldcalled.GoldCalled.vo;

import javax.persistence.*;

@Entity
@Table(name = "software")
public class Software {
    //----------------------------------------------//
    //-------------------Variable-------------------//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_software", nullable = false, unique = true)
    private Long id;
    private String codigoSoftware;
    private String funcaoSoftwere;

    private Chamado chamado;

    //-------------------End Variable-------------------//
    //--------------------------------------------------//

    //-------------------------------------------------//
    //-------------------Constructor-------------------//
    public Software() {
    }

    public Software(Long id, String codigoSoftware, String funcaoSoftwere, Chamado chamado) {
        this.id = id;
        this.codigoSoftware = codigoSoftware;
        this.funcaoSoftwere = funcaoSoftwere;
        this.chamado = chamado;
    }
    //-------------------End Constructor-------------------//
    //-----------------------------------------------------//

    //---------------------------------------------------------//
    //-------------------Getters and Setters-------------------//

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoSoftware() {
        return codigoSoftware;
    }

    public void setCodigoSoftware(String codigoSoftware) {
        this.codigoSoftware = codigoSoftware;
    }

    public String getFuncaoSoftwere() {
        return funcaoSoftwere;
    }

    public void setFuncaoSoftwere(String funcaoSoftwere) {
        this.funcaoSoftwere = funcaoSoftwere;
    }

    public Chamado getChamado() {
        return chamado;
    }

    public void setChamado(Chamado chamado) {
        this.chamado = chamado;
    }
    //-------------------End Getters and Setters-------------------//
    //-------------------------------------------------------------//
}
