package Ex8;

import java.util.Scanner;

class Pessoa{
    private String sexo, corOlhos,corCabelos;
    private int idade;

    public Pessoa() {

    }

    public String getSexo() {
        return sexo;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public String getCorCabelos() {
        return corCabelos;
    }

    public int getIdade() {
        return idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public void setCorCabelos(String corCabelos) {
        this.corCabelos = corCabelos;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

public class Main {
    public static void main(String[] args) {
        int contador = 0;

        Pessoa[] pessoas = new Pessoa[500];
        Scanner leitura = new Scanner(System.in);


        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();

            System.out.println("Informe o sexo da pessoa: M (masculino) e F (feminino)");
            pessoas[i].setSexo(leitura.next());

            System.out.println("Informe a cor dos olhos: A (azuis), V (verdes) e C (castanhos)");
            pessoas[i].setCorOlhos(leitura.next());

            System.out.println("Informe a cor dos cabelos: L (louros), C (castanhos) e P (pretos)");
            pessoas[i].setCorCabelos(leitura.next());

            System.out.println("Informe a idade");
            pessoas[i].setIdade(leitura.nextInt());
        }

        int max = pessoas[0].getIdade();

        for (int i = 1; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() > max){
                max = pessoas[i].getIdade();
            }
        }

        for (int i = 0; i < pessoas.length; i++) {
            if (
                    pessoas[i].getSexo().equals("F")
                    && pessoas[i].getIdade() >= 18 && pessoas[i].getIdade() <= 35
                    && pessoas[i].getCorOlhos().equals("V")
                    && pessoas[i].getCorCabelos().equals("L")
            )
                contador++;
        }

        System.out.println("A maior Idade: " + max +
                "\na quantidade de indivíduos do sexo feminino, " +
                "cuja idade está entre 18 e 35 anos e que tenham " +
                "olhos verdes e cabelos louros: " + contador
        );




    }
}