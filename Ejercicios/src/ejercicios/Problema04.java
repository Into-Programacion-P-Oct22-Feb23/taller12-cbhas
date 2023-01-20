package ejercicios;

import org.apache.commons.lang3.math.NumberUtils;

public class Problema04 {

    public static void main(String[] args) {

        String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};
        int[] dataFinal = {100, 90, 0, 10, 0, 0};
        for (int i = 0; i < dataInicial.length; i++) {
            int numero = NumberUtils.toInt(dataInicial[i]);

            dataFinal[i] = numero;

            System.out.println(dataFinal[i]);

        }

    }

}
