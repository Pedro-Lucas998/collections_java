package main.java.list_set_map.pesquis.soma_de_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<NumeroInteiro> listaDeNumeros = new ArrayList<>();

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(5);

        System.out.println( somaNumeros.exibirNumeros());
        System.out.println( "O resultado da soma dos números é: " + somaNumeros.calcularSoma());
        System.out.println( "O maior número da lista é " + somaNumeros.encontrarMaiorNumero());
        System.out.println( "O menor número da lista é " + somaNumeros.encontrarMenorNumero());



    }

    public SomaNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaDeNumeros.add(new NumeroInteiro(numero));
    }

    public int calcularSoma(){
        int somaTotal = 0;
        if (!listaDeNumeros.isEmpty()){
            for (NumeroInteiro numero : listaDeNumeros){
                somaTotal += numero.getNumero();
            }
        }
        return somaTotal;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if (!listaDeNumeros.isEmpty()){
            for (NumeroInteiro numero : listaDeNumeros){
                if (maiorNumero > numero.getNumero()){
                    maiorNumero = maiorNumero;
                } else{
                    maiorNumero = numero.getNumero();
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 0;
        if (!listaDeNumeros.isEmpty()){
            for (NumeroInteiro numero : listaDeNumeros){

                if ((menorNumero < numero.getNumero()) && (listaDeNumeros.contains(menorNumero))){
                    menorNumero = menorNumero;
                }
                else{
                    menorNumero = numero.getNumero();
                }

            }
        }
        return menorNumero;
    }

    public List<NumeroInteiro> exibirNumeros(){
        return listaDeNumeros;
    }

}
