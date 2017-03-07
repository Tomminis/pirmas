package com.pamokos;

import com.uzduotis0.Uzduotis0;
import com.uzduotis1.Uzduotis1;
import com.uzduotis2.Uzduotis2;
import com.uzduotis3.Uzduotis3;
import com.uzduotis4.Uzduotis4;
import com.uzduotis5.Uzduotis5;
import com.uzduotis6.Uzduotis6;
import com.uzduotis7.Uzduotis7;
import com.uzduotis8.Uzduotis8;
import com.uzduotis9.Uzduotis9;
import com.uzduotis10.Uzduotis10;
import com.uzduotis11.Uzduotis11;
import com.uzduotis12.Uzduotis12;

import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-03.
 */
public class Main {
    public static void main(String[] args) {


        Uzduotis0 uzduotis0 = new Uzduotis0();
        System.out.println("iveskite skaiciu nuo 1 iki 19" );
        Scanner s = new Scanner(System.in);
        int sk = s.nextInt();
        if (sk == 1) {
            Uzduotis1 uzduotis1 = new Uzduotis1();

        } else if (sk == 2) {
            Uzduotis2 uzduotis2 = new Uzduotis2();
        } else if (sk == 3) {
            Uzduotis3 uzduotis3 = new Uzduotis3();
        } else if (sk == 4) {
            Uzduotis4 uzduotis4 = new Uzduotis4();
        } else if (sk == 5) {
            Uzduotis5 uzduotis5 = new Uzduotis5();
        } else if (sk == 6) {
            Uzduotis6 uzduotis6 = new Uzduotis6();
        }
         else if (sk == 7) {
            Uzduotis7 uzduotis7 = new Uzduotis7();
        }
          else if (sk == 8) {
                Uzduotis8 uzduotis8 = new Uzduotis8();
        }
        else if (sk == 9) {
            Uzduotis9 uzduotis9 = new Uzduotis9();
            uzduotis9.nuskaitymas(3);
            uzduotis9.skaiciavimas();
        }
        else if (sk == 10) {
            Uzduotis10 uzduotis10 = new Uzduotis10();
            uzduotis10.nuskaitymas();
        }
        else if (sk == 11) {
            Uzduotis11 uzduotis11 = new Uzduotis11();


        }
    }

}
