public class Teste02 {
    public static void main(String[] args) {

        Pilha<String> palavras = new Pilha<String>(5);

        palavras.empilha("H");
        palavras.empilha("e");
        palavras.empilha("l");
        palavras.empilha("l");
        palavras.empilha("o");

        palavras.inverte();

        System.out.println(palavras);





    }
}
