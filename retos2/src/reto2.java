import java.util.Scanner;

public class reto2 {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de competidores: ");
        int cantidadCompetidores = lectura.nextInt();

        String[] nombres = new String[cantidadCompetidores];
        double[] tiempos = new double[cantidadCompetidores];

        for (int i = 0; i < cantidadCompetidores; i++) {
            System.out.print("Ingrese el nombre del competidor " + (i+1) + ": ");
            nombres[i] = lectura.next();
            System.out.print("Ingrese el tiempo que tuvo en la competición (en segundos) del competidor " + nombres[i] + ": ");
            tiempos[i] = lectura.nextDouble();
        }

        int indiceGanador = 0;
        double tiempoGanador = tiempos[0];

        for (int i = 1; i < cantidadCompetidores; i++) {
            if (tiempos[i] < tiempoGanador) {
                tiempoGanador = tiempos[i];
                indiceGanador = i;
            }
        }
        lectura.close();
        System.out.println("El ganador de la competición es " + nombres[indiceGanador] + " con un tiempo de " + tiempoGanador + " segundos.");
    }


}