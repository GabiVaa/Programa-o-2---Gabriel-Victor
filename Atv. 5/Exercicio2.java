public class Exercicio2 {

    public static int encontrarMaiorValor(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("O array não pode ser nulo ou vazio.");
        }
        
        int maior = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        
        return maior;
    }

    public static void main(String[] args) {
        int[] meusNumeros = {12, 45, 7, 89, 23};
        
        System.out.println("--- Exercício 2: Maior Valor ---");
        System.out.print("Array: ");
        for (int n : meusNumeros) System.out.print(n + " ");
        System.out.println("\nMaior valor encontrado: " + encontrarMaiorValor(meusNumeros));
    }
}
