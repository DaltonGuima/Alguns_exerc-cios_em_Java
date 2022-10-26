package Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String continuar = "s";
        int positivos = 0, negativos = 0;

        Scanner leitura = new Scanner(System.in);
        ArrayList<Float> valores = new ArrayList<>();

        do {

            System.out.println("Digite um valor");
            valores.add(leitura.nextFloat());
            System.out.println("Deseja continuar? digite S ou N");
            continuar = leitura.next();

        } while (continuar.equals("s"));

        float min = valores.get(0);

        for (int j = 1; j < valores.size(); j++) {
            if (valores.get(j) < min) {
                min = valores.get(j);
            }
        }

        for (float j : valores){
            if (j >= 0)
                positivos++;
            else
                negativos++;
        }

        System.out.println("Números Positivos: " + positivos +
                "\nNúmeros Negativos: " + negativos +
                "\nValor Minímo: " + min
        );

    }
}
