
package tarea1;

import java.util.Scanner;

public class Promedio {

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        
        float nota1, nota2, nota3, suma;
        System.out.println("Ingrese tres notas: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        suma = nota1+nota2+nota3;
        System.out.println("La suma de las notas es: "+suma);
    }
}