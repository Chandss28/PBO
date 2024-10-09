package PraktikumPBO.Pert4;

import java.util.Scanner;

public class HurufDigit {
    /**
     * @params args
     */
    public static void main(String[] args) {
        //membuat variabel dan scanner
        char karakter;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("Masukkan sebuah karakter : ");
        karakter = scan.nextLine().charAt(0);

        if ( (karakter >='A')&& (karakter <='2') || (karakter >='a') && (karakter <='2')){
            System.out.println(karakter + " adalah huruf");
        }else if ((karakter>='0')&& (karakter<='9')){
            System.out.println(karakter + " adalah digit");
        }else {
            System.out.println(karakter + " bukan huruf atau digit");
        }
    }
}

