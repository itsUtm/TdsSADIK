package conditions;
	import java.util.Scanner;
	public class Ex2 {
	    public static void main(String[] args) {
	        // Cr�er un objet Scanner pour lire l'entr�e de l'utilisateur
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Entrez la valeur de a : ");
	        double a = scanner.nextDouble();
	        System.out.print("Entrez la valeur de b : ");
	        double b = scanner.nextDouble();
	        System.out.print("Entrez la valeur de c : ");
	        double c = scanner.nextDouble();
	        // Appeler la fonction pour r�soudre l'�quation quadratique
	        resoudreEquationQuadratique(a, b, c);
	        scanner.close();}
	    // Fonction pour r�soudre l'�quation quadratique
	    public static void resoudreEquationQuadratique(double a, double b, double c) {
	        // Calculer le discriminant
	        double discriminant = b * b - 4 * a * c;
	        // V�rifier le signe du discriminant pour d�terminer le nombre de racines
	        if (discriminant > 0) {
	            double racine1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double racine2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            System.out.println("Deux racines r�elles distinctes : " + racine1 + " et " + racine2);
	        } else if (discriminant == 0) {
	            double racine = -b / (2 * a);
	            System.out.println("Une racine r�elle unique : " + racine);
	        } else {
	            System.out.println("Pas de racines r�elles, les racines sont complexes.");
	            double partieReelle = -b / (2 * a);
	            double partieImaginaire = Math.sqrt(Math.abs(discriminant)) / (2 * a);
	            System.out.println("Premi�re racine : " + partieReelle + " + " + partieImaginaire + "i");
	            System.out.println("Deuxi�me racine : " + partieReelle + " - " + partieImaginaire + "i");
	        }
	    }
	}
