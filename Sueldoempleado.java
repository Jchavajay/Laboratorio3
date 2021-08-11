
package tarea.pkg2;

import javax.swing.JOptionPane;

public class Sueldoempleado {

    public static void main(String[] args) {
    final double PRECIO_HORA=40;
        double horas=0;
        double sueldo_total=0;
        
        horas=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de horas trabajadas en la semana: "));
        if (horas<=48)
        {
            sueldo_total=horas*PRECIO_HORA;
            System.out.println("El empleado trabajo "+horas+" horas");
                System.out.println("No trabajo horas extras.");
        }
        else if(horas<=56)
        {
            sueldo_total=48*PRECIO_HORA+(horas-48)*2*PRECIO_HORA;
            System.out.println("El empleado trabajo "+horas+" horas");
                System.out.println("Trabajo "+(horas-48)+" horas extras");
        }
        else
        {
            sueldo_total=48*PRECIO_HORA+8*2*PRECIO_HORA+(horas-56)*3*PRECIO_HORA;
        }
        System.out.println("El sueldo total es: "+sueldo_total);
    }
}