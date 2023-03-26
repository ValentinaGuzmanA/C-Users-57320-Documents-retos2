import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in); 

        int filas = 3; 
        int columnas =4; 

        

        String[][] matriz = new String[filas][columnas]; 


        for (int i = 0; i < filas; i++) { 

            for (int j = 0; j < columnas; j++) { 

                System.out.print("Introduce una  palabra en la posición [" + i + "][" + j + "]: "); 

                matriz[i][j] = lectura.next(); 

            } 

        } 

 

        // Mostrar la matriz en forma de tabla 

        System.out.println("Matriz:"); 

        for (int i = 0; i < filas; i++) { 

            for (int j = 0; j < columnas; j++) { 

                System.out.print(matriz[i][j] + "\t"); 

            } 

            System.out.println(); 

        } 

 

        // Comprobar si hay palabras repetidas en la matriz 

        for (int i = 0; i < filas; i++) { 

            for (int j = 0; j < columnas; j++) { 

                String palabraActual = matriz[i][j]; 

                for (int k = i; k < filas; k++) { 

                    for (int l = 0; l < columnas; l++) { 

                        if (k == i && l <= j) { 

                            continue; // saltar la posición actual 

                        } 

                        String palabraComparar = matriz[k][l]; 

                        if (palabraActual.equals(palabraComparar)) { 

                            System.out.println("La palabra '" + palabraActual + "' está repetida en las posiciones [" + i + "][" + j + "] y [" + k + "][" + l + "]"); 

                        } 

                    } 

                } 

            } 

        } 

 lectura.close();

    } 

 

} 