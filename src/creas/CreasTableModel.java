/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creas;

import delegacia.*;
import hospital.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import vitima.Vitima;

/**
 *
 * @author Katyeudo
 */
public class CreasTableModel extends AbstractTableModel {

    private List<Creas> creas = new ArrayList<>();
    private String[] colunas = {"ID", "Encaminhamento", "Circunstância da Lesão", "Classificação Final"};

    public CreasTableModel(List<Creas> creas) {
        this.creas = creas;
    }

    @Override
    public int getRowCount() {
        return creas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Creas creas = this.creas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return creas.getIdCreas();
            case 1:
                return creas.getCreasEncaminhamento();
            case 2:
                return creas.getCreasCircunstacia();
            case 3:
                return creas.getCreasClassificacao();
            

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
            case 4:
                return colunas[4];
            case 5:
                return colunas[5];
            case 6:
                return colunas[6];
        }
        return null;
    }

}
