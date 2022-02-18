/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocls;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class EjercicioCls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        List<String> persona = new ArrayList<>();

        persona.add("Josue");
        persona.add("Medardo");
        persona.add("Fredy");
        persona.add("Cristian");

        // A Fredy y Cristian les gusta bailar
        System.out.println("?");
        String m = in.nextLine();
        if (m.equals("Josue")) {
            System.out.println("Josue estima: "
                    + persona.get(2) + " "
                    + persona.get(3));
        }

    }

}
