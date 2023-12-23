package ecommerce.model;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        this.itens.add(produto);
        System.out.println(produto.getNome() + " adicionado ao carrinho.");
    }

    public void exibirCarrinho() {
        System.out.println("Conteúdo do Carrinho:");
        for (Produto produto : itens) {
            System.out.println(produto);
        }
        System.out.println();
    }

    public void finalizarCompra() {
        double total = calcularTotal();
        System.out.println("Total da compra: R$" + total);
        System.out.println("Compra finalizada. Obrigado por escolher a Vic's Acessórios!");
    }

    private double calcularTotal() {
        double total = 0.0;
        for (Produto produto : itens) {
            total += produto.getPreco();
        }
        return total;
    }
}