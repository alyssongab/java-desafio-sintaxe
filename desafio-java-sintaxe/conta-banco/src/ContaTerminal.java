import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        int numAgencia = scanner.nextInt();

        System.out.println("Informe o código da agência: ");
        String codAgencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + codAgencia + ", conta " + numAgencia + " e seu saldo " + saldo + " já está disponível para saque!");
    }
}