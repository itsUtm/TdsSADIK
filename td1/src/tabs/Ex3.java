package tabs;
import java.util.Scanner;
public class Ex3 {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Entrez le nombre d'étudiants : ");
	        int nombreEtudiants = scanner.nextInt();

	        double[] moyennes = new double[nombreEtudiants];

	        System.out.println("Entrez les moyennes des étudiants :");
	        for (int i = 0; i < nombreEtudiants; i++) {
	            moyennes[i] = scanner.nextDouble();
	        }

	        System.out.print("Entrez le seuil de moyenne : ");
	        double seuil = scanner.nextDouble();

	        int nombreEtudiantsSupSeuil = 0;

	        for (double moyenne : moyennes) {
	            if (moyenne >= seuil) {
	                nombreEtudiantsSupSeuil++;
	            }
	        }

	        System.out.println("Le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil est : " + nombreEtudiantsSupSeuil);

	        scanner.close();
	    }
	}
