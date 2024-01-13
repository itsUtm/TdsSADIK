package conditions;
import java.util.Scanner;

public class EX8 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Entrez le numéro du mois : ");
	        int mois = scanner.nextInt();

	        if (mois >= 1 && mois <= 12) {
	            int nombreJours = 0;

	            if (mois == 2) {
	                System.out.print("Entrez l'année (entre 1900 et 2100) : ");
	                int annee = scanner.nextInt();

	                if (estAnneeBissextile(annee)) {
	                    nombreJours = 29;
	                } else {
	                    nombreJours = 28;
	                }
	            } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
	                nombreJours = 30;
	            } else {
	                nombreJours = 31;
	            }

	            System.out.println("Le nombre de jours pour le mois " + mois + " est : " + nombreJours);
	        } else {
	            System.out.println("Numéro de mois invalide.");
	        }

	        scanner.close();
	    }

	    public static boolean estAnneeBissextile(int annee) {
	        return (annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0));
	    }
	}
