/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hospital {
    
    @Id
    @GeneratedValue 
    private int idHospital;
    
    private String consequencias;
    
    @Column(nullable = true)
    private String hospitalOutroQual;
    
    private String procedimento;
        
    @Column(nullable = true)
    private String hospitalEvolucao;
    @Column(nullable = true)
    private String hospitalSeObitoData;

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public String getHospitalOutroQual() {
        return hospitalOutroQual;
    }

    public void setHospitalOutroQual(String hospitalOutroQual) {
        this.hospitalOutroQual = hospitalOutroQual;
    }

    public String getConsequencias() {
        return consequencias;
    }

    public void setConsequencias(String consequencias) {
        this.consequencias = consequencias;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public String getHospitalEvolucao() {
        return hospitalEvolucao;
    }

    public void setHospitalEvolucao(String hospitalEvolucao) {
        this.hospitalEvolucao = hospitalEvolucao;
    }

    public String getHospitalSeObitoData() {
        return hospitalSeObitoData;
    }

    public void setHospitalSeObitoData(String hospitalSeObitoData) {
        this.hospitalSeObitoData = hospitalSeObitoData;
    }
    
    
    
}
