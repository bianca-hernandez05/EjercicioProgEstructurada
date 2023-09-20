import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] valorArticulo = { 239.99, 129.75, 99.95, 350.89 };
        byte intentoMaximo = 3, intentos = 1; 

        System.out.println("Ingrese los artículos vendidos por el vendedor (1 al 4) y sus cantidades:");
        double totalVenta = 0;

        while (true) {
            System.out.print("Artículo (1 al 4, 0 para finalizar): ");
            int articulo = scanner.nextInt();

            if (articulo == 0) {
                break;
            }

            if (articulo < 1 || articulo > 4) {
                System.out.println("Artículo inválido. Ingrese un numero en el rango correspondiente.");
                continue;
            }

            System.out.print("Total vendido: ");
            int cantidad = scanner.nextInt();

            if (cantidad < 0) {
                System.out.println("Cantidad inválida. No introducir numeros negativos .");
                continue;
            }

            totalVenta += valorArticulo[articulo - 1] * cantidad;
        }

        double salarioBase = 200.0;
        double comision = 0.09 * totalVenta;
        double ingresoTotal = salarioBase + comision;
        
        if(intentos <3){

            System.out.println("Intentelo nuevamente : ");
            System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
        }
      intentos++;
      
      if(intentos == intentoMaximo){
        
      System.out.println("No le quedan mas intentos ");
      }
        System.out.printf("Ingresos del vendedor: C$%.2f%n", ingresoTotal);

        scanner.close();
    }
}