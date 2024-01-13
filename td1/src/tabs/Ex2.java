package tabs;
public class Ex2 {

    public static void main(String[] args) {
        int n = 4, i = 49;
        boolean start = false;
        int[] tab = new int[50];

        do {
            tab[i] = n % 2;
            n /= 2;
            i--;
        } while (n != 0);

        for (int v : tab) {
            if (start)
                System.out.print(v + " ");
            else {
                if (v == 1){
                    start = true;
                    System.out.print(v + " ");
                }
            }
        }
    }
}
