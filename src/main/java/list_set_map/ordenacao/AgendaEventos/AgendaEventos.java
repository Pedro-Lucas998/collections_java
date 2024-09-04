package main.java.list_set_map.ordenacao.AgendaEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> colecaoDeEventos;

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 19), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2008, 3, 7), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.SEPTEMBER, 30), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }

    public AgendaEventos() {
        this.colecaoDeEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        //Evento evento = new Evento(nome, atracao);
        colecaoDeEventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosPorData = new TreeMap<>(colecaoDeEventos);
        System.out.println(eventosPorData);
    }

    public void obterProximoEvento(){
        //Set<LocalDate> dateSet colecaoDeEventos.keySet(); // O método KeySet retorna um Set com todas as keys
        //Collections<Evento> values = colecaoDeEventos.values(); // retorna uma coleção com todos os valores
        // Não há uma releção entre esses valores dos métodos, são independetes

        //colecaoDeEventos.get(); recebe a chave e retorna o seu respectivo valor(Evento), mas n sabemos qual o próximo evento
        // O método entrySet retorna um set de objetos de tipo Map.Entry que sabe apontar a chave o valor correspondente, que nesse
        // caso estão interligadas
        // No lugar de Map.Entry<LocalDate, Evento> você poderia usar var, que não precisa dizer o tipo

        LocalDate dataAtual = LocalDate.now(); // retorna a data atual
        Map<LocalDate, Evento> eventosPorData = new TreeMap<>(colecaoDeEventos);
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        for (Map.Entry<LocalDate, Evento> entry : eventosPorData.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento é: " + proximoEvento + " Acontecerá na data: " + proximaData);
                break;
            }
        }
    }
}
