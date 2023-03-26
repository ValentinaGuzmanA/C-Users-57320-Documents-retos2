import java.util.Scanner;

public class reto1 {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a verificar: ");
        int cantidadNumeros = lectura.nextInt();

        int[] numeros = new int[cantidadNumeros]; // Creamos un arreglo de tamaño cantidadNumeros

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = lectura.nextInt();
        }

        boolean hayMultiplosDeDos = false;

        for (int i = 0; i < cantidadNumeros; i++) {
            if (numeros[i] % 2 == 0) {
                hayMultiplosDeDos = true;
                System.out.println("Numero Encontrado:"); 
                System.out.println("El número " + numeros[i] + " es múltiplo de 2."); // Imprimimos el múltiplo de 2
            }
        }

        if (!hayMultiplosDeDos) {
            System.out.println("No se encontraron números múltiplos de 2.");
        }

        lectura.close();
    }
}