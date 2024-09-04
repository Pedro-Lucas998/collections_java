package main.java.list_set_map.ordenacao.numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    private List<Integer> listDeInteiros;

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(30);

        ordenacaoNumeros.exibirNumeros();
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }

    public OrdenacaoNumeros() {
        this.listDeInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int num){
        listDeInteiros.add(num);
    }

    public List<Integer> ordenarAscendente(){
        if (!listDeInteiros.isEmpty()){
            Collections.sort(listDeInteiros);
        } else{
            throw new RuntimeException("A list está vazia!");
        }
        return listDeInteiros;
    }

    public List<Integer> ordenarDescendente(){
        if (!listDeInteiros.isEmpty()){
            Collections.reverse(listDeInteiros);
        } else {
            throw new RuntimeException("A list está vazia!");
        }
        return listDeInteiros;
    }

    public void exibirNumeros(){
        if (!listDeInteiros.isEmpty()){
            System.out.println(this.listDeInteiros);
        } else {
            throw new RuntimeException("A list está vazia!");
        }
    }

}
