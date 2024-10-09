package PraktikumPBO.Pert4;

import java.util.Scanner;
import javax.print.DocFlavor.STRING;
//program SWITCH
public class Lampulalulintas {
    
    public static void main (String[] args) {
        //Mmebuat Variabel dan Scanner
        String lampu;
        Scanner scan = new Scanner(System.in);
        //Mengambil input
        System.out.print(" Inputkan Nama Warna: ");
        lampu = scan.nextLine();

        switch (lampu) {
            case "merah":
             System.out.println("Lmapu merah, berhenti!");
             break;
            case "kuning":
             System.out.println("Lampu kuning, harap hati-hati!");
             break;
            case "hijau":
             System.out.println("Lampu hijau, silahkan jalan!");
             break;
            default:
             System.out.println("Warna Lampu Salah!");
        }
    }
}
