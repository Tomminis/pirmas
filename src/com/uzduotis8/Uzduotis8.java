package com.uzduotis8;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Created by Ruta on 2017-03-06.
 */
public class Uzduotis8 {
    public Uzduotis8() {
        int x =-1;

        System.out.print("iveskite skaiciu ");
        //Scanner s = new Scanner(System.in);
        //int sk = s.nextInt();
        int suma = 0;
        while (x != 0){
        try{
            //System.out.print("iveskite skaiciu ");
            Scanner s = new Scanner(System.in);
            x = s.nextInt();
            System.out.print(x);
            suma = suma + x;

        }
        catch (InputMismatchException e){
            System.out.print("Netinkamas skaicius");
        }
        }
        System.out.print("programos pabaiga" + suma);

    }
}
