package prototipado;

import java.util.concurrent.TimeUnit;

public class AlgBinary2 {
    public static void main(String[] args) {

        // Algoritmo de busqueda Binaria
        System.out.println("BINARY SEARCH");
        long startTime = System.nanoTime();
        // Creacion del array de 200 posiciones
        int values[] = new int[200];

        // Creacion del array mediante el metodo random, genera valores de 1 a 200
        for (int i = 0; i < 20; i++) {
            int n1 = (int) Math.floor(Math.random() * (1 - 200 + 1) + 200);
            // Asignar los valores generados en el random en la posicion respectiva
            values[i] = n1;
        }

        int index = -1;
        for (int j = 0; j < values.length; j++) {
            // El numero 10 es el valor que queremos encontrar en el array
            if (values[j] == 10) {
                index = j;

            }

        }
        if (index == -1) {
            System.out.println("El valor a buscar no existe en el array.");
        } else {
            // Imprime el indice del array donde encuentra el valor 10
            System.out.println(index);
        }
        long endTime = System.nanoTime();
        System.out.println("time"+TimeUnit.NANOSECONDS.toMillis(endTime - startTime));


    }

}