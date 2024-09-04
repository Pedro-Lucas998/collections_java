package main.java.list_set_map.operacoes_basicas.agendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaDeContatos;

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Pedro", 9887216);
        agendaContatos.adicionarContato("Cláudio", 8726449);
        agendaContatos.adicionarContato("Cláudio", 2726445);
        agendaContatos.adicionarContato("Emilly", 6827701);

        agendaContatos.exibirContatos();

        System.out.println( agendaContatos.pesquisarContatoPorNome("Cláudio"));

        agendaContatos.removerContato("Emilly");

        agendaContatos.exibirContatos();
    }

    public AgendaContatos() {
        this.agendaDeContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaDeContatos.put(nome, telefone);
    }

    public void removerContato(String nome){

        if (!agendaDeContatos.isEmpty()){
            agendaDeContatos.remove(nome);
        } else{
            throw new RuntimeException("A agenda de contatos está vazia.");
        }

    }

    public void exibirContatos(){
        System.out.println(agendaDeContatos);
    }

    public Integer pesquisarContatoPorNome(String nome){
        Integer contatoPorNome = null;

        if (!agendaDeContatos.isEmpty()){
            contatoPorNome = agendaDeContatos.get(nome);
        } else{
            throw new RuntimeException("A agenda de contatos está vazia.");
        }
        return contatoPorNome;
    }
}
