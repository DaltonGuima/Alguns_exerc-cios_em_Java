package Ex7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] votos = new int[7];

        Scanner leitura = new Scanner(System.in);

        do {

            System.out.println("= Eleiçao =" +
                    "\nVote 1 para Felipão da Massa" +
                    "\nVote 2 para Carioca Perdido" +
                    "\nVote 3 para Bandido Ficha Limpa" +
                    "\nVote 4 para Policial Racista" +
                    "\nVote 5 para anular o voto" +
                    "\nVote 6 para voto em branco"
            );

            votos[leitura.nextInt()]++;


        } while (votos[0] == 0);

        System.out.println("= Resultado =" +
                "\nVotos Felipão da Massa: " + votos[1] +
                "\nVotos para Carioca Perdido: " + votos[2] +
                "\nVotos para Bandido Ficha Limpa: " + votos[3] +
                "\nVotos para Policial Racista: " + votos[4] +
                "\nVotos nulo: " + votos[5] +
                "\nVotos em branco: " + votos[6]
        );
    }
}
