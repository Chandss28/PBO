package PraktikumPBO.Pert4;

import java.util.Scanner;

public class StockEsKrimMixue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int stokCoklat = 15;
        int stokVanilla = 18;
        int stokStrawberry = 20;
        int stokManggo = 25;

        int hargaCoklat = 5000;
        int hargaVanilla = 5500;
        int hargaStrawberry = 8000;
        int hargaManggo = 7000;

        String[] namaEsKrim = {"Coklat", "Vanilla", "Strawberry", "Manggo"};
        int[] hargaEsKrim = {hargaCoklat, hargaVanilla, hargaStrawberry, hargaManggo};
        int[] stokEsKrim = {stokCoklat, stokVanilla, stokStrawberry, stokManggo};

        boolean menuUtama = true;

        do {
            System.out.println("\n===== MENU STOCK ES KRIM MIXUE =====");
            System.out.println("1. Lihat stok es krim");
            System.out.println("2. Tambah stok es krim");
            System.out.println("3. Beli es krim");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\n===== STOK ES KRIM =====");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(namaEsKrim[i] + ": " + stokEsKrim[i] + " buah - Harga: Rp " + hargaEsKrim[i]);
                    }
                    break;

                case 2:
                    System.out.println("\n===== TAMBAH STOK ES KRIM =====");
                    System.out.println("1. Coklat");
                    System.out.println("2. Vanilla");
                    System.out.println("3. Strawberry");
                    System.out.println("4. Manggo");
                    System.out.print("Pilih es krim yang ingin ditambah stoknya (1-4): ");
                    int tambahStok = input.nextInt();

                    System.out.print("Masukkan jumlah stok yang ingin ditambahkan: ");
                    int jumlahTambah = input.nextInt();

                    if (tambahStok >= 1 && tambahStok <= 4) {
                        stokEsKrim[tambahStok - 1] += jumlahTambah;
                        System.out.println("Stok " + namaEsKrim[tambahStok - 1] + " berhasil ditambahkan. Stok baru: " + stokEsKrim[tambahStok - 1]);
                    } else {
                        System.out.println("Pilihan tidak valid!");
                    }
                    break;

                case 3:
                    System.out.println("\n===== BELI ES KRIM =====");
                    int totalHarga = 0;
                    boolean beliLagi = true;
                    StringBuilder daftarPembelian = new StringBuilder();
                    
                    while (beliLagi) {
                        System.out.println("1. Coklat");
                        System.out.println("2. Vanilla");
                        System.out.println("3. Strawberry");
                        System.out.println("4. Manggo");
                        System.out.println("5. Selesai");
                        System.out.print("Pilih es krim yang ingin dibeli (1-4) atau tekan 5 untuk selesai: ");
                        int beliStok = input.nextInt();

                        if (beliStok == 5) {
                            beliLagi = false;
                            break;
                        }

                        System.out.print("Masukkan jumlah yang ingin dibeli: ");
                        int jumlahBeli = input.nextInt();

                        if (beliStok >= 1 && beliStok <= 4) {
                            if (jumlahBeli <= stokEsKrim[beliStok - 1]) {
                                stokEsKrim[beliStok - 1] -= jumlahBeli;
                                totalHarga += jumlahBeli * hargaEsKrim[beliStok - 1];
                                daftarPembelian.append(namaEsKrim[beliStok - 1])
                                               .append(": ").append(jumlahBeli)
                                               .append(" buah - Rp ").append(jumlahBeli * hargaEsKrim[beliStok - 1])
                                               .append("\n");
                            } else {
                                System.out.println("Stok " + namaEsKrim[beliStok - 1] + " tidak mencukupi!");
                            }
                        } else {
                            System.out.println("Pilihan tidak valid!");
                        }
                    }

                    if (daftarPembelian.length() > 0) {
                        System.out.println("\n===== DAFTAR PEMBELIAN =====");
                        System.out.println(daftarPembelian);
                        System.out.println("Total pembayaran: Rp " + totalHarga);
                    } else {
                        System.out.println("Tidak ada es krim yang dibeli.");
                    }
                    break;

                case 4:
                    System.out.println("Have a great lovely day!!!");
                    menuUtama = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi!");
                    break;
            }
        } while (menuUtama);

        input.close();
    }
}
