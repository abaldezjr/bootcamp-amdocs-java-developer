import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {

        //complete o código com sua solução
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();

        int fatorial = 1;
        for(int n = 1; n <= A; n++){
            fatorial *= n;
        }

        System.out.println(fatorial);

    }
}