import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    protected String dataNascimento;

    public Funcionario(String nome, String cpf, double salario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | CPF: " + cpf + " | Data Nasc.: " + dataNascimento;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, double salario, String dataNascimento) {
        super(nome, cpf, salario, dataNascimento);
    }

    @Override
    public double getSalario() {
        return super.getSalario() + 2000.00;
    }

    @Override
    public String toString() {
        return "[Gerente] " + super.toString();
    }
}

class Atendente extends Funcionario {
    private double comissao;

    public Atendente(String nome, String cpf, double salario, String dataNascimento, double comissao) {
        super(nome, cpf, salario, dataNascimento);
        this.comissao = comissao;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + this.comissao;
    }

    @Override
    public String toString() {
        return "[Atendente] " + super.toString() + " | Comissao: R$" + comissao;
    }
}

public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n===== MENU DE FUNCIONARIOS =====");
            System.out.println("1. Adicionar gerente");
            System.out.println("2. Adicionar atendente");
            System.out.println("3. Listar todos os funcionarios");
            System.out.println("4. Mostrar salario de funcionario");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opcao: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Gerente: ");
                    String nomeG = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfG = scanner.nextLine();
                    System.out.print("Data de Nascimento (dd/mm/aaaa): ");
                    String dataG = scanner.nextLine();
                    System.out.print("Salario Base: R$ ");
                    double salarioG = scanner.nextDouble();
                    
                    listaFuncionarios.add(new Gerente(nomeG, cpfG, salarioG, dataG));
                    System.out.println("Gerente adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do Atendente: ");
                    String nomeA = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfA = scanner.nextLine();
                    System.out.print("Data de Nascimento (dd/mm/aaaa): ");
                    String dataA = scanner.nextLine();
                    System.out.print("Salario Base: R$ ");
                    double salarioA = scanner.nextDouble();
                    System.out.print("Comissao: R$ ");
                    double comissaoA = scanner.nextDouble();
                    
                    listaFuncionarios.add(new Atendente(nomeA, cpfA, salarioA, dataA, comissaoA));
                    System.out.println("Atendente adicionado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- Lista de Funcionarios ---");
                    if (listaFuncionarios.isEmpty()) {
                        System.out.println("Nenhum funcionario cadastrado.");
                    } else {
                        for (Funcionario f : listaFuncionarios) {
                            System.out.println(f.toString());
                        }
                    }
                    break;

                case 4:
                    System.out.print("Informe o CPF do funcionario: ");
                    String buscaCpf = scanner.nextLine();
                    boolean encontrado = false;

                    for (Funcionario f : listaFuncionarios) {
                        if (f.getCpf().equals(buscaCpf)) {
                            System.out.printf("O salario de %s e: R$ %.2f\n", f.getNome(), f.getSalario());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Funcionario nao encontrado!");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        }
        
        scanner.close();
    }
}