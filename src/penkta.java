import java.util.Scanner;

/**
 * Created by Ruta on 2017-03-03.
 */
public class penkta {

    public static void main(String[] args) {
        System.out.print("iveskite savo ugi");
        Scanner sk = new Scanner(System.in);
        int ugis = sk.nextInt();
        System.out.print("iveskite savo svori");
        int svoris = sk.nextInt();
        int ugis2 = ugis * ugis;
        int KMI = svoris / ugis2;

        System.out.print("jusu KMI " + KMI);
    }


}

