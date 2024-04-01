import java.util.Scanner;

public class aula02 {

    public static void main(String[] args) {
    System.out.println("calculadora de soma");
    Scanner input = new Scanner (System.in);
        
    System.out.println("fala o primeiro numero");
    double n1 = input.nextDouble();

    System.out.println("fala o segundo numero");
    double n2 = input.nextDouble();
    System.out.println(n1 + n2);

    System.out.println("Fale mais um numero para adicionar a conta");
    double n3 = input.nextDouble();
    double ntot = n1 + n2 + n3;
    System.out.printf("a soma de %.2f + %.2f + %.2f é %.2f", n1, n2, n3, ntot);

    input.close();
    }
}