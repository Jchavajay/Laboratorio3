
package ecuacionsegundogrado;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Ecuacionsegundogrado {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int a, b, c, p = 2;
        float sub, subt1, subt2, subt3, subt4, subt5;
        float subtotal, total, total2;

        System.out.print("Ingrese el valor de a: ");
        a = (int) enter.nextFloat();
        System.out.print("Ingrese el valor de b: ");
        b = (int) enter.nextFloat();
        System.out.print("Ingrese el valor de c: ");
        c = (int) enter.nextFloat();

        sub = (float) pow(b, p); //b^2
        subt1 = 4*a*c;
        subt2 = sub - subt1; //b^2-4ac
        subt3 = (float) sqrt(subt2); //raíz(b^2-4ac)

        subt4 = -b - subt3; //-b-raíz(b^2-4ac)
        subt5 = -b + subt3; //-b+raíz(b^2-4ac)

        subtotal = 2*a;

        total = subt4 / subtotal; //-b-raíz(b^2-4ac)/2a
        total2 = subt5 / subtotal; //-b+raíz(b^2-4ac)/2a

        System.out.println("Resultado 1: " + total);
        System.out.println("Resultado 2: " + total2);
    }
    
}
