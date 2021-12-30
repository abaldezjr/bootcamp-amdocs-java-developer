import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String saida = "";
        while (leitor.hasNext()) {
            int graus = leitor.nextInt();
            saida = "De Madrugada!!";
            if(graus >= 0 && graus < 90 || graus == 360) saida = "Bom Dia!!";
            else if (graus >= 90 && graus < 180) saida = "Boa Tarde!!";
            else if (graus >= 180 && graus < 270) saida = "Boa Noite!!";
            System.out.println(saida);
        }
    }
}