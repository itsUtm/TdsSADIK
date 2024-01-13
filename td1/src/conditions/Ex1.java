package conditions;

	import java.util.Scanner;
	public class Ex1 {
	    public static void main(String[] args) { 
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Entrez la premi�re variable : ");
	        int variable1 = scanner.nextInt();

	        System.out.print("Entrez la deuxi�me variable : ");
	        int variable2 = scanner.nextInt();

	        System.out.print("Entrez la troisi�me variable : ");
	        int variable3 = scanner.nextInt();

	        // Appeler la fonction pour trouver le maximum
	        int maximum = trouverMaximum(variable1, variable2, variable3);

	        // Afficher le r�sultat
	        System.out.println("Le maximum des trois variables est : " + maximum);

	        // Fermer le scanner
	        scanner.close();
	    }

	    // Fonction pour trouver le maximum des trois variables
	    public static int trouverMaximum(int a, int b, int c) {
	        // Utiliser la m�thode Math.max pour trouver le maximum de deux nombres,
	        // puis appliquer � nouveau pour trouver le maximum des trois
	        return Math.max(Math.max(a, b), c);
	    }
	}
