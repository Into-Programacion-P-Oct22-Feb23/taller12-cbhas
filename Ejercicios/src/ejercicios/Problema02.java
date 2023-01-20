package ejercicios;

public class Problema02 {

    public static void main(String[] args) {

        double[] datos = {100, 90, 80, 70, 60};
        double[] datos2 = {200, 190, 180, 170, 160};
        double[] datos3 = new double[5];

        for (int i = 0; i < datos.length; i++) {
            datos3[i] = obtenerSuma(datos[i], datos2[i]);
            System.out.printf("La suma del arreglo en la posición "
                    + "[%d]: %.0f\n",
                    i,
                    datos3[i]);

        }
    }

    public static double obtenerSuma(double a, double b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }
    }
}
