package MiniBanco;

import java.util.Scanner;

public class MiniBanco {

    //CONSTANTES:

    static final double LIMITE_SAQUE = 1000.00;
    static final double TAXA_SAQUE = 0.02;
 
     static final double calcularTotalSaque(double Valor){
        return Valor + (Valor * TAXA_SAQUE);
     }
 
      static boolean  dentroDoLimite(double Valor){
        return Valor <= LIMITE_SAQUE;
      }

      static  boolean saldoSuficiente(double saldo, double Valor){
        return saldo >= calcularTotalSaque(Valor);

    }

    static double sacar(double saldo, double valor){
        return saldo - calcularTotalSaque(valor);
    }



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

    static boolean valorEhValido(double valor) {
        return valor >0;
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
                
                if(!valorEhValido(valor)){
                    System.out.println("Atenção, valor inválido. Valor deve ser maior que zero.");
                }else {
                    saldo = Depositar(saldo, valor);
                     System.out.print(" Deposito realizado! ");
                    exibirSaldo(saldo);
                   
                }


                // System.out.println("[Depositar - em breve]");
            } else if (opcao == 2) {
                System.out.print("Valor a depositar: R$");
                double valorsaque = scanner.nextDouble();

                if (!valorEhValido(valorsaque)){
                    System.out.println("Atenção, valor inválido.");
                } else if (!dentroDoLimite(valorsaque)){
                    System.out.printf("Limite exedido. maximo: R$ %.2f%n", LIMITE_SAQUE);
                } else if (!saldoSuficiente(saldo, valorsaque)){
                    System.out.printf("saldo insuficiente. Necessario: R$ %.2f%n", calcularTotalSaque(valorsaque));
                }else {
                    double taxa = valorsaque *TAXA_SAQUE;
                    saldo = sacar(saldo, valorsaque);
                    System.out.printf("saque realizado. Taxa cobrado R$ %.2f%n", taxa);
                }
 
            // System.out.println("[sacar - em breve]");
            } else if (opcao == 3) {
                System.out.println("[Consultar saldo]");
            } else if (opcao == 4) {
                System.out.println("[Extrato - em breve");
            } else if (opcao == 0) {
                System.out.println("Até logo, " + nome + "!");
            } else {
                System.out.println(" Opção Inválida.");
            }
            
        }
        
        scanner.close();
        System.out.println("MiniBnaco Iniciado");
    
        exibirMenu();
    }

}
