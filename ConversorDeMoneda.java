
package conversor.de.moneda;

import java.util.Scanner;

public class ConversorDeMoneda {

    public static void main(String[] args) {
        double Monto;
        double pesos;
        double dolares;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce la tasa de conversion de pesos a dolares: ");
        Monto = input.nextDouble();

        System.out.print("Introduce la cantidad de pesos a convertir: ");
        pesos = input.nextDouble();

        dolares = pesos / Monto;

        System.out.println("$" + pesos + " pesos son equivalentes a " + dolares + " dolares.");
    }
}


 
