//criar um app que receba do user valores inteiros de 0 a 6 e retorne o dia da semana
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva um dia da semana (0-6)");
        int diaSemana = input.nextInt();
        switch (diaSemana) {
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    input.close();
    }
}
