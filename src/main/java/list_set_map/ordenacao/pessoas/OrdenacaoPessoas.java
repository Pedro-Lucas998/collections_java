package main.java.list_set_map.ordenacao.pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listDePessoas;

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 35, 1.70);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 50, 1.78);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 20, 1.90);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

    }

    public OrdenacaoPessoas() {
        this.listDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listDePessoas); // list de pessoas ordenadas que se inicia
        // com os elementos da List listDePessoas

        Collections.sort(pessoasPorIdade); // ordena a list por idade através do Comparable da class Pessoa
        return pessoasPorIdade;

    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listDePessoas);
        Collections.sort(pessoasPorAltura, new CompartorPorAltura()); // quando ordenamos pelo Compare, temos que passar a list que queremos ordenar
        // e o compare(comparador) que criamos. Senão ele ordena pelo comparable.

        return pessoasPorAltura;
    }


}
