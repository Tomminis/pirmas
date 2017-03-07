package com.uzduotis9;

import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-07.
 */
public class Uzduotis9 {
    int[] mas;

    public Uzduotis9() {

    }



    public void nuskaitymas(int ilgis) {
        System.out.println("iveskite 5 skaicius");
        Scanner s = new Scanner(System.in);
         mas = new int[ilgis];

        for (int i = 0; i < mas.length; i++) {
            System.out.print("iveskite " + (i + 1) + "skaiciu kuris turi buti sveikasis");
            mas[i] = s.nextInt();
        }


    }

    public void skaiciavimas() {
        int suma = 0;
        for (int i = 0; i < mas.length; i++) {
            System.out.println("ivestas skaicius " + mas[i]);
            suma += mas[i];

        }
        System.out.print("skaiciu suma yra: " + suma);
    }





}
