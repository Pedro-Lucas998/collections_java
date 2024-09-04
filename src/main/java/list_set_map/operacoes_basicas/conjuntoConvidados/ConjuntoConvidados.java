package main.java.list_set_map.operacoes_basicas.conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> setDeConvidados;

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Há " + conjuntoConvidados.contarConvidados() + "convidados dentro da set de convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1256);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 4153);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1256);

        System.out.println("Há " + conjuntoConvidados.contarConvidados() + "convidados dentro da set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1256);
        System.out.println("Há " + conjuntoConvidados.contarConvidados() + "convidados dentro da set de convidados");

        conjuntoConvidados.exibirConvidados();
    }

    public ConjuntoConvidados() {
        this.setDeConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int convite){
        setDeConvidados.add(new Convidado(nome, convite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidado = null;
        for (Convidado c : setDeConvidados){
            if (c.getCodigoConvite() == codigoConvite){
                convidado = c;
                break;
            } else{
                throw new RuntimeException(
                        "Este convidado não existe. informe um código de convidado válido"
                );
            }
        }
        setDeConvidados.remove(convidado);
    }

    public int contarConvidados(){
        return setDeConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(setDeConvidados);
    }
}
