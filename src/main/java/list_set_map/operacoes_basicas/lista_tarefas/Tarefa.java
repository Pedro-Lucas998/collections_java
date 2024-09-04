package main.java.list_set_map.operacoes_basicas.lista_tarefas;

public class Tarefa {
    // Class que representa o elemento que vai está dentro da ListaTarefas


    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    // alt + insert + ToString -> override do método toString com uma template formatada
    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
    // Se quiser mostrar somente a descrição das tarefas, apague o resto.
}
