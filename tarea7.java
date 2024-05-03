
package com.mycompany.cristian_tarea;

import java.io.IOException;
import java.util.Scanner;

public class tarea7 {
     public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        float a, b, c;
        while (condition) {
            System.out.print("Ingrese su primera nota: ");
            a = input.nextFloat();
            System.out.print("Ingrese su segunda nota: ");
            b = input.nextFloat();
            System.out.print("Ingrese su tercera nota: ");
            c = input.nextFloat();
            System.out.println("Su promedio es: "+(a + b+ c)/3);
            input.nextLine();
            System.out.print("Continuar? (s/n): ");
            if (input.nextLine().toLowerCase().equals("n")) {
                condition = false;
            }
        }
    }
}
