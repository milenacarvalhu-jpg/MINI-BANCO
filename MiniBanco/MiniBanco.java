package MiniBanco;

import java.util.Scanner;

public class MiniBanco {

    static void exibirMenu() {
        System.out.println("\n=== MiniBanco ===");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Ver Extrato");
        System.out.println("0 - Sair");
        System.out.println("Escolha ");

    }

    static double Depositar(double saldo, double valor) {
        return saldo + valor;
    }

    static void exibirSaldo(double saldo) {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variaveis principais da conta
        double saldo = 0.0;
        int opcao = -1;

        // Boas vindas
        System.out.println(" Digite o seu nome ");
        String nome = scanner.next();
        System.out.printf(" Olá, %s! Saldo inicial: R$ %.2f\n", nome, saldo);

        while (opcao != 0) {
            exibirMenu();
            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.print(" Valor a depositar: R$ ");
                double valor = scanner.nextDouble();
                saldo = Depositar(saldo, valor);
                exibirSaldo(saldo);
                // System.out.println("[Depositar - em breve]");
            } else if (opcao == 2) {
                System.out.println("[Sacar - em breve]");
            } else if (opcao == 3) {
                System.out.println("[Consultar saldo]");
            } else if (opcao == 4) {
                System.out.println("[Extrato - em breve");
            } else if (opcao == 0) {
                System.out.println("Até logo, " + nome + "!");
            } else {
                System.out.println(" Opção Inválida.");
            }
            scanner.close();
            System.out.println("MiniBnaco Iniciado");

            exibirMenu();

        }

    }

}
