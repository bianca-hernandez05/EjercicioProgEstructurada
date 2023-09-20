import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) throws Exception {
    
       Scanner lector=new Scanner(System.in);
         
        byte intentos = 1 , intentoMaximo = 3;
        byte edad;
        char sexo;
        char entre;

        System.out.println(" Lleva arma S/N");
        entre=lector.next().charAt(0);
        if (entre=='S' || entre =='s'){
        System.out.println("Usted no puede entrar a la disco: ");
        } else{
        System.out.println( "Ingrese su edad : ");
        edad=lector.nextByte();
        if (edad<=0){      
        System.out.println("Usted no ha nacido ");
        } else if(edad<18){
    
        System.out.println("Usted es menor de edad , no puede ingresar: ");
        
        } else{

        System.out.println("Ingrese su sexo M/F");
        sexo=lector.next().charAt(0);
        
        if((sexo=='f' || sexo=='F') && edad==18){
        System.out.println("Usted puede entrar a la disco pero no puede tomar");
        } else if((sexo=='f' || sexo=='F') && edad>=20){
            
        System.out.println("Usted puede entrar a la disco y tambien puede tomar alcohol");
        } else if (sexo=='m' || sexo=='M' && edad>=18 && edad <=21){
        System.out.println("Usted puede entrar a la disco pero no puede tomar");
        } else if(sexo=='m' || sexo=='M' && edad>=21){

            if(intentos <3){

                System.out.println("Intentelo nuevamente : ");
                System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
            }
          }
          intentos++;
        } 
          
          if(intentos == intentoMaximo){
            
          System.out.println("No le quedan mas intentos ");
          }
        
        System.out.println("Usted puede entrar a la disco y tomar alcohol");
          
            lector.close();
        }
    }
}
