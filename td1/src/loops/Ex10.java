package loops;

public class Ex10 {

    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (estEntierCubique(i)) {
                System.out.println(i + " est un entier cubique.");
            }
        }
    }

    public static boolean estEntierCubique(int nombre) {
        int original = nombre;
        int sommeCubes = 0;

        while (nombre != 0) {
            int chiffre = nombre % 10;
            sommeCubes += Math.pow(chiffre, 3);
            nombre /= 10;
        }

        return sommeCubes == original;
    }
}
