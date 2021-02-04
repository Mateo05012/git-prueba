package javaapplication1;

import java.util.Scanner;

/**
 *
 *
 * @author mateo
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        String pal, resul;
        resul = "";
        System.out.println("Escriba la palabra a duplicar");
        pal = leer.nextLine();
        System.out.println("¿Cuantas veces?");
        n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            resul= resul+"\n "+pal;
        }
        System.out.println(resul);
    }

}
