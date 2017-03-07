package com.uzduotis10;

import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-07.
 */
public class Uzduotis10 {
    public Uzduotis10() {
        System.out.println("iveskite 5 skaicius");
        Scanner s = new Scanner(System.in);
        int[] mas = new int[5];


        int suma = 0;
        for (int i = 0; i < mas.length; i++) {
            System.out.print("iveskite " + (i + 1) + "skaiciu kuris turi buti sveikasis");
            mas[i] = s.nextInt();
        }
        //int suma = 0;
        for (int i = 0; i < mas.length; i++) {
            System.out.println("ivestas skaicius " + mas[i]);
            suma += mas[i];

        }
        System.out.print("skaiciu suma yra: " + suma);

    }

}
