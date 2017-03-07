package com.uzduotis7;

import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-06.
 */
public class Uzduotis7 {
    public Uzduotis7() {
        System.out.print("iveskite skaiciu ");
        Scanner s = new Scanner(System.in);
        int sk = s.nextInt();
        int suma = 0;
        while (sk != 0) {

            sk = s.nextInt();
            System.out.print(sk);
            suma = suma + sk;

        }
        System.out.print("programos pabaiga" + suma);
    }
}
