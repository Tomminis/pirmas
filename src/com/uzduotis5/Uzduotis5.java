package com.uzduotis5;

import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-06.
 */
public class Uzduotis5 {
    public Uzduotis5(){
        System.out.print("Iveskite skaiciu");
        Scanner s = new Scanner(System.in);
        int sk = s.nextInt();
        if (sk % 2 ==0) {
            System.out.print("skaicius yra pirminis");
        }
        else  {
            System.out.print("skaicius nera pirminis");
        }

    }
}
