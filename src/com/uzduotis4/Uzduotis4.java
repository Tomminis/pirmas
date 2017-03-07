package com.uzduotis4;

import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-06.
 */
public class Uzduotis4 {
    public Uzduotis4(){

        System.out.print("iveskite du skaicius");
        Scanner sk = new Scanner(System.in);
        int sk1 = sk.nextInt();
        System.out.print("iveskite antra saiciu");
        int sk2 = sk.nextInt();
        System.out.println("suma" + sumavimas(sk1,sk2));
        System.out.println("skirtumas" + skirtumas(sk1,sk2));





    }

    static int sumavimas(int sk1, int sk2) {
        int suma = sk1 + sk2;
        return suma;
    }

    static int skirtumas(int sk1, int sk2) {
        int skirtumas = sk1 - sk2;
        return  skirtumas;
    }
}
