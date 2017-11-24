package util;

public class Fila<T> {
    
    protected T[] elementos;
    protected int tamanho;
    
    public Fila() {
    }
    
    public Fila(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }
    
    public void enfileira(T elemento) {
        aumentaCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
        }
    }
    
    protected void enfileira(int posicao, T elemento) {
        aumentaCapacidade();
        for (int i = getTamanho() - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }
    
    public boolean estaVazia() {
        return this.tamanho == 0;
    }
    
    protected void aumentaCapacidade() {
        if (tamanho == elementos.length) {
            T[] elementosNovos = (T[]) new Object[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }
    
    public int getTamanho() {
        return this.tamanho;
    }
    
    public void remove(int posicao) {
        busca(posicao);
        for (int i = posicao; i < getTamanho(); i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }
    
    public void remove(T elemento) {
        busca(busca(elemento));
        for (int i = busca(elemento); i < getTamanho(); i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }
    
    public void desenfileirar() {
        if (!estaVazia()) {
            for (int i = 0; i < getTamanho(); i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanho--; 
            
        } else {
            System.err.println("Fila vazia!");
        }
        
    }
    
    public T busca(int posicao) {
        if (posicao < getTamanho() && posicao > -1) {
            return elementos[posicao];
        } else {
            throw new IllegalArgumentException("Posição inválida");
        }
    }
    
    public int busca(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean contem(T elemento) {
        return busca(elemento) > -1;
    }
    
    public T espiar() {
        if (!estaVazia()) {
            return elementos[0];
        } else {
            return null;
        }
    }
    
    public int ultimoIndex(T elemento) {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
    
    public void limpar() {
        
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = null;
        }
        tamanho = 0;
        
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tamanho - 1; i++) {
            sb.append(elementos[i]);
            sb.append(", ");
        }
        if (tamanho > 0) {
            sb.append(elementos[tamanho - 1]);
        }
        sb.append("]");
        return sb.toString();
    }
}
