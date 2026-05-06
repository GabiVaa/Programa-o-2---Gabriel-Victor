package praticasete;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double notaTrabalho;

    public Aluno(String nome, String matricula, double nota1, double nota2, double notaTrabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2 + this.notaTrabalho) / 3.0;
    }

    public void verificarSituacao() {
        double media = this.calcularMedia();
        System.out.println("Aluno(a): " + this.nome + " | Matrícula: " + this.matricula);
        System.out.printf("Média: %.2f%n", media);
        
        if (media >= 7.0) {
            System.out.println("Situação: APROVADO\n");
        } else {
            System.out.println("Situação: REPROVADO\n");
        }
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public double getNota1() { return nota1; }
    public void setNota1(double nota1) { this.nota1 = nota1; }
    public double getNota2() { return nota2; }
    public void setNota2(double nota2) { this.nota2 = nota2; }
    public double getNotaTrabalho() { return notaTrabalho; }
    public void setNotaTrabalho(double notaTrabalho) { this.notaTrabalho = notaTrabalho; }
}
