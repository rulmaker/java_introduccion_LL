package estructuraswitch;

import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca el dí de la semana en que quiere su cita");
        String dia = sc.nextLine();
        
       /* switch(dia){
            case "lunes":
                System.out.println("El lúnes puede venir de 11: 00 a 12: 30");
                break;
            case "martes":
                System.out.println("El martes puede venir de 15: 30 a 17: 30");
                break;
            case "miercoles":
                System.out.println("El miercoles puede venir de 11: 00 a 12: 30");
                break;
            case "jueves":
                System.out.println("El jueves puede venir de 15: 30 a 17: 30");
                break;
            case "viernes":
                System.out.println("El viernes puede venir de 9: 00 a 11: 00");
                break;
            case "sabado":
                System.out.println("El sábado nuestra clínica permanecerá cerada");
                break;
            case "domingo":
                System.out.println("El domingo nuestra clínica permanecerá cerada");
                break;
            default:
                System.out.println("Usted no ha introducido un día válido");
                break;
        }*/
       
       switch(dia){
            case "lunes":  //lunes y miércoles comparten mismo resultado
            case "miercoles":
                System.out.println("El miercoles puede venir de 11: 00 a 12: 30");
                break;
            case "martes"://lo mismo con martes y jueves
            case "jueves":
                System.out.println("El jueves puede venir de 15: 30 a 17: 30");
                break;
            case "viernes":
                System.out.println("El viernes puede venir de 9: 00 a 11: 00");
                break;
            case "sabado"://same here
            case "domingo":
                System.out.println("Este día nuestra clínica permanecerá cerada");
                break;
            default:
                System.out.println("Usted no ha introducido un día válido");
                //no es necesario break;
       }
    }
}
