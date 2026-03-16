package MiniBanco;
import java.util.Scanner;
public class MiniBanco {
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //variaveis principais da conta
        double saldo = 0.0;
        int opcao = -1;

        //Boas vindas
        System.out.println(" Digite o seu nome ");
        String nome = scanner.next();
        System.out.printf(" Olá, %s! Saldo inicial: R$ %.2f\n", nome, saldo);

        scanner.close();









    }
    
}
