package main.java.list_set_map.pesquisaEmSet.agendaContatos;

import java.util.Objects;

public class Contato {
    private String nome;
    private int telefone;

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }

    // Sobrescrevendo os métodos equals e hashcode, pois, na regra de negócio, os elementos dessa lista irão se
    // diferecia pelo n° de telefone. o contato só será igual a outro se o n° de telef for igual:


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return telefone == contato.telefone;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(telefone);
    }
}
