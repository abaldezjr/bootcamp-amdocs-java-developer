import java.io.IOException;
import java.util.Scanner;

public class Teste{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String saida = "";
        while (leitor.hasNext()) {
            double graus = leitor.nextDouble();

            if (graus <= 360) {
                saida = "De Madrugada!!";
                if (graus < 90 || graus == 360) saida = "Bom Dia!!";
                else if (graus >= 90 && graus < 180) saida = "Boa Tarde!!";
                else if (graus >= 180 && graus < 270) saida = "Boa Noite!!";

                System.out.println(saida);

                Double horas;
                if (graus >= 270) {
                    horas = ((240 * graus) / 3600) - 18;
                } else {                                   //Complete o código nos espaços em branco
                    horas = ((240 * graus) / 3600) + 6;
                }

                Double minutos = ((240 * graus) % 3600) / 60;
                Double segundos = (240 * graus) % 60.0;

                if (segundos > 59) {
                    segundos = 0.0;
                    minutos += 1.0;
                }

                System.out.printf("%02d:%02d:%02d%n", horas.intValue(), minutos.intValue(), segundos.intValue());
            }
        }
    }

}