package PraktikumPBO.Pert12Quiz;

class Dosen {
    private String nik;
    private String nama;

    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public void view() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
    }
}

class Rektor extends Dosen {
    private int tahunMasuk;

    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama);
        this.tahunMasuk = tahunMasuk;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void viewRektor() {
        super.view();
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}

class Dekan extends Dosen {
    private String fakultas;

    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void viewDekan() {
        super.view();
        System.out.println("Fakultas: " + fakultas);
    }
}

public class Dosenn {
    public static void main(String[] args) {
        System.out.println("Mahasiswa:");
        System.out.println("NIK: 123124");
        System.out.println("Nama: Alex Smith");

        Rektor rektor = new Rektor("123345", "Dr. John", 2005);
        Dekan dekan = new Dekan("123890", "Johny", "Teknik Informatika");

        System.out.println("\nRektor:");
        rektor.viewRektor();

        System.out.println("\nDekan:");
        dekan.viewDekan();
    }
}
