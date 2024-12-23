package PraktikumPBO.Pert5;

import java.util.Scanner;
public class Bilangansampaiseratus{
    public static void main(String[] args) {
        System.out.println("Bilangan genap dari 1 hingga 100:");

        // Loop dari 2 sampai 100 dengan langkah 2
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}