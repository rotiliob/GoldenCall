package br.com.goldcalled.GoldCalled.vo;

import javax.persistence.*;

@Entity
@Table(name = "equipamento")
public class Equipamento {
    //----------------------------------------------//
    //-------------------Variable-------------------//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipamento", nullable = false, unique = true)
    private Long id;
    @Column(name = "codigo_equipamento", nullable = false)
    private String codigoEquipamento;
    @Column(name = "tipo_equipamento", nullable = false)
    private String tipoEquipamento;

    private Chamado chamado;
    //-------------------End Variable-------------------//
    //--------------------------------------------------//

    //-------------------------------------------------//
    //-------------------Constructor-------------------//
    public Equipamento() {
    }

    public Equipamento(Long id, String codigoEquipamento, String tipoEquipamento, Chamado chamado) {
        this.id = id;
        this.codigoEquipamento = codigoEquipamento;
        this.tipoEquipamento = tipoEquipamento;
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

    public String getCodigoEquipamento() {
        return codigoEquipamento;
    }

    public void setCodigoEquipamento(String codigoEquipamento) {
        this.codigoEquipamento = codigoEquipamento;
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
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
