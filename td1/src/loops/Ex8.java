package loops;
	import java.util.Scanner;

	public class Ex8 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Entrez le nombre d'étoiles à afficher : ");
	        int nombreEtoiles = scanner.nextInt();

	        for (int i = 1; i <= nombreEtoiles; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        for (int i = nombreEtoiles - 1; i > 0; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	}
