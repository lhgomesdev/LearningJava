// criar um codigo que imprime se o numero é multiplo ou não
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input =  new Scanner(System.in);

        System.out.println("Digite um número para encontrar seus múltiplos: ");
        int numero = input.nextInt();

        System.out.println("Digite o limite: ");
        int limite = input.nextInt();

        System.out.println("Os múltiplos de "+ numero + " até "+ limite + " são:");
        for (int i = numero; i < limite; i += numero) {
            System.out.println(i);
        
        input.close();
        }
    }
}
