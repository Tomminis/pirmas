package com.uzduotis10;

import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-07.
 */
public class Uzduotis10 {
    public Uzduotis10() {
        System.out.println("iveskite 3 zodzius");
        Scanner s = new Scanner(System.in);
        String[] mas = new String[3];


        //int suma = 0;
        for (int i = 0; i < mas.length; i++) {
            System.out.print("iveskite " + (i + 1) );
            mas[i] = s.next();
        }
        String suma ="";
        for (int i = 0; i < mas.length; i++) {
            //System.out.println("ivestas skaicius " + mas[i]);
            suma +=" "+ mas[i];

        }
        System.out.print("jus ivedete: " + suma );

    }
    public void nuskaitymas

}
