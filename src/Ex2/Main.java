package Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String continuar = "s";
        float media;
        int i = 0, somaValores = 0;

        Scanner leitura = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();
        do {
            System.out.println("Digite um valor");
            valores.add(leitura.nextInt());
            i++;
            System.out.println("Deseja continuar? digite S ou N");
            continuar = leitura.next();
        } while (continuar.equals("s"));

        for (int j : valores){
            somaValores += j;
        }

        int max = valores.get(0);
        media = somaValores/i;

        for (int j = 1; j < valores.size(); j++) {
            if (valores.get(j) > max) {
                max = valores.get(j);
            }
        }

        System.out.println("A média é: " + media + " Valor máximo: " + max);
    }
}
