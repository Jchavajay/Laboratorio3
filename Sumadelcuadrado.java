
package sumadelcuadrado;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Sumadelcuadrado {

    public static void main(String[] args) {
       Scanner enter = new Scanner(System.in);
        int a, b, resultado, resl, total2, total3, total;
        int c = 2;

        System.out.println("CALCULAR LA SUMA DE UN CUADRADO");
        System.out.print("Ingrese el valor de a: ");
        a = (int) enter.nextFloat();
        System.out.print("Ingrese el valor de b: ");
        b = (int) enter.nextFloat();

        resl = a+b;
        resultado = (int) pow(resl,c);
        total2 = (int) (pow(a,c) + pow(b,c));
        total3 = 2*a*b;
        total = total2 + total3;

        System.out.println("COMPARACIÓN DE RESULTADOS");
        System.out.println(" El resultado de (a+b)^2 es: " + resultado);
        System.out.println(" El resultado de (a^2+b^2+2ab) es: " + total);
    }
    
}
