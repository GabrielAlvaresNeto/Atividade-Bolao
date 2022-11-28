/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabriel.atividade.Models;

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
@Table(name = "Partida")
public class PartidaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false)
    private SelecaoModel mandante;
    
    @Column(nullable = false)
    private SelecaoModel visitante;
    
    @Column(nullable = false)
    private int gols_mandante;
    
    @Column(nullable = false)
    private int gols_visitante;
    
    private String tempo;

    public PartidaModel() {
    }

    public PartidaModel(SelecaoModel mandante, SelecaoModel visitante, int gols_mandante, int gols_visitante, String tempo) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.gols_mandante = gols_mandante;
        this.gols_visitante = gols_visitante;
        this.tempo = tempo;
    }
    
    public Long getId() {
        return id;
    }

    public SelecaoModel getMandante() {
        return mandante;
    }

    public void setMandante(SelecaoModel mandante) {
        this.mandante = mandante;
    }

    public SelecaoModel getVisitante() {
        return visitante;
    }

    public void setVisitante(SelecaoModel visitante) {
        this.visitante = visitante;
    }

    public int getGols_mandante() {
        return gols_mandante;
    }

    public void setGols_mandante(int gols_mandante) {
        this.gols_mandante = gols_mandante;
    }

    public int getGols_visitante() {
        return gols_visitante;
    }

    public void setGols_visitante(int gols_visitante) {
        this.gols_visitante = gols_visitante;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
    
    
}
