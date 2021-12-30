import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();

        int inicio = min;
        int fim = max;

        if (min > max){
            inicio = max;
            fim = min;
        }

        int soma = 0;

        for(int i = inicio + 1;i < fim; i++){
            if(!(i % 2 == 0)){
                soma += i;
            }
        }

        System.out.println(soma);
    }
}