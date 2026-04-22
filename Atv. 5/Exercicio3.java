public class Exercicio3 {

    public static boolean elementoExiste(String[] array, String busca) {
        if (array == null || busca == null) {
            return false;
        }
        
        for (String elemento : array) {
            if (busca.equals(elemento)) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        String[] palavras = {"java", "github", "programacao", "codigo"};
        
        System.out.println("--- Exercício 3: Busca de Elemento ---");
        System.out.println("A palavra 'github' existe? " + elementoExiste(palavras, "github"));
        System.out.println("A palavra 'python' existe? " + elementoExiste(palavras, "python"));
    }
}
