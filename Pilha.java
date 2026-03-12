public class Pilha<T> {

    public T[] elementos;
    public int tamanho;


    public Pilha(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }


    public void empilha(String elemento){
        if (this.tamanho < this.elementos.length){
            this.elementos[tamanho] = (T) elemento;
            this.tamanho++;
        }
    }

    public T desempilha(){
        T temp = elementos[tamanho-1];
        this.elementos[tamanho-1] = null;
        tamanho--;
        return temp;
    }

    public T topo(){
        return this.elementos[tamanho-1];
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);

            if (i < tamanho - 1){
                sb.append(", ");
            }
            
        }
        sb.append("]");
        return sb.toString();
    }
}
