package main.java.list_set_map.pesquisaEmSet.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> conjuntoTarefas;

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Fazer compras semanal");
        listaTarefas.adicionarTarefa("Pagar contas");
        listaTarefas.adicionarTarefa("Arrumar a casa");
        listaTarefas.adicionarTarefa("Assistir tv");

        listaTarefas.marcarTarefaConcluida("Fazer compras semanal");
        listaTarefas.marcarTarefaConcluida("Pagar contas");
        listaTarefas.exibirTarefas();

        System.out.println();

        listaTarefas.contarTarefas();
        listaTarefas.marcarTarefaPendente("Pagar contas");
        listaTarefas.exibirTarefas();

        System.out.println();

        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        System.out.println();

        listaTarefas.removerTarefa("Arrumar a casa");
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

        System.out.println();

        listaTarefas.removerTarefa("Assistir tv");

    }

    public ListaTarefas() {
        this.conjuntoTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        conjuntoTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){

        if (!conjuntoTarefas.isEmpty()){
            for (Tarefa t : conjuntoTarefas){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    conjuntoTarefas.remove(t);
                    break;
                }
            }
        } else{
            throw new RuntimeException("O conjunto de tarefas está vazio");
        }
    }

    public void exibirTarefas(){
        System.out.println(conjuntoTarefas);
    }

    public void contarTarefas(){
        System.out.println("Há " + conjuntoTarefas.size() + " tarefas no conjunto de tarefas.");
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!conjuntoTarefas.isEmpty()){
            for (Tarefa t : conjuntoTarefas){
                if (t.isTarefaConcluida() == true){
                    tarefasConcluidas.add(t);
                }
            }
        } else{
            throw new RuntimeException("O conjunto de tarefas está vazio");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!conjuntoTarefas.isEmpty()){
            for (Tarefa t : conjuntoTarefas){
                if (t.isTarefaConcluida() == false){
                    tarefasPendentes.add(t);
                }
            }
        } else{
            throw new RuntimeException("O conjunto de tarefas está vazio");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if (!conjuntoTarefas.isEmpty()){
            for (Tarefa tarefa : conjuntoTarefas){
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefa.setTarefaConcluida(true);
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        if (!conjuntoTarefas.isEmpty()){
            for (Tarefa tarefa : conjuntoTarefas){
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefa.setTarefaConcluida(false);
                }
            }
        }
    }

    public void limparListaTarefas(){
        conjuntoTarefas.clear();
    }
}
