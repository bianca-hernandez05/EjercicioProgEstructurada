public class Ejercicio20 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long incremento = 1000000; 

        int contador = 0;
        while (contador < 300000000) {
            contador++;
            
            if (contador % incremento == 0) {
                long currentTime = System.currentTimeMillis();
                long elapsedTime = currentTime - startTime;
                System.out.println("Repeticiones: " + contador + " - Tiempo transcurrido: " + elapsedTime + " ms");
                startTime = currentTime;
            }
        }
    }
}