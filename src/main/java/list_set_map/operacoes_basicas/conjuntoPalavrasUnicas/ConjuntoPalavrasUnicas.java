package main.java.list_set_map.operacoes_basicas.conjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoDePalavras;

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Café");
        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("Café");
        conjuntoPalavrasUnicas.adicionarPalavra("Estudar");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Java");
        conjuntoPalavrasUnicas.removerPalavra("Estudar");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }

    public ConjuntoPalavrasUnicas() {
        this.conjuntoDePalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoDePalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        for (String p : conjuntoDePalavras){
            if (p.equalsIgnoreCase(palavra)){
                conjuntoDePalavras.remove(p);
                break;
            }
        }
    }

    public void verificarPalavra(String palavra){
        for (String p : conjuntoDePalavras){
            if (p.equalsIgnoreCase(palavra)){
                System.out.println("A palavra " + palavra + " está presente na coleção set.");
                break;
            } else{
                System.out.println("A palavra " + palavra + " não está presente na coleção set.");
            }
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoDePalavras);
    }


    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "conjuntoDePalavras=" + conjuntoDePalavras +
                '}';
    }
    // formata o ToStrig para não aparecer o endereço de memória dos itens da Set.

}
