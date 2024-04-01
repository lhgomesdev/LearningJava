import java.util.Scanner;
public class aula03 {
    public static void main(String[] args) throws Exception {

    Scanner input = new Scanner(System.in);
    
    System.out.println("Informe o seu peso: ");
    double peso = input.nextDouble();
    
    System.out.println("Informe a sua altura: (EM METROS)");
    double altura = input.nextDouble();
    
    double imc = (peso / (altura*altura));
    System.out.printf("%.2f", imc);

    if (imc <= 19) {
        System.out.println("voce esta em situação de baixo peso");
    } else if ((imc > 19) && (imc <= 25)) {
        System.out.println("Voce esta em peso normal");
    } else if (imc > 25) {
    System.out.println(" Voce esta em situaçao de sobrepeso");
    }
    
    input.close();
    }
}
