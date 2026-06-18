import java.util.Scanner;

// Exceção personalizada
class LoginInvalidoException extends Exception {
    public LoginInvalidoException(String mensagem) {
        super(mensagem);
    }
}

// Sistema de login
class SistemaLogin {
    private String senhaSecreta;

    public SistemaLogin() {
        this.senhaSecreta = "123456";
    }

    public void fazerLogin(String usuario, String senha)
            throws LoginInvalidoException {

        if (!senha.equals(senhaSecreta)) {
            throw new LoginInvalidoException(
                    "Acesso Negado: Credenciais incorretas"
            );
        }

        System.out.println("Login realizado com sucesso!");
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o login: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        SistemaLogin sistema = new SistemaLogin();

        try {
            sistema.fazerLogin(usuario, senha);
        } catch (LoginInvalidoException e) {
            System.out.println("Acesso Negado: Credenciais incorretas");
        }

        scanner.close();
    }
}
