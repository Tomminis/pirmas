package com.uzduotis10;

import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-07.
 */
public class Uzduotis10 {
    String[] mas ;
    public Uzduotis10() {

    }
    public void nuskaitymas() {
        System.out.println("iveskite 3 zodzius");
        Scanner s = new Scanner(System.in);
         mas = new String[3];

        for (int i = 0; i < mas.length; i++) {

            System.out.print("iveskite " + (i + 1) );
            mas[i] = s.next();
        }
        String suma ="";
        for (int i = 0; i < mas.length; i++) {
            suma +=" "+ mas[i];

        }
        System.out.print("jus ivedete: " + suma );
    }

}
