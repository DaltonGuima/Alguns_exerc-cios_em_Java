package Ex7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int voto = 1;
        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votos4 = 0;
        int votosNulo = 0;
        int votosBrancos = 0;

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

            voto = leitura.nextInt();

            switch (voto) {
                case 1:
                    votos1++;
                    break;
                case 2:
                    votos2++;
                    break;
                case 3:
                    votos3++;
                    break;
                case 4:
                    votos4++;
                    break;
                case 5:
                    votosNulo++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
            }

        } while (voto != 0);

        System.out.println("= Resultado =" +
                "\nVotos Felipão da Massa: " + votos1 +
                "\nVotos para Carioca Perdido: " + votos2 +
                "\nVotos para Bandido Ficha Limpa: " + votos3 +
                "\nVotos para Policial Racista: " + votos4 +
                "\nVotos nulo: " + votosNulo +
                "\nVotos em branco: " + votosBrancos
        );
    }
}
