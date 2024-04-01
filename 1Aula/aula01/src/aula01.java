import java.util.Scanner;

public class aula01 {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite a nota A1: ");
        double A1 = input.nextDouble();
        
        System.out.println("Digite a nota A2: ");
        double A2 = input.nextDouble();
        
        System.out.println("Digite a nota A3: ");
        double A3 = input.nextDouble();

        double AT = ((3*A1) + (3*A2) + (4*A3));
        System.out.println("A soma das suas notas é " +  (AT));
        if (AT >= 70) {
            System.out.println("Aprovado(a)");
        } else if ((AT >= 50) && (AT < 70)) {
            System.out.println("Sub");
        } else {
            System.out.println("Reprovado(a)");
        }

        input.close();
    }

}
