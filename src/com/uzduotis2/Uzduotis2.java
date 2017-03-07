package com.uzduotis2;

import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-06.
 */
public class Uzduotis2 {
    public Uzduotis2(){
        System.out.print("iveskite zodi ");
        Scanner s = new Scanner(System.in) ;
        String zodis = s.next();
        int a = zodis.length();
        System.out.print("zodis turi " +a+ " raides");
    }
}
