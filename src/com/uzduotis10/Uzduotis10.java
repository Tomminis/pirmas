package com.uzduotis10;

import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-07.
 */
public class Uzduotis10 {
    public Uzduotis10() {
        System.out.print("iveskite zodi");
        Scanner s = new Scanner(System.in);
        int sk = 0;
        int suma = 0;
         int i = 0;
        while (i < 5)  {
            sk = s.nextInt() ;
            suma = suma + i;
        }
        System.out.print(suma);

    }

}
