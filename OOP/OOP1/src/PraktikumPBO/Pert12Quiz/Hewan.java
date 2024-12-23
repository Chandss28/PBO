package PraktikumPBO.Pert12Quiz;

// Interface
interface SuaraHewan {
    void makeSound();
}

// Abstract Class Animal
abstract class Animal implements SuaraHewan {
    private String nama;
    private String sifat;
    private int ukuran;

    // Constructor
    public Animal(String nama, int ukuran, String sifat) {
        this.nama = nama;
        this.ukuran = ukuran;
        this.sifat = sifat;
    }

    // Getter dan Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public String getSifat() {
        return sifat;
    }

    // Abstract Method
    public abstract void tampilInfo();
}

// Subclass Mamalia
class Mamalia extends Animal {
    private String jalan;
    private String jenisMamalia;
    private boolean bisaJalan;
    private int jumlahKaki;

    // Constructor
    public Mamalia(String nama, int ukuran, String sifat, String jalan, String jenisMamalia, int jumlahKaki, boolean bisaJalan) {
        super(nama, ukuran, sifat);
        this.jalan = jalan;
        this.jenisMamalia = jenisMamalia;
        this.jumlahKaki = jumlahKaki;
        this.bisaJalan = bisaJalan;
    }

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public String getJalan() {
        return jalan;
    }

    public String getJenisMamalia() {
        return jenisMamalia;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public boolean getBisaJalan() {
        return bisaJalan;
    }

    @Override
    public void tampilInfo() {
        System.out.println("\nMamalia:");
        System.out.println("Nama: " + getNama());
        System.out.println("Ukuran: " + getUkuran());
        System.out.println("Sifat: " + getSifat());
        System.out.println("Jenis Mamalia: " + jenisMamalia);
        System.out.println("Jumlah Kaki: " + jumlahKaki);
        System.out.println("Bisa Jalan: " + (bisaJalan ? "Ya" : "Tidak"));
        System.out.println("Cara Jalan: " + jalan);
    }

    @Override
    public void makeSound() {
        System.out.println(getNama() + " mengeluarkan suara khas mamalia.");
    }
}

// Subclass Aves
class Aves extends Animal {
    private String jenisAves;
    private boolean bisaTerbang;

    // Constructor
    public Aves(String nama, int ukuran, String sifat, String jenisAves, boolean bisaTerbang) {
        super(nama, ukuran, sifat);
        this.jenisAves = jenisAves;
        this.bisaTerbang = bisaTerbang;
    }

    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    public boolean getBisaTerbang() {
        return bisaTerbang;
    }

    public String getJenisAves() {
        return jenisAves;
    }

    @Override
    public void tampilInfo() {
        System.out.println("\nAves:");
        System.out.println("Nama: " + getNama());
        System.out.println("Ukuran: " + getUkuran());
        System.out.println("Sifat: " + getSifat());
        System.out.println("Jenis Aves: " + jenisAves);
        System.out.println("Bisa Terbang: " + (bisaTerbang ? "Ya" : "Tidak"));
    }

    @Override
    public void makeSound() {
        System.out.println(getNama() + " berkicau merdu.");
    }
}

// Subclass Ayam
class Ayam extends Aves {
    private String jenisAyam;
    private boolean bisaDiadu;

    // Constructor
    public Ayam(String nama, int ukuran, String sifat, String jenisAves, boolean bisaTerbang, String jenisAyam, boolean bisaDiadu) {
        super(nama, ukuran, sifat, jenisAves, bisaTerbang);
        this.jenisAyam = jenisAyam;
        this.bisaDiadu = bisaDiadu;
    }

    public String getJenisAyam() {
        return jenisAyam;
    }

    public boolean getBisaDiadu() {
        return bisaDiadu;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jenis Ayam: " + jenisAyam);
        System.out.println("Bisa Diadu: " + (bisaDiadu ? "Ya" : "Tidak"));
    }
}

// Subclass Merpati
class Merpati extends Aves {
    public Merpati(String nama, int ukuran, String sifat, String jenisAves, boolean bisaTerbang) {
        super(nama, ukuran, sifat, jenisAves, bisaTerbang);
    }
}

public class Hewan {
    public static void main(String[] args) {
        // Objek Mamalia
        Mamalia kucing = new Mamalia("Kucing", 30, "Jinak", "Berlari", "Karnivora", 4, true);
        kucing.tampilInfo();
        kucing.makeSound();

        // Objek Aves
        Aves burungElang = new Aves("Elang", 50, "Ganas", "Burung Pemangsa", true);
        burungElang.tampilInfo();
        burungElang.makeSound();

        // Objek Ayam
        Ayam ayamJago = new Ayam("Ayam Jago", 40, "Agresif", "Unggas", false, "Jago", true);
        ayamJago.tampilInfo();
        ayamJago.makeSound();

        // Objek Merpati
        Merpati merpatiPos = new Merpati("Merpati Pos", 35, "Lembut", "Burung Pos", true);
        merpatiPos.tampilInfo();
        merpatiPos.makeSound();
    }
}
