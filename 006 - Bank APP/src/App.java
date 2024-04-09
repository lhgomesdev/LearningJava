import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
         
        Random rand = new Random();
        int max = 25000;
        int min = 2500;
        int saldo = rand.nextInt(max + 1 - min) + min;

        System.out.println("Digite seu SUPER nome:");
        String nome = input.nextLine();
        System.out.println("Bem Vindo ao SUPER BANCO™");
        System.out.println("Dados do cliente:");
        System.out.println("SUPER nome:   "+ nome);
        System.out.println("Sua conta é uma SUPER CONTA CORRENTE");
        System.out.println("""
                Operações

                1 - Consultar saldo
                2 - Fazer um pix
                3 - Sair
                """);

                System.out.println("Digite a opção que você deseja: ");
                int escolha = input.nextInt();
                
                switch (escolha) {
                    case 1:
                        System.out.println("Seu SUPER SALDO é: R$"+ saldo);
                        break;
                    case 2:
                    System.out.println("digite o valor a ser transferido: ");
                    int transf = input.nextInt();
                    saldo -= transf;
                    if (saldo >= 0) {
                        System.out.println("""
                                SUPER Pix Feito com sucesso!

                                O seu saldo atual é de: R$"""+ saldo);
                    }
                    else {
                        System.out.println("""
                                SUPER Pix não foi feito!

                                Saldo Insuficiente! tente novamente.""");
                            }
                            break;
                            case 3:
                            System.out.println("Obrigado por usar nossos SUPER serviços!");
                    default:
                    System.out.println("Por favor insira uma opção válida.");
                        break;
                }
        input.close();
    }
}
