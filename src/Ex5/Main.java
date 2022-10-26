package Ex5;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        String continuar = "s";
        int mediaNegativaCont = 0;
        float mediaSala, total = 0;

        Scanner leitura = new Scanner(System.in);
        ArrayList<Float> medias = new ArrayList<>();

        do {
            System.out.println("Digite uma média");
            medias.add(leitura.nextFloat());
            System.out.println("Deseja continuar? digite S ou N");
            continuar = leitura.next();

        } while (continuar.equals("s"));

        float min = medias.get(0);
        float max = medias.get(0);

        for (int i = 1; i < medias.size(); i++) {
            if (medias.get(i) < min) {
                min = medias.get(i);
            }
            if (medias.get(i) > max) {
                max = medias.get(i);
            }
        }

        for (int i = 0; i < medias.size(); i++) {
            total += medias.get(i);
            if (medias.get(i) < 6){
                mediaNegativaCont++;
            }
        }

        mediaSala = total/medias.size();

        System.out.println("A maior média: " + max +
                "\nA menor média: " + min +
                "\nMédia da turma: " + df.format(mediaSala) +
                "\nTotal de médias negativas: " + mediaNegativaCont
        );



    }
}
