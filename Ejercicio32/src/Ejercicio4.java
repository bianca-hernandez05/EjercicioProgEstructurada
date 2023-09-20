import java.util.Scanner;

public class Ejercicio4 {
        public static void main(String []args){

             Scanner lector=new Scanner(System.in);
             double raiz1,raiz2,raiz,a,b,c,dis,parteReal,parteImaginaria;
             byte intentos = 1 ,intentoMaximo = 3;
             
            System.out.print(" ingrese el valor a: ");
             a = lector.nextDouble();
    
             System.out.print("ingrese el valor de b: ");
             b = lector.nextDouble();
    
             System.out.print("ingrese el valor de c: ");
             c = lector.nextDouble();
    
             dis = Math.pow(b, 2)- 4 * a * c;

             if(intentos <3){

                System.out.println("Intentelo nuevamente : ");
                System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
            }
    
          intentos++;
          if(intentos == intentoMaximo){
            
          System.out.println("No le quedan mas intentos ");
          }else{
    
            if (dis > 0) {
                 raiz1 = (-b + Math.sqrt(dis)) / (2 * a);
                 raiz2 = (-b - Math.sqrt(dis)) / (2 * a);
                System.out.println("Las raíces son reales :");
                System.out.println(" La ecuacion cuadratica de simbolo +  = " + raiz1);
                System.out.println(" la Ecuaciion cuadratica de simbolo -  = " + raiz2);
            } else if (dis == 0) {
                  raiz = -b / (2 * a);
                System.out.println("La ecuación tiene una unica raiz  :");
                System.out.println("Raíz = " + raiz);
            } else {
                 parteReal = -b / (2 * a);
                 parteImaginaria = Math.sqrt(-dis) / (2 * a);
                System.out.println("La Ecuacion posee dos raices complejas:");
                System.out.println(" La Primer Raíz es  = " + parteReal + " + " + parteImaginaria );
                System.out.println(" La Segunda Raíz  es = " + parteReal + " - " + parteImaginaria );
            }
        }
         lector.close();

        }
}
