public class Pilha<T> {

    public Object[] elementos;
    public int tamanho;


    public Pilha(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }


    public void empilha(T elemento){
        if (this.tamanho < this.elementos.length){
            this.elementos[tamanho] = (T) elemento;
            this.tamanho++;
        }
    }

    public T desempilha(){
        T temp = (T) elementos[tamanho-1];
        this.elementos[tamanho-1] = null;
        tamanho--;
        return temp;
    }

    public T topo(){
        return (T) this.elementos[tamanho-1];
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

    // método para inverter a pilha
    public Pilha<T> inverte(){

        Pilha<T> aux = new Pilha<>(this.elementos.length);

        while (!this.estaVazia()){
            aux.empilha((T) this.desempilha());

        }

        this.elementos = aux.elementos;
        this.tamanho = aux.tamanho;

        return aux;
    }

    public boolean ehPalindromo(String palavra){

        Pilha<Character> pilha = new Pilha<>(palavra.length());

        for (int i= 0; i < palavra.length(); i++){
            pilha.empilha(palavra.charAt(i));
        }

        for (int i= 0; i < palavra.length(); i++){
            if (palavra.charAt(i) != pilha.desempilha()){
                return false;
            }
        }

        return true;

    }


}
