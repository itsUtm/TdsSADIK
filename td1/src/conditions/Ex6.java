package conditions;
	import java.util.Scanner;
	public class Ex6 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Demander à l'utilisateur de saisir les valeurs A et B
	        System.out.print("Entrez la valeur de A : ");
	        int a = scanner.nextInt();

	        System.out.print("Entrez la valeur de B : ");
	        int b = scanner.nextInt();

	        // Appeler la fonction pour afficher le signe du produit de A et B
	        afficherSigneProduit(a, b);

	        // Fermer le scanner
	        scanner.close();
	    }

	    // Fonction pour afficher le signe du produit de A et B sans faire la multiplication
	    public static void afficherSigneProduit(int a, int b) {
	        // Déterminer le signe du produit en fonction des règles de signes
	        if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
	            System.out.println("Le produit de A et B est positif.");
	        } else if (a == 0 || b == 0) {
	            System.out.println("Le produit de A et B est nul.");
	        } else {
	            System.out.println("Le produit de A et B est négatif.");
	        }
	    }
	}
