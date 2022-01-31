package buclefor;

import java.util.Scanner;

public class BucleFor {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número");
        int primerNumero = sc.nextInt();
        System.out.println("Por favor, introduzca el segundo número");
        int segundoNumero = sc.nextInt();
        int resultado = 0;
        
        for(int i=0; i < segundoNumero; i++){
            System.out.println("Iteración número: " + i);
            resultado += primerNumero;
        }
        
        System.out.println("El resultado de multiplicar " + primerNumero + 
                " por " + segundoNumero + " es " + resultado);*/
        
        int suma = 0;
        int suma2 = 0;
        
        //es inexacto
        for (int i = 0, j = 50; i<j; i++, j--){//dos variables de control
            System.out.println("Iteración número " + i + " sumando " + i + " y " + j);
            System.out.println(i + " - " + j);
            suma = suma + i + j;
            
        }
        System.out.println("El resultado de sumar los números del 1 al 100 es " + suma);
        
       BucleFor metodo = new BucleFor();
        System.out.println(metodo.metodoSuma(50));
    }
    
    public double metodoSuma(double n){
        return (n/2)*(n+1);
    }
}
