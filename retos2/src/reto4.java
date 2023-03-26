import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {
        String[] productos = new String[16]; // arreglo para guardar los nombres de los productos
        double[] precios = new double[16]; // arreglo para guardar los precios de los productos

        
        Scanner lectura = new Scanner(System.in);
        
        // Llenar la máquina con 16 nombres de productos y su respectivo precio
        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingresa el nombre del producto #" + (i + 1) + ": ");
            productos[i] = lectura.nextLine();
            
            System.out.print("Ingresa el precio del producto #" + (i + 1) + ": ");
            precios[i] = lectura.nextDouble();
            
            lectura.nextLine(); 
        }
        
        // Mostrar el catálogo de productos con el código del producto (posición), nombre y precio de cada producto ingresado
        System.out.println("\nCatálogo de productos:");
        System.out.println("código   nombre   precio");
        
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i+1)+"\t"+ productos[i]+"\t"+ precios[i]+"\t");
        }System.out.println();

       
lectura.close();

}
}