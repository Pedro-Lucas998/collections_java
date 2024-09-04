package main.java.list_set_map.operacoes_basicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> listaDeItens = new ArrayList<>();

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        //carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("Maçã", 1.0, 6  );
        carrinhoDeCompras.adicionarItem("Pão", 1.1, 8  );
        carrinhoDeCompras.adicionarItem("Queijo", 5.5, 4);
        carrinhoDeCompras.adicionarItem("Mortadela", 3.0, 3);
        carrinhoDeCompras.adicionarItem("Detergente", 2.75, 3);
        carrinhoDeCompras.adicionarItem("Detergente", 2.75, 5);
        //carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removeItem("Detergente");
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total de todos os items no carrinho é " + carrinhoDeCompras.calcularValorTotal());
        // formate a quantidade de casas decimais do valor total!
    }

    public CarrinhoDeCompras() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaDeItens.add(new Item(nome, preco, quantidade));
    }

    public void removeItem(String nome){
        List<Item> itemsRemovidos = new ArrayList<>();

        for (Item item : listaDeItens){
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemsRemovidos.add(item);
            }
        }

        listaDeItens.removeAll(itemsRemovidos);

    }

    public double calcularValorTotal(){
        double valorTotal = 0;
         for (Item item : listaDeItens){
            int quantidade = item.getQuantidade();
             while (quantidade > 0){
                 valorTotal+= item.getPreco() * item.getQuantidade();
                 quantidade--;
             }
         }
         return valorTotal;
    }

    public void exibirItens(){
        System.out.println(listaDeItens);
    }

}
