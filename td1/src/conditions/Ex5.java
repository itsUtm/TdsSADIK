package conditions;
	import java.util.Scanner;
		import java.util.Scanner;
		public class Ex5 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Demander à l'utilisateur de saisir l'heure
		        System.out.print("Entrez l'heure (en format 24 heures) : ");
		        int heure = scanner.nextInt();

		        // Demander à l'utilisateur de saisir la langue ('f' pour français, 'a' pour anglais)
		        System.out.print("Choisissez la langue ('f' pour français, 'a' pour anglais) : ");
		        char langue = scanner.next().charAt(0);

		        // Appeler la fonction pour afficher le message selon l'heure et la langue
		        afficherMessageSelonHeureEtLangue(heure, langue);

		        // Fermer le scanner
		        scanner.close();
		    }

		    // Fonction pour afficher le message selon l'heure et la langue
		    public static void afficherMessageSelonHeureEtLangue(int heure, char langue) {
		        if (langue == 'f') {
		            if (heure >= 0 && heure <= 18) {
		                System.out.println("Bonjour");
		            } else if (heure > 18 && heure <= 22) {
		                System.out.println("Bonsoir");
		            } else {
		                System.out.println("Bonne nuit");
		            }
		        } else if (langue == 'a') {
		            if (heure >= 0 && heure <= 18) {
		                System.out.println("Good Morning");
		            } else if (heure > 18 && heure <= 22) {
		                System.out.println("Good Evening");
		            } else {
		                System.out.println("Good Night");
		            }
		        } else {
		            System.out.println("Langue non reconnue");
		        }
		    }
		}
