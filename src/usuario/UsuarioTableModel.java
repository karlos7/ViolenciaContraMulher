package usuario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class UsuarioTableModel extends AbstractTableModel{
    
   private List<Usuario> usuarios = new ArrayList<>();
    private String[] colunas = {"ID", "Nome",
        "Email", "Setor", "Login", "Senha"};

    public UsuarioTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = this.usuarios.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return usuario.getId();
            case 1:
                return usuario.getNome();
            case 2:
                return usuario.getEmail();
            case 3:
                return usuario.getFuncao();
            case 4:
                return usuario.getLogin();
            case 5:
                return usuario.getSenha();
            
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
            
        }
        return null;
    }
    
    
}
