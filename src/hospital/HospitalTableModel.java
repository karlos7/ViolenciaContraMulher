/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import vitima.Vitima;

/**
 *
 * @author Katyeudo
 */
public class HospitalTableModel extends AbstractTableModel {
    
    
    private List<Hospital> hospital = new ArrayList<>();
    private String[] colunas = {"ID", "Consequência", "Procedimento", "Evolução"};

    public HospitalTableModel(List<Hospital> hospital) {
        this.hospital = hospital;
    }

    @Override
    public int getRowCount() {
        return hospital.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Hospital hospital = this.hospital.get(rowIndex);
        String tipoConsequencia = hospital.getConsequencias();
        if (tipoConsequencia.equalsIgnoreCase("Outros")) {
            tipoConsequencia = hospital.getHospitalOutroQual();
        }
        
        
        
        switch (columnIndex) {
            case 0:
                return hospital.getIdHospital();
            case 1:
                return tipoConsequencia;
            case 2:
                return hospital.getProcedimento();
            case 3:
                return hospital.getHospitalEvolucao();
        }
        return null;
    }

    @Override
    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];
        }
        return null;
    }

}
