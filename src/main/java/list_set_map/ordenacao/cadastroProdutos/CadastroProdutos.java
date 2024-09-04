package main.java.list_set_map.ordenacao.cadastroProdutos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarNovoProduto(1, "produto 5", 15d, 5);
        cadastroProdutos.adicionarNovoProduto(12, "produto 3", 10d, 10);

        System.out.println( cadastroProdutos.exibirProdutosPorNome());
        System.out.println( cadastroProdutos.exibirProdutosPorPreco());
    }

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarNovoProduto(int codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        // não pode ser do tipo HashSet, pois o HashSet não permite organiza os seus elementos, o treeSet sabe organizar
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>( new CompartorOrdenarPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
}
