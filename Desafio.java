import java.util.Scanner;
import java.io.PrintStream;
public class Desafio {

    public static void main(String[] args){
        //Definição das variaveis
        String nome = "Wilson Nascimento Costa";
        String conta = "Conta Corrente";
        double saldo = 100.0;

        //Informações da conta
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo: " + saldo +"\n");

        //Definição da variavel Scanner
        Scanner r = new Scanner(System.in);

        //Variavel opção iniciada em zero
        int option = 0;


        //Definição do menu
        String menu =
                """
                |Escolha uma opção
                |1 - Saldo
                |2 - Transferir
                |3 - Depositar
                |4 - Encerrar
                """;

        //Loop com condicionais
        while (option != 4){
            System.out.println(menu);
            option = r.nextInt();

            switch (option){
                case 1:
                    System.out.println("Saldo: " + saldo + "\n");
                    break;
                case 2:
                    System.out.println("Informe o valor da transferencia\n");
                    double transferencia = r.nextDouble();
                    if(transferencia > saldo){
                        System.out.println("Saldo insuficiente.\n");
                    }else {
                        saldo -= transferencia;
                        System.out.println("Tranferencia realizada com sucesso!\nSaldo atual: " + saldo + "\n");
                    }
                    break;
                case 3:
                    System.out.println("Informe o valor do deposito\n");
                    double deposito = r.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atualizado: " + saldo + "\n");
                    break;

                default:
                    System.out.println("Opção invalida!\n");
                    break;
            }


        }






    }
}
