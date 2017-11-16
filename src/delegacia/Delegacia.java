/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delegacia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Delegacia {

    @Id
    @GeneratedValue
    private int idDelegacia;

    @Column(nullable = true)
    private String violenciaSeOcorreuViolencia;
    
    @Column(nullable = true)
    private String violenciaSeOcorreuPenetracao;

    @Column(nullable = true)
    private String violenciaNumeroEnvolvidos;
    
    @Column(nullable = true)
    private String violenciaRelacaoPessoaAtendida;
    
    @Column(nullable = true)
    private String violenciaSexoAutor;
    
    @Column(nullable = true)
    private String violenciaSuspeitaAlcool;

    public int getIdDelegacia() {
        return idDelegacia;
    }

    public void setIdDelegacia(int idDelegacia) {
        this.idDelegacia = idDelegacia;
    }

    public String getViolenciaSeOcorreuViolencia() {
        return violenciaSeOcorreuViolencia;
    }

    public void setViolenciaSeOcorreuViolencia(String violenciaSeOcorreuViolencia) {
        this.violenciaSeOcorreuViolencia = violenciaSeOcorreuViolencia;
    }

    public String getViolenciaSeOcorreuPenetracao() {
        return violenciaSeOcorreuPenetracao;
    }

    public void setViolenciaSeOcorreuPenetracao(String violenciaSeOcorreuPenetracao) {
        this.violenciaSeOcorreuPenetracao = violenciaSeOcorreuPenetracao;
    }

    public String getViolenciaNumeroEnvolvidos() {
        return violenciaNumeroEnvolvidos;
    }

    public void setViolenciaNumeroEnvolvidos(String violenciaNumeroEnvolvidos) {
        this.violenciaNumeroEnvolvidos = violenciaNumeroEnvolvidos;
    }

    public String getViolenciaRelacaoPessoaAtendida() {
        return violenciaRelacaoPessoaAtendida;
    }

    public void setViolenciaRelacaoPessoaAtendida(String violenciaRelacaoPessoaAtendida) {
        this.violenciaRelacaoPessoaAtendida = violenciaRelacaoPessoaAtendida;
    }

    public String getViolenciaSexoAutor() {
        return violenciaSexoAutor;
    }

    public void setViolenciaSexoAutor(String violenciaSexoAutor) {
        this.violenciaSexoAutor = violenciaSexoAutor;
    }

    public String getViolenciaSuspeitaAlcool() {
        return violenciaSuspeitaAlcool;
    }

    public void setViolenciaSuspeitaAlcool(String violenciaSuspeitaAlcool) {
        this.violenciaSuspeitaAlcool = violenciaSuspeitaAlcool;
    }

    
    
}
