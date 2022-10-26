package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int valor = 0;
        String continuar = "s";
        System.out.println(continuar);

        for (int i = 0; i > -1; i++) {
            float media;
            if (continuar.equals("s")) {
                System.out.println("Digite um valor");
                valor += leitura.nextInt();

                System.out.println("Deseja continuar? digite S ou N");
                continuar = leitura.next();
            } else {
                media = valor/i;
                System.out.println("A média é: " + media);
                break;
            }
        }
    }
}
