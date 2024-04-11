import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva uma frase ou parágrafo:");
        String frase = input.nextLine();

        int wordCounter = palavras(frase);
        System.out.println("Palavras Contadas: " + wordCounter);
        input.close();
    }
    public static int palavras(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String [] words = input.split("\\s+");
    
        return words.length;
    }
}
