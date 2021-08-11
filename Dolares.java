
package dolares;

import java.util.Scanner;

public class Dolares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float Rodrigo, Esteban, Andrea;
        float total;
        System.out.println("Ingrese cantidad en dolares: ");
        Rodrigo = entrada.nextFloat();
        System.out.println("Rodrigo tiene: "+Rodrigo);
        Andrea = Rodrigo/2;
        System.out.println("Andrea tiene : "+Andrea);
        Esteban = ((Rodrigo+Andrea)/2);
        System.out.println("Esteban tiene: "+Esteban);
        total = Rodrigo+Andrea+Esteban;
        System.out.println("La suma total de los tres es de: "+total);
        // TODO code application logic here
    }
    
}
