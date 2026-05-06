package praticasete;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria Silva", "202610123", 8.5, 7.0, 9.0);
        Aluno aluno2 = new Aluno("João Santos", "202610456", 5.0, 6.0, 5.5);

        System.out.println("--- RESULTADO DA AVALIAÇÃO ---\n");
        aluno1.verificarSituacao();
        aluno2.verificarSituacao();
    }
}
