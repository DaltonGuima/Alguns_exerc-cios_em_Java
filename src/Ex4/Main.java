package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String continuar = "s", sexo;
        float altura, media, somaAltura = 0;
        int qtdHomens = 0, qtdMulheres = 0;

        Scanner leitura = new Scanner(System.in);

        do {
            System.out.println("Digite o sexo da pessoa. (M para mulheres e H para homens)");
            sexo = leitura.next();
            System.out.println("A altura da pessoa");
            altura = leitura.nextFloat();

            if (sexo.equals("H")){
                qtdHomens++;
            }
            if (sexo.equals("M")){
                somaAltura += altura;
                qtdMulheres++;
            }

            System.out.println("Deseja continuar? digite S ou N");
            continuar = leitura.next();

        } while (continuar.equals("s"));

        media = somaAltura/qtdMulheres;

        System.out.println("Estatura média das mulheres: " + media + ", Quantidade de homens: " + qtdHomens);
    }
}
