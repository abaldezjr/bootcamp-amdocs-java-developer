import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double raiz = Math.pow(5, 0.5);
        double primeiraParte = Math.pow((1 + raiz) / 2, n);
        double segundaParte = Math.pow((1 - raiz) / 2, n);
        double numerador = primeiraParte - segundaParte;
        System.out.println(Math.floor(numerador / raiz));
    }
}