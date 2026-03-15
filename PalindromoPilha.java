public class PalindromoPilha {

    public static void main(String[] args) {

        Pilha<String> pilha = new Pilha<>(10);

        if(pilha.ehPalindromo("arara")){
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }

        if(pilha.ehPalindromo("casa")){
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }


    }
}
