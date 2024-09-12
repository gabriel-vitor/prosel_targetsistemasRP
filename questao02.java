import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String texto = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vez(es).");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }
}
