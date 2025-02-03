import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida! Digite um número decimal válido para o saldo: ");
            scanner.next();
        }
        double saldo = scanner.nextDouble();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco.\n", nomeCliente);
        System.out.printf("Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n", agencia, numero, saldo);

        scanner.close();
    }
}
