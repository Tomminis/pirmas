package com.uzduotis3;

import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-06.
 */
public class Uzduotis3 {
    public Uzduotis3() {
        {
            System.out.print("iveskite du skaicius");
            Scanner sk = new Scanner(System.in);
            int skaicius = sk.nextInt();
            int skaicius1 = sk.nextInt();
            int suma = skaicius + skaicius1;
            System.out.print(suma);
            System.out.print("iveskite du skaicius");

            Scanner sk1 = new Scanner(System.in);
            int skaicius2 = sk1.nextInt();
            int skaicius3 = sk1.nextInt();


            int skirtumas = skaicius - skaicius1;
            System.out.print(skirtumas);
        }
    }
}
