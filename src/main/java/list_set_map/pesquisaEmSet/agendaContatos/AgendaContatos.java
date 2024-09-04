package main.java.list_set_map.pesquisaEmSet.agendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> colecaoDeContatos;

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Pedro", 78991);
        agendaContatos.adicionarContato("Pedro Lucas", 98233);
        agendaContatos.adicionarContato("Sarah", 81520);
        agendaContatos.adicionarContato("Pedro", 51520);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarContatoPorNome("Pedro"));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroPeloContato("Sarah",81520, 98879));

        agendaContatos.exibirContatos();

    }

    public AgendaContatos() {
        this.colecaoDeContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone){
        colecaoDeContatos.add(new Contato(nome, telefone));
    }

    public void exibirContatos(){
        System.out.println(colecaoDeContatos);
    }

    public Set<Contato> pesquisarContatoPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato c : colecaoDeContatos){
            if (c.getNome().startsWith(nome)){
                // o método startsWith da class String verifica, nesse caso, se
                // o nome do objeto atual da Set começa com o nome passado por parâmetro
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroPeloContato(String nome, int telefone, int novoTelefone){
        Contato contatoAtualizado = null;

        for (Contato c : colecaoDeContatos){
            if (c.getNome().equalsIgnoreCase(nome) && c.getTelefone() == telefone){
                c.setTelefone(novoTelefone);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

}
