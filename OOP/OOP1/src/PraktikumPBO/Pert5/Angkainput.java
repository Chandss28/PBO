package PraktikumPBO.Pert5;

import java.util.Scanner;

public class Angkainput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;

        System.out.println("Masukkan angka (masukkan 0 untuk berhenti): ");

       
        while (true) {
            angka = scanner.nextInt();

            if (angka == 0) {
                System.out.println("Program berhenti.");
                break;
            }

            System.out.println("Anda memasukkan angka: " + angka);
        }

        scanner.close(); 
    }
}
