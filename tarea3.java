
package com.mycompany.cristian_tarea;
import java.io.IOException;
public class tarea3 {
     public static void main(String[] args) throws IOException {
        int i=0, e=0;
        do {
            e += i++;
        } while (i<=10);
        System.out.println(e);
        i = 0;
        e = 0;
        while (i<=10) {
            e += i++;
        }
        System.out.println(e);
        e = 0;
        for (i=0;i<=10;i++) {
            e += i;
        }
        System.out.println(e);
    }
}
