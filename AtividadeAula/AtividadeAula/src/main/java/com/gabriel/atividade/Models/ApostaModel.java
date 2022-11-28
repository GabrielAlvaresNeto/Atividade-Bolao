/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabriel.atividade.Models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;

/**
 *
 * @author alunolab10
 */
@Entity
@Table(name = "Selecao")
public class ApostaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    
    @Column(nullable = false)
    private List<RodadaModel> rodadas;
    
    @Column(nullable = false)
    private int ap_gols_mandante;
    
    @Column(nullable = false)
    private int ap_gols_visitante;

    public ApostaModel() {
    }

    public ApostaModel(List<RodadaModel> rodadas, int ap_gols_mandante, int ap_gols_visitante) {
        this.rodadas = rodadas;
        this.ap_gols_mandante = ap_gols_mandante;
        this.ap_gols_visitante = ap_gols_visitante;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public List<RodadaModel> getRodadas() {
        return rodadas;
    }

    public void setRodadas(List<RodadaModel> rodadas) {
        this.rodadas = rodadas;
    }

    public int getAp_gols_mandante() {
        return ap_gols_mandante;
    }

    public void setAp_gols_mandante(int ap_gols_mandante) {
        this.ap_gols_mandante = ap_gols_mandante;
    }

    public int getAp_gols_visitante() {
        return ap_gols_visitante;
    }

    public void setAp_gols_visitante(int ap_gols_visitante) {
        this.ap_gols_visitante = ap_gols_visitante;
    }
    
    
    
}
