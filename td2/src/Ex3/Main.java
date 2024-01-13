package Ex3;

public class Main {
    public static void main(String[] args) {
        Livre livre = new Livre("tdPOO", "M", 0.0f, 2022);
        System.out.println(livre.toString());
        Livre livre2 = new Livre(livre);
        System.out.println(livre2.toString());
    }
}
