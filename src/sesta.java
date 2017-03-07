import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-06.
 */
public class sesta {
    public static void main(String[] args) {
        System.out.print("iveskite savo ugi");
        Scanner sk = new Scanner(System.in);
        float ugis = sk.nextFloat();
        System.out.print("iveskite savo svori");
        int svoris = sk.nextInt();
        float ugis2 = ugis * ugis;
        float KMI = svoris / ugis2;

        System.out.print("jusu KMI " + KMI);
    }
}
