package binaryS;

import java.util.concurrent.TimeUnit;

public class AlgBinary3 {
    public static void main(String[] args) {
        long startTime =  System.nanoTime();
        // Algoritmo de busqueda Binaria
        System.out.println("\t\t\tBINARY SEARCH");

        int values[] = new int[200];
        for (int i = 0; i < values.length; i++) {
            values[i] = i;
        }
        int index = -1;
        for (int j = 0; j < values.length; j++) {
            // El numero 10 es el valor que queremos encontrar en el array
            if (values[j] == 10) {
                index = j;

            }

        }
        System.out.println("El numero que busca se encuentra en el indice: " +index +" del array");
        long endTime = System.nanoTime();
        System.out.println(TimeUnit.NANOSECONDS.toMillis(endTime - startTime));
    }

}
