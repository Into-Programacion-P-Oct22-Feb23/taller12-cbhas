package ejercicios;

public class Problema00 {

    public static void main(String[] args) {
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double[][] resultado = new double[4][2];

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                resultado[i][j] = factorial(datos[i][j]);

            }

        }

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("El factorial del arreglo en la posición "
                        + "[%d][%d]: %.0f\n",
                        i, 
                        j, 
                        resultado[i][j]);
            }
        }
    }

    public static double factorial(double numero) {
        if (numero <= 1) {

            return 1;
        } else {

            return numero * factorial(numero - 1);

        }
    }

}
