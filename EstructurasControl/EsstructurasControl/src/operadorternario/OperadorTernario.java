package operadorternario;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int dividendo = sc.nextInt();
        System.out.println("Introduce otro número entero");
        int divisor = sc.nextInt();
        int resultado;
        /*if (divisor == 0) {
            resultado = 0;//no es un resultado correcto, pero se puede usar para evitar una excepción
        }*/
        
        resultado = divisor == 0 ? 0 : dividendo/divisor;
        
        System.out.println("El resultado de dividir " + dividendo + " entre "
        + divisor + " es " + resultado);
        
        
    }
}
