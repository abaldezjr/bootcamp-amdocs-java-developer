import java.io.IOException;
import java.util.Scanner;

public class Teste{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();

        int H = leitor.nextInt();
        int L = leitor.nextInt();

        System.out.println((A < H && B < H || C < H)?"S":"N");
    }
}