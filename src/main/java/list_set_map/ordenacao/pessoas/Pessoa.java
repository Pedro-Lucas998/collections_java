package main.java.list_set_map.ordenacao.pessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    // atributos:
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    @Override // método abstrato da interface Comparable
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.idade); // compara a idade com a idade do objeto passado no comparteTO
    }
}

class CompartorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
