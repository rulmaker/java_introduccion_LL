package estructurascontrol;

import java.util.Scanner;

public class EstructurasControl {
    public static void main(String[] args) {
        int numeroPensado = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el número que estoy pensando del 1 al 10");
        int numeroIntroducido = sc.nextInt();
        
        String color;
        if (numeroIntroducido == numeroPensado){
            color = "\033[0;42m";
            System.out.println(color + "Felicidades!!!");
        }else {
            color = "\033[0;31m";
            System.out.println(color + "Lo sentimos, el número que estaba pensando es el " 
                + numeroPensado);
        }
    }
}
