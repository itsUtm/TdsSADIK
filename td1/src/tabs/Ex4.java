package tabs;
import java.util.Scanner;
public class Ex4 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Saisie des dimensions de la matrice
	        System.out.print("Entrez la taille des matrices carrées (nombre de lignes/colonnes) : ");
	        int taille = scanner.nextInt();

	        // Saisie de la première matrice
	        System.out.println("Saisie de la première matrice :");
	        double[][] matrice1 = saisirMatrice(taille);

	        // Saisie de la deuxième matrice
	        System.out.println("Saisie de la deuxième matrice :");
	        double[][] matrice2 = saisirMatrice(taille);

	        // Calcul de la somme des matrices
	        double[][] sommeMatrices = sommerMatrices(matrice1, matrice2);

	        // Affichage du résultat
	        System.out.println("La somme des matrices est :");
	        afficherMatrice(sommeMatrices);

	        scanner.close();
	    }

	    public static double[][] saisirMatrice(int taille) {
	        Scanner scanner = new Scanner(System.in);
	        double[][] matrice = new double[taille][taille];

	        for (int i = 0; i < taille; i++) {
	            for (int j = 0; j < taille; j++) {
	                System.out.print("Entrez l'élément à la position [" + (i + 1) + "][" + (j + 1) + "] : ");
	                matrice[i][j] = scanner.nextDouble();
	            }
	        }

	        return matrice;
	    }

	    public static double[][] sommerMatrices(double[][] matrice1, double[][] matrice2) {
	        int taille = matrice1.length;
	        double[][] sommeMatrices = new double[taille][taille];

	        for (int i = 0; i < taille; i++) {
	            for (int j = 0; j < taille; j++) {
	                sommeMatrices[i][j] = matrice1[i][j] + matrice2[i][j];
	            }
	        }

	        return sommeMatrices;
	    }

	    public static void afficherMatrice(double[][] matrice) {
	        int taille = matrice.length;

	        for (int i = 0; i < taille; i++) {
	            for (int j = 0; j < taille; j++) {
	                System.out.print(matrice[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
	}

