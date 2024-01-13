package loops;
import java.util.Scanner;
public class Ex3 {
	    public static void main(String[] args) {
	        int max = Integer.MIN_VALUE, n, p = 0, j = 1;
	        Scanner scanner = new Scanner(System.in);
	        do {
	            System.out.println("The N:");
	            n = scanner.nextInt();
	            if (n > max) {
	                max = n;
	                p = j;
	            }
	            j++;
	        } while (n != 0);

	        System.out.println("Max = " + max + " P = " + p);
	    }
	}
