package util;

public class Pilha {

    private int[] elementos;
    private int tamanho;

    public Pilha(int capacidade) {
        elementos = new int[capacidade];
        this.tamanho = 0;
    }

    public Pilha() {
        this(10);
    }

    public boolean adiciona(int elemento) {
        aumentaCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public void adiciona(int posicao, int elemento) {
        busca(posicao);
        aumentaCapacidade();
        for (int i = getTamanho() - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }

    private void aumentaCapacidade() {
        if (tamanho == elementos.length) {
            int[] elementosNovos = new int[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public int desempilha(int posicao) {   
        
        busca(posicao);
        for (int i = posicao; i < getTamanho() - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        return this.elementos[--tamanho];
        
    }
    
    
    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public int busca(int posicao) {
        if (posicao < getTamanho() && posicao > -1) {
            return elementos[posicao];
        } else {
            throw new IllegalArgumentException("Posição inválida");
        }
    }

    public boolean contem(int elemento) {
        for (int i = 0; i < getTamanho(); i++) {
            if (elementos[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public int getTamanho() {
        return this.tamanho;
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
