package PraktikumPBO.Pert3;

import java.util.Scanner;

public class KalkulatorAritmatika {
    
    public static void main(String[] args) {
        Scanner pemindai = new Scanner(System.in);
        boolean lagi = true;

        while (lagi) {
            System.out.print("Masukkan angka pertama: ");
            double angkaPertama = pemindai.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angkaKedua = pemindai.nextDouble();

            System.out.print("Pilih operasi (+, -, *, /): ");
            char operasi = pemindai.next().charAt(0);

            double hasil;

            switch (operasi) {
                case '+':
                    hasil = angkaPertama + angkaKedua;
                    printHasil(angkaPertama, angkaKedua, hasil, operasi);
                    break;
                case '-':
                    hasil = angkaPertama - angkaKedua;
                    printHasil(angkaPertama, angkaKedua, hasil, operasi);
                    break;
                case '*':
                    hasil = angkaPertama * angkaKedua;
                    printHasil(angkaPertama, angkaKedua, hasil, operasi);
                    break;
                case '/':
                    if (angkaKedua != 0) {
                        hasil = angkaPertama / angkaKedua;
                        printHasil(angkaPertama, angkaKedua, hasil, operasi);
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                default:
                    System.out.println("Operasi tidak dikenal. Silakan pilih +, -, *, atau /.");
                    break;
            }

            System.out.print("Apakah Anda ingin melakukan operasi lain? (ya/tidak): ");
            String jawaban = pemindai.next();
            if (jawaban.equalsIgnoreCase("tidak")) {
                pemindai.close();
                System.out.println("Terima kasih! Program selesai.");
                System.out.println("Have a great lovely day!");
                return; // Keluar dari program
            }
        }

        pemindai.close();
    }

    private static void printHasil(double a, double b, double hasil, char operasi) {
        if (hasil % 1 == 0) {
            System.out.printf("Hasil: %.0f %c %.0f = %.0f%n", a, operasi, b, hasil);
        } else {
            System.out.printf("Hasil: %.2f %c %.2f = %.2f%n", a, operasi, b, hasil);
        }
    }
}
