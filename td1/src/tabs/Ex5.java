package tabs;

public class Ex5 {

	    public static void main(String[] args) {
	        char[] tableau = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};

	        afficherTableau(tableau);

	        decalerElements(tableau);

	        afficherTableau(tableau);
	    }

	    public static void decalerElements(char[] tableau) {
	        if (tableau.length > 0) {
	            char dernierElement = tableau[tableau.length - 1];

	            for (int i = tableau.length - 1; i > 0; i--) {
	                tableau[i] = tableau[i - 1];
	            }

	            tableau[0] = dernierElement;
	        }
	    }

	    public static void afficherTableau(char[] tableau) {
	        for (char element : tableau) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	    }
	}
