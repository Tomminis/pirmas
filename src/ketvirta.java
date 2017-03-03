import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-03.
 */
public class ketvirta {
    public static void main(String[] args) {
        System.out.print("iveskite du skaicius");
        Scanner sk = new Scanner(System.in);
        int skaicius = sk.nextInt();
        System.out.print("iveskite antra saiciu");
        int sk2 = sk.nextInt();
        System.out.println("suma" + sumavimas(skaicius,sk2));
        System.out.println("skirtumas" + skirtumas(skaicius,sk2));





    }

    static int sumavimas(int sk1, int sk2) {
        int suma = sk1 + sk2;
        return suma;
    }

    static int skirtumas(int sk1, int sk2) {
        int skirtumas = sk1 - sk2;
        return  skirtumas;
    }


}



