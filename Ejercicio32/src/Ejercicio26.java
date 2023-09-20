import java.util.Scanner;
import java.util.Random;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random rd = new Random();
        byte intentoMaximo = 3, intentos = 1;

        System.out.println("Hola ,Soy Eliza , Estoy aca para ti , si deseas terminar la sesion ingresa Adios : ");

        while (true) {
            System.out.print("Tú: ");
            String entrada = lector.nextLine();

            if (entrada.equalsIgnoreCase("Adiós")) {
                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
              }
              intentos++;
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }
    
                System.out.println("Eliza: Adiós. ¡Espero que tengas un buen día, Cuidate y recuerda No todos los dias Son malos !: ");
                break;
            }

            String respuesta = generarRespuesta(entrada);
            
            if(intentos <3){

                System.out.println("Intentelo nuevamente : ");
                System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
          }
          intentos++;
          if(intentos == intentoMaximo){
            
          System.out.println("No le quedan mas intentos ");
          }

            System.out.println("Eliza: " + respuesta);
        }

        lector.close();
    }

    public static String generarRespuesta(String entrada) {
        if (entrada.toLowerCase().contains("mi")) {
            String[] palabras = entrada.split(" ");
            for (int i = 0; i < palabras.length; i++) {
                if (palabras[i].equalsIgnoreCase("mi") && i < palabras.length - 1) {
                    palabras[i] = "su";
                }
            }
            return "Cuénteme más sobre " + String.join(" ", palabras);
        } else if (entrada.toLowerCase().contains("amor") || entrada.toLowerCase().contains("odio")) {
            return "Parece que tiene fuertes sentimientos al respecto.";
        } else {
            String[] respuestasAleatorias = {"Continúe", "cuentema más", "Prosiga"};
            int indiceAleatorio = new Random().nextInt(respuestasAleatorias.length);
            return respuestasAleatorias[indiceAleatorio];
        }
    }
}