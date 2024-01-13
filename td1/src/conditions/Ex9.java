package conditions;
import java.util.Scanner;

public class Ex9 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Entrez la première variable : ");
	        int a = scanner.nextInt();

	        System.out.print("Entrez la deuxième variable : ");
	        int b = scanner.nextInt();

	        if (a > b) {
	            // Échanger les valeurs si nécessaire
	            int temp = a;
	            a = b;
	            b = temp;
	        }

	        System.out.println("Les variables dans l'ordre croissant : " + a + ", " + b);

	        scanner.close();
	    }
	}
