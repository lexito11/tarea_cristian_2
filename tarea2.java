package com.mycompany.cristian_tarea;
import java.util.Scanner;
import java.io.*;

public class tarea2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("introdusca el valor de n: ");
        int n = input.nextInt(), i=0; 
        do { 
            System.out.println(i);
            i++; 
        } while (i<=n); 
        
        System.out.print("Ingrese el valor de n: ");
        n = input.nextInt();
        i = 0;
        while (i <= n) { 
            System.out.println(i);
            i++; 
        }

        System.out.print("Ingrese el valor de n: ");
        n = input.nextInt();
        for (i=0;i<=n;i++) { 
            System.out.println(i);
        }
    }
}
