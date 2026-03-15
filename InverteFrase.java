public class InverteFrase {
    public static void main(String[] args) {

        String frase = "eu gosto de java";

        String[] palavras = frase.split(" ");

        Pilha<String> invertido = new Pilha<>(palavras.length);

        String resultado = "";

        for (int i = 0; i < palavras.length; i++) {
            invertido.empilha(palavras[i]);
        }

        while (!invertido.estaVazia()){
            resultado = resultado + invertido.desempilha() + " ";
        }

        System.out.println(resultado);


    }
}
