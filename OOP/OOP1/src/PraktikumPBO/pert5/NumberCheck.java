package PraktikumPBO.pert5;

import java.util.Scanner;

public class NumberCheck {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Masukkan angka : ");
        double angka = scanner.nextDouble();

        if (angka > 0) {
            System.out.println("Angka tersebut adalah positif");
        } else if (angka < 0) {
            System.out.println("Angka tersebut adalah negatif");
        } else {
            System.out.println("Angka tersebut adalah nol");
        }

        scanner.close();
    }
}
