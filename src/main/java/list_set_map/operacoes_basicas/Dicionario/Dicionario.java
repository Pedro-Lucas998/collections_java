package main.java.list_set_map.operacoes_basicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> conjuntoDePalavras;

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Tristeza", "Ausência de felicidade");
        dicionario.adicionarPalavra("Alegria", "Ausência de Tristeza");
        dicionario.adicionarPalavra("Verbo", "Expressa ação");
        dicionario.adicionarPalavra("Adjetivo", "Expressa qualidade");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisaPorPalavra("Alegria"));

        dicionario.removerPalavra("Tristeza");

        dicionario.exibirPalavras();
    }

    public Dicionario() {
        this.conjuntoDePalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        conjuntoDePalavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!conjuntoDePalavras.isEmpty()){
            conjuntoDePalavras.remove(palavra);
        } else{
            throw new RuntimeException("O dicionário está vazio.");
        }
    }

    public void exibirPalavras(){
        System.out.println(conjuntoDePalavras);
    }

    public String pesquisaPorPalavra(String palavra){
        String definicaoPorPalavra = null;
        if (!conjuntoDePalavras.isEmpty()){
            definicaoPorPalavra = conjuntoDePalavras.get(palavra);
        } else{
            throw new RuntimeException("Não há esta palavra no dicionário.");
        }
        return definicaoPorPalavra;
    }

}
