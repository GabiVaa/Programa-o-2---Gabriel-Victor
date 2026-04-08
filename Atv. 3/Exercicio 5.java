public class Exercicio5 {
    public static void main(String[] args) {
        String texto = "Computação";

        char primeiro = texto.charAt(0);
        char terceiro = texto.charAt(2);
        char ultimo = texto.charAt(texto.length() - 1);

        System.out.println("Primeiro caractere: " + primeiro);
        System.out.println("Terceiro caractere: " + terceiro);
        System.out.println("Último caractere: " + ultimo);
    }
}
