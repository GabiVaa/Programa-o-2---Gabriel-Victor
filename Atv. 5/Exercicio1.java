public class Exercicio1 {

    public static double calcularHipotenusa(double a, double b) {
        double somaDosQuadrados = (a * a) + (b * b);
        return Math.sqrt(somaDosQuadrados);
    }

    public static void main(String[] args) {
        double catetoA = 3.0;
        double catetoB = 4.0;
        
        System.out.println("--- Exercício 1: Cálculo da Hipotenusa ---");
        System.out.println("Cateto A: " + catetoA + " | Cateto B: " + catetoB);
        System.out.println("Hipotenusa: " + calcularHipotenusa(catetoA, catetoB));
    }
}
