package main.java.list_set_map.ordenacao.livrariaOnline;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    private Map<String, Livro> conjuntoDeLivros;

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("Link1", "Titulo 1", "Autor 1", 35d);
        livrariaOnline.adicionarLivro("Link2", "Titulo 2", "Autor 2", 20d);
        livrariaOnline.adicionarLivro("Link2", "Titulo 3", "Autor 2", 30d);
        livrariaOnline.adicionarLivro("Link3", "Titulo 4", "Autor 3", 48d);
        livrariaOnline.adicionarLivro("Link4", "Titulo 5", "Autor 4", 39d);

        livrariaOnline.exibirLivros();

        System.out.println(livrariaOnline.obterLivroMaisCaro());

        System.out.println(livrariaOnline.obterLivroMaisBarato());

        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("Autor 2"));
    }

    public LivrariaOnline() {
        this.conjuntoDeLivros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        conjuntoDeLivros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        if (!conjuntoDeLivros.isEmpty()){
            for (Livro livro : conjuntoDeLivros.values()){
                if (livro.getTitulo().equalsIgnoreCase(titulo)){
                    conjuntoDeLivros.remove(livro);
                }
            }
        } else{
            throw new RuntimeException("O livro informado não existe na coleção.");
        }
    }

    public void exibirLivros(){

        System.out.println(conjuntoDeLivros);
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosPorAutor = new HashMap<>();

        if (!conjuntoDeLivros.isEmpty()){
            for (Livro livro : conjuntoDeLivros.values()){
                if (livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.put(livro.getAutor(), livro);
                }
            }
        } else{
            throw new RuntimeException("Não há livros deste autor");
        }
        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro(){
        Livro livroMaisCaro = null;
        double precoLivroMaisCaro = Double.MIN_VALUE;

        if (!conjuntoDeLivros.isEmpty()){
            for (Livro livro : conjuntoDeLivros.values()){
                if (livro.getPreco() > precoLivroMaisCaro){
                    livroMaisCaro = livro;
                    precoLivroMaisCaro = livro.getPreco();
                }
            }
        }
        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato(){
        Livro livroMaisBarato = null;
        double precoLivroMaisBarato= Double.MAX_VALUE;

        if (!conjuntoDeLivros.isEmpty()){
            for (Livro livro : conjuntoDeLivros.values()){
                if (livro.getPreco() < precoLivroMaisBarato){
                    livroMaisBarato = livro;
                    precoLivroMaisBarato = livro.getPreco();
                }
            }
        }
        return livroMaisBarato;
    }
}
