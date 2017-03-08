package com.uzduotis11;

import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-07.
 */
public class Uzduotis11 {
    int[] mas;

    public Uzduotis11() {
    }

    public void nuskaityti() {
        Scanner sc = new Scanner(System.in);
        System.out.print("iveskite kokio dydzio masyvas");
        int n = sc.nextInt();

        mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            System.out.print("iveskite; " + (i + 1) + " a skaiciu kuris yra sveikas");
            mas[i] = sc.nextInt();
        }
    }

    public void palyginti() {

        for (int i = 0; i < mas.length; i++) {

            if (mas[i] > 100) {

                System.out.print(","+ mas[i]);
            }
            else{
                break;
            }

        }


    }
}
