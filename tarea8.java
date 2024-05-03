
package com.mycompany.cristian_tarea;
import java.util.Scanner;
public class tarea8 {
     public class Ejercicio8 {
    public static void main(String[] args) {
        final int percentage = 30;
        int hours;
        double salaryHour, finalSalary;
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            System.out.print("Ingrse el salario por hora: ");
            salaryHour = input.nextFloat();
            System.out.print("Ingrese las horas trabajadas: ");
            hours = input.nextInt();
            finalSalary = (salaryHour * hours);
            finalSalary += (finalSalary / 100) * percentage;
            System.out.println("El alario final es: "+finalSalary+"$\n");
            System.out.print("Continuar? (s/n): ");
            input.nextLine();
            String sn = input.nextLine();
            if (sn.toLowerCase().equals("n")) {
                condition = false;
            }
        }
    }
    }
}
