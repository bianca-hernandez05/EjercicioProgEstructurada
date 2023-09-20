public class Ejercicio20 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long incremento = 1000000; 
        byte intentos = 1, intentoMaximo = 3;

        int contador = 0;
        while (contador < 300000000) {
            contador++;
            
            if (contador % incremento == 0) {
                long currentTime = System.currentTimeMillis();
                long elapsedTime = currentTime - startTime;

                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
              }
              intentos++;              
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }
                System.out.println("Repeticiones: " + contador + " - Tiempo transcurrido: " + elapsedTime + " ms");
                startTime = currentTime;
            }
        }
    }
}