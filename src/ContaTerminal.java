import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o seu Nome Completo!");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        numeroAgencia = scan.next();

        System.out.println("Por favor, digite o número da Conta !");
        numeroConta = scan.nextInt();

        System.out.println("Por favor, digite o Saldo !");
        saldo = scan.nextDouble();

        System.out.printf(
                "Olá " + nomeCliente +
                        ", obrigado por criar uma conta em nosso banco! \n" +
                        "sua agência é: " + numeroAgencia +
                        ", sua conta é: " + numeroConta +
                        " e seu saldo R$" + saldo +
                        " já está disponível para saque!"
        );

    }
}