package Ex6;

import java.util.Scanner;

class Cliente {
    private String nome;
    private float valorCompra;

    public String getNome() {
        return nome;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public Cliente(String nome, float valorCompra) {
        this.nome = nome;
        this.valorCompra = valorCompra;
    }

    public float bonus(){
        if (valorCompra < 500) {
            return valorCompra * 0.1f;
        }
        else {
            return valorCompra * 0.15f;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        String nomeCliente;
        float valorCompraCliente;

        Cliente[] clientes = new Cliente[150];
        Scanner leitura = new Scanner(System.in);

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Informe o nome do Cliente: ");
            nomeCliente = leitura.next();
            System.out.println("Valor de compra do ano passado: ");
            valorCompraCliente = leitura.nextFloat();

            clientes[i] = new Cliente(nomeCliente,valorCompraCliente);
        }

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("\nCliente: " + clientes[i].getNome() +
                    "\n\nValor de Compras: R$" + clientes[i].getValorCompra() +
                    "\nValor do Bônus: R$" + clientes[i].bonus());
        }

    }
}
