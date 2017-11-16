/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitima;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Katyeudo
 */
public class VitimaTableModel extends AbstractTableModel {

    private List<Vitima> vitimas = new ArrayList<>();
    private String[] colunas = {"ID", "Nome da Vítima",
        "Município de Notificação", "Unidade de Saúde", "Cartão SUS", "Nome da Mãe",
        "Municipio de Residência", "Tipo de Violência"};

    public VitimaTableModel(List<Vitima> vitimas) {
        this.vitimas = vitimas;
    }

    @Override
    public int getRowCount() {
        return vitimas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vitima vitima = this.vitimas.get(rowIndex);
        String tipoViolencia = vitima.getTipoViolencia();
        if (tipoViolencia.equalsIgnoreCase("Outros")) {
            tipoViolencia = vitima.getTipoViolenciaOutro();
        }
        switch (columnIndex) {
            case 0:
                return vitima.getIdVitima();
            case 1:
                return vitima.getNomePessoaAtendida();
            case 2:
                return vitima.getMunicipioNotificacao();
            case 3:
                return vitima.getUnidadeSaude();
            case 4:
                return vitima.getNumCartaoSus();
            case 5:
                return vitima.getNomeMae();
            case 6:
                return vitima.getMunicipioResidencia();
            case 7:
                return tipoViolencia;
            
        }
        return null;
    }

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
            case 4:
                return colunas[4];
            case 5:
                return colunas[5];
            case 6:
                return colunas[6];
            case 7:
                return colunas[7];
            
        }
        return null;
    }

}
