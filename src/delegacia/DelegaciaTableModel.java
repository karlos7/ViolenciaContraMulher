/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delegacia;

import creas.Creas;
import hospital.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.table.AbstractTableModel;
import vitima.Vitima;

/**
 *
 * @author Katyeudo
 */
public class DelegaciaTableModel extends AbstractTableModel {

    private Queue<Delegacia> delegacias = new LinkedList<>();
    private String[] colunas = {"ID", "Tipo de Violência", "Penetração", "Envolvidos", "Relação", "Sexo Autor", "Uso de Álcool"};

    public DelegaciaTableModel(List<Delegacia> delegacias) {
        this.delegacias.addAll(delegacias);
    }

    @Override
    public int getRowCount() {
        return delegacias.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        List<Delegacia> delegaciasList = new ArrayList<>();
        delegaciasList.addAll(delegacias);
        
        Delegacia delegacia = delegaciasList.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return delegacia.getIdDelegacia();
            case 1:
                return delegacia.getViolenciaSeOcorreuViolencia();
            case 2:
                return delegacia.getViolenciaSeOcorreuPenetracao();
            case 3:
                return delegacia.getViolenciaNumeroEnvolvidos();
            case 4:
                return delegacia.getViolenciaRelacaoPessoaAtendida();
            case 5:
                return delegacia.getViolenciaSexoAutor();
            case 6:
                return delegacia.getViolenciaSuspeitaAlcool();

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
