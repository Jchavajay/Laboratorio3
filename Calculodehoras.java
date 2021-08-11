
package calculodehoras;

import java.util.Scanner;

public class Calculodehoras {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int semanas, dias, horas, horastotales;

        System.out.print("Ingrese la cantidad en horas: ");
        horastotales = (int) enter.nextFloat();

        semanas = horastotales / 168;
        dias = horastotales % 168 / 24;
        horas = (horastotales % 168) % 24;

        System.out.println(+horastotales + " horas equivalen a:");
        System.out.println(" "+semanas + " semanas, " + dias + " días y " + horas + " horas.");
    }
    
}
