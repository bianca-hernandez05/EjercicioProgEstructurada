import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte intentos=1, intentoMaximo=3;

        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1. Triángulo rectángulo");
        System.out.println("2. Triángulo equilátero");
        System.out.println("3. Cuadrado");
        System.out.println("4. Rectángulo");
        System.out.println("5. Paralelogramo");
        System.out.println("6. Rombo");
        System.out.println("7. Círculo");
        System.out.println("8. Trapecio");
        System.out.println("9. Pentágono");
        System.out.println("10. Elipse");
        System.out.print("Ingrese el número de la figura deseada: ");
        int opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                dibujarTrianguloRectangulo();
                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
              }
              intentos++;
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }
                break;
            case 2:
                dibujarTrianguloEquilatero();
                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
              }
              intentos++;
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }
                break;
            case 3:
                dibujarCuadrado();
                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
              }
              intentos++;
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }
                break;
            case 4:
                dibujarRectangulo();
                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
              }
              intentos++;
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }
                break;
            case 5:
                dibujarParalelogramo();
                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
              }
              intentos++;
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }
                break;
            case 6:
                dibujarRombo();
                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
              }
              intentos++;
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }
                break;
            case 7:
                dibujarCirculo();
                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
              }
              intentos++;
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }
                break;
            case 8:
                dibujarTrapecio();
                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
              }
              intentos++;
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }
                break;
            case 9:
                dibujarPentagono();
                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
              }
              intentos++;
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }
                break;
            case 10:
                dibujarElipse();
                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
              }
              intentos++;
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }

    public static void dibujarTrianguloRectangulo() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la altura del triángulo rectángulo: ");
        int altura = lector.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j= 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        lector.close();
    }

    public static void dibujarTrianguloEquilatero() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la altura del triángulo equilátero: ");
        int altura = lector.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        lector.close();
    }
    

    public static void dibujarPentagono() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud de un lado del pentágono: ");
        int longitudLado = scanner.nextInt();
        
        int numLados = 5;

        for (int i = 1; i <= numLados; i++) {
            for (int j = 1; j <= longitudLado; j++) {
                System.out.print("* ");
            }
            scanner.close();
          }
            System.out.println();
          }

        public static void dibujarCuadrado() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el lado del cuadrado: ");
            int lado = scanner.nextInt();
    
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    System.out.print("* ");

              scanner.close();
                }
                System.out.println();
            }
        }
    
        public static void dibujarRectangulo() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el ancho del rectángulo: ");
            int ancho = scanner.nextInt();
            System.out.print("Ingrese la altura del rectángulo: ");
            int altura = scanner.nextInt();
    
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < ancho; j++) {
                    System.out.print("* ");

                scanner.close();
                }
                System.out.println();
            }
        }
    
        public static void dibujarParalelogramo() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la base del paralelogramo: ");
            int base = scanner.nextInt();
            System.out.print("Ingrese la altura del paralelogramo: ");
            int altura = scanner.nextInt();
    
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < base; j++) {
                    System.out.print("* ");

              scanner.close();
                }
                System.out.println();
            }
        }
    
        public static void dibujarRombo() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la mitad de la diagonal mayor del rombo: ");
            int mitadDiagonalMayor = scanner.nextInt();
    
            for (int i = 1; i <= mitadDiagonalMayor; i++) {
                for (int j = 1; j <= mitadDiagonalMayor - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }
    
            for (int i = mitadDiagonalMayor - 1; i >= 1; i--) {
                for (int j = 1; j <= mitadDiagonalMayor - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");

                    scanner.close();
                }
                System.out.println();
            }
        }
    
        public static void dibujarCirculo() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el radio del círculo: ");
            int radio = scanner.nextInt();
    
            for (int i = -radio; i <= radio; i++) {
                for (int j = -radio; j <= radio; j++) {
                    if (i * i + j * j <= radio * radio) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    scanner.close();
                }
                System.out.println();

            }
        }
    
        
        public static void dibujarTrapecio() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la base mayor del trapecio: ");
            int baseMayor = scanner.nextInt();
            System.out.print("Ingrese la base menor del trapecio: ");
            int baseMenor = scanner.nextInt();
            System.out.print("Ingrese la altura del trapecio: ");
            int altura = scanner.nextInt();
    
            int espacio = (baseMayor - baseMenor) / 2;
    
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= espacio; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= baseMenor; j++) {
                    System.out.print("*");
                }
                System.out.println();
                espacio--;
                baseMenor += 2; 

                scanner.close();    
            }

            System.out.println();
            }


        
    public static void dibujarElipse() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el semieje mayor de la elipse: ");
        int semiejeMayor = lector.nextInt();
        System.out.print("Ingrese el semieje menor de la elipse: ");
        int semiejeMenor = lector.nextInt();

        for (int i = -semiejeMenor; i <= semiejeMenor; i++) {
            for (int j = -semiejeMayor; j <= semiejeMayor; j++) {
                if (((double) i * i / (semiejeMenor * semiejeMenor) + (double) j * j / (semiejeMayor * semiejeMayor)) <= 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

           lector.close();
        }
    }
}
