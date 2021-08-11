
package notafinal;

import java.util.Scanner;

public class Notafinal {

    public static void main(String[] args) {
  Scanner enter = new Scanner(System.in);
        int participacion, examen1, examen2, exafinal;
        int totalcurso;
        
        System.out.println("CÁLCULO DE NOTAS DE UN ESTUDIANTE");
        System.out.print("Ingrese la nota de participación: ");
        participacion = (int) enter.nextFloat();
        System.out.print("Ingrese la nota del 1er parcial: ");
        examen1 = (int) enter.nextFloat();
        System.out.print("Ingrese la nota del 2do parcial: ");
        examen2 = (int) enter.nextFloat();
        System.out.print("Ingrese la nota del examen final: ");
        exafinal = (int) enter.nextFloat();
        
        totalcurso = participacion + examen1 + examen2 + exafinal;
        
        System.out.println("La nota final del estudiante de informática es: " +totalcurso);
    }
    
}
