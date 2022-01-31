package conversormoneda;

import java.math.BigDecimal;
import java.util.Scanner;

public class ConversorMoneda {
    public static void main(String[] args) {
        System.out.println("Bienvenido al conversor de moneda");
        System.out.println("Por favor introduzca una cantidad en euros y el programa le "
                + "devolverá la cantidad convertida a Dólares");
        
        Scanner sc = new Scanner(System.in);
        double euros = sc.nextDouble();
        
        double dolares = 1.09 * euros;
        
        System.out.println(euros + " euros equivalen a " + dolares + " US Dólares");
        
        String eurosString = Double.toString(euros);//convertir double a string
        BigDecimal eurosBigDecimal = new BigDecimal(eurosString);//se instancia bigDecimal
        //se repite el proceso con la variable tasa de cambio
        double tasaDeCambio = 1.09;
        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);
        
        BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);
        
        System.out.println(euros + " equivalen a " + dolaresBigDecimal.toString() + " US dólares");
    }
}
