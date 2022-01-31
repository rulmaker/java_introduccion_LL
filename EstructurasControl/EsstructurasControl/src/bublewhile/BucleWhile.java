package bublewhile;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        //repetir una o varias instrucciones mientras se cumple la condición
        //no siempre conocemos la cantidad de iteraciones
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero");
        double numero = sc.nextDouble();
        double candidatoARaiz = 0.0;
        
        while(candidatoARaiz*candidatoARaiz <= numero){
            candidatoARaiz += 0.01;
            System.out.println("Será el número " + candidatoARaiz  + 
                    "? Su cuadrado es" + candidatoARaiz * candidatoARaiz);
            
        }
       
        
        System.out.println("La raíz cuadrada que hemos calculado es " + candidatoARaiz);
        System.out.println("La raíz cuadrada real es: " + Math.sqrt(numero));
    }
}
