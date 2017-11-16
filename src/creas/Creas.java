/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creas;

import delegacia.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Creas {

    @Id
    @GeneratedValue
    private int idCreas;

    @Column(nullable = true)
    private String creasEncaminhamento;
    
    @Column(nullable = true)
    private String creasCircunstacia;

    @Column(nullable = true)
    private String creasClassificacao;
    
    @Column(nullable = true)
    private String creasObservacoes;

    public int getIdCreas() {
        return idCreas;
    }

    public void setIdCreas(int idCreas) {
        this.idCreas = idCreas;
    }

    public String getCreasEncaminhamento() {
        return creasEncaminhamento;
    }

    public void setCreasEncaminhamento(String creasEncaminhamento) {
        this.creasEncaminhamento = creasEncaminhamento;
    }

    public String getCreasCircunstacia() {
        return creasCircunstacia;
    }

    public void setCreasCircunstacia(String creasCircunstacia) {
        this.creasCircunstacia = creasCircunstacia;
    }

    public String getCreasClassificacao() {
        return creasClassificacao;
    }

    public void setCreasClassificacao(String creasClassificacao) {
        this.creasClassificacao = creasClassificacao;
    }

    public String getCreasObservacoes() {
        return creasObservacoes;
    }

    public void setCreasObservacoes(String creasObservacoes) {
        this.creasObservacoes = creasObservacoes;
    }
        
}
