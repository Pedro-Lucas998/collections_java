package main.java.list_set_map.pesquisaEmMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(224L, "oleo", 3, 4.0);
        estoqueProdutos.adicionarProduto(144L, "Refrigerante", 2, 6.0);
        estoqueProdutos.adicionarProduto(137L, "arroz", 5, 8.0);

        estoqueProdutos.exibirProdutos();

        System.out.println(estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());

        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());


    }

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto produto : estoqueProdutosMap.values()){
                valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto produto : estoqueProdutosMap.values()){
                if (produto.getPreco() > maiorValor){
                    produtoMaisCaro = produto;
                    maiorValor = produto.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorValor = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto produto : estoqueProdutosMap.values()){
                if (produto.getPreco() < menorValor){
                    produtoMaisBarato = produto;
                    menorValor = produto.getPreco();
                }

            }
        }
        return produtoMaisBarato;
    }




}
