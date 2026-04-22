public class Exercicio4 {

    public static int[] contarParesImpares(int[] array) {
        int[] resultado = new int[2]; 
        
        if (array == null) {
            return resultado; 
        }
        
        for (int numero : array) {
            if (numero % 2 == 0) {
                resultado[0]++; // Posição 0: Pares
            } else {
                resultado[1]++; // Posição 1: Ímpares
            }
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        int[] numerosParaTestar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("--- Exercício 4: Contar Pares e Ímpares ---");
        int[] resultado = contarParesImpares(numerosParaTestar);
        
        System.out.println("Quantidade de números pares: " + resultado[0]);
        System.out.println("Quantidade de números ímpares: " + resultado[1]);
    }
}
