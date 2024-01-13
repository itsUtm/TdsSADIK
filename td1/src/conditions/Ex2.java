package conditions;
	import java.util.Scanner;
	public class Ex2 {
	    public static void main(String[] args) {
	        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Entrez la valeur de a : ");
	        double a = scanner.nextDouble();
	        System.out.print("Entrez la valeur de b : ");
	        double b = scanner.nextDouble();
	        System.out.print("Entrez la valeur de c : ");
	        double c = scanner.nextDouble();
	        // Appeler la fonction pour résoudre l'équation quadratique
	        resoudreEquationQuadratique(a, b, c);
	        scanner.close();}
	    // Fonction pour résoudre l'équation quadratique
	    public static void resoudreEquationQuadratique(double a, double b, double c) {
	        // Calculer le discriminant
	        double discriminant = b * b - 4 * a * c;
	        // Vérifier le signe du discriminant pour déterminer le nombre de racines
	        if (discriminant > 0) {
	            double racine1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double racine2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            System.out.println("Deux racines réelles distinctes : " + racine1 + " et " + racine2);
	        } else if (discriminant == 0) {
	            double racine = -b / (2 * a);
	            System.out.println("Une racine réelle unique : " + racine);
	        } else {
	            System.out.println("Pas de racines réelles, les racines sont complexes.");
	            double partieReelle = -b / (2 * a);
	            double partieImaginaire = Math.sqrt(Math.abs(discriminant)) / (2 * a);
	            System.out.println("Première racine : " + partieReelle + " + " + partieImaginaire + "i");
	            System.out.println("Deuxième racine : " + partieReelle + " - " + partieImaginaire + "i");
	        }
	    }
	}
