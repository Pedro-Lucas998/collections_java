package main.java.list_set_map.ordenacao.listaDeAlunos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciarAlunos {
    Set<Aluno> conjuntoAlunos;

    public static void main(String[] args) {
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();
        gerenciarAlunos.exibirAlunos();

        System.out.println();

        gerenciarAlunos.adicionarAluno("Allan", 123456, 8.5);
        gerenciarAlunos.adicionarAluno("Andre", 874992, 7.0);
        gerenciarAlunos.adicionarAluno("Felipe", 123456, 6.9);
        gerenciarAlunos.adicionarAluno("Carlos", 917562, 10.0);

        gerenciarAlunos.exibirAlunos();

        System.out.println();

        gerenciarAlunos.exibirAlunosPorNota();
        gerenciarAlunos.exibirAlunosPorNome();

        gerenciarAlunos.removerAluno(874992);

        gerenciarAlunos.exibirAlunos();
    }

    public GerenciarAlunos() {
        this.conjuntoAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota){
        conjuntoAlunos.add(new Aluno(nome, matricula, nota));
    }
    
    public void removerAluno(long matricula){
        if (!conjuntoAlunos.isEmpty()){
            for (Aluno aluno : conjuntoAlunos){
                if (aluno.getMatricula() == matricula){
                    conjuntoAlunos.remove(aluno);
                    break;
                }
            }
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(conjuntoAlunos);

        if (!conjuntoAlunos.isEmpty()){
            System.out.println(alunosPorNome);
        } else{
            throw new RuntimeException("O conjunto de alunos está vazio.");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new OrdenarAlunosNota());
        alunosPorNota.addAll(conjuntoAlunos);
        System.out.println(alunosPorNota);
    }

    public void exibirAlunos(){
        System.out.println(conjuntoAlunos);
    }
}
