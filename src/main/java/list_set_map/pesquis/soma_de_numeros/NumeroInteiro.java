package main.java.list_set_map.pesquis.soma_de_numeros;

public class NumeroInteiro {
    private int numero;

    public NumeroInteiro(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "NumeroInteiro{" +
                "numero=" + numero +
                '}';
    }
}
