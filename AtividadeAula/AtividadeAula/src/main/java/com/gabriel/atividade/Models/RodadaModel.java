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
public class RodadaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false)
    private List<PartidaModel> partidas;
    
    private String data_limite;

    public RodadaModel() {
    }

    public RodadaModel(List<PartidaModel> partidas, String data_limite) {
        this.partidas = partidas;
        this.data_limite = data_limite;
    }

    public Long getId() {
        return id;
    }

    public List<PartidaModel> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<PartidaModel> partidas) {
        this.partidas = partidas;
    }

    public String getData_limite() {
        return data_limite;
    }

    public void setData_limite(String data_limite) {
        this.data_limite = data_limite;
    }
    
    
    
}
