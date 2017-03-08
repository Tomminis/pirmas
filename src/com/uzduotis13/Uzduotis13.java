package com.uzduotis13;

import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-08.
 */
public class Uzduotis13 {
    int[] mas;

    public Uzduotis13() {
    }
    public  void nuskaityti(){
        System.out.print("iveskite kokio dydzio masyvas");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        mas = new int[n];
        for (int i = 0; i < mas.length;i++){
           System.out.print("iveskite "+(i+1)+" skaiciu kuris yra sveikas");
           mas[i] = sc.nextInt()  ;
        }
    } public void palyginti(){
        for (int i = 0;i < mas.length;i++) {
            if (mas[i] > 100){
                System.out.print(","+mas[i]);
            }
            else{
                break;
            }
        }
    }


}



