public class Exercicio2.1 {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        System.out.println("--- Valores Default ---");
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());

        System.out.println("\n--- Valores Modificados (Válidos) ---");
        retangulo.setAltura(5.5);
        retangulo.setLargura(10.0);
        System.out.println("Nova Altura: " + retangulo.getAltura());
        System.out.println("Nova Largura: " + retangulo.getLargura());
        System.out.println("Nova Área: " + retangulo.calcularArea());
        System.out.println("Novo Perímetro: " + retangulo.calcularPerimetro());

        System.out.println("\n--- Testando Validação (Inválidos) ---");
        retangulo.setAltura(25.0); 
        retangulo.setLargura(-2.0); 
        
        System.out.println("Altura final: " + retangulo.getAltura());
        System.out.println("Largura final: " + retangulo.getLargura());
    }
}
