package com.uzduotis6;

import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-06.
 */
public class Uzduotis6 {
    public Uzduotis6(){
        System.out.print("iveskite zodi, kai ivesite zodi pabaiga programa baigsis");
        Scanner s = new Scanner(System.in);
        String zodis = s.nextLine();


        while (!zodis.equals("pabaiga")  ) {

            zodis = s.next();
             System.out.print(zodis);
        }
        System.out.print("programa baigta");
    }
}
