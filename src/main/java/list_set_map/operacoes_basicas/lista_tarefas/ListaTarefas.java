package main.java.list_set_map.operacoes_basicas.lista_tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    // atributo
    private List<Tarefa> listDeTarefas;

    public ListaTarefas() {
        this.listDeTarefas = new ArrayList<>();
        // Sempre que criar um objeto do tipo ListaTarefas tem um atributo tarefaList  com uma
        // arrayList vazia esperando.
    }

    // Adiciona uma tarefa na List
    public void adicionarTarefa(String descricao){
        listDeTarefas.add(new Tarefa(descricao));
    }

    // Remove um elemento da list de tarefas a partir de sua descrição; podendo remover
    // outro elemento similar a este.
    public void removerTarefa(String descricao){
        // Como em uma lista pode ter dois elementos repetidos com mesma descrição
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefa : listDeTarefas){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        listDeTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listDeTarefas.size();
    }

    // Imprime a lista de tarefas
    public void obterDescricoesTarefas(){
        System.out.println(listDeTarefas);
    }

    // Para testar, seria bom criar testes unitários, com J-unity, por exemplo.
    public static void main(String[] args) {
        // Testando os métodos:
        ListaTarefas listaTarefas = new ListaTarefas(); // sempre que cria um objeto do tipo ListaTarefas
        // instancia uma ArrayList vazio
        System.out.println("O número total de elementos na lista é " +  listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é " +  listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é " +  listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
