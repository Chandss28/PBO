package PraktikumPBO.Pert12Quiz;

interface Transportasi {
    int getId();
    void setData(int id, String nama, int jarak);
    void tampil();
}

class Gojek implements Transportasi {
    private int harga = 5000;
    private int id;
    private String nama;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setData(int id, String nama, int jarak) {
        this.id = id;
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public void tampil() {
        System.out.println("ID: " + id);
        System.out.println("Harga: " + harga);
        System.out.println("Nama: " + nama);
    }
}

class Bayar extends Gojek {
    private int jarak;
    private int total;

    @Override
    public void setData(int id, String nama, int jarak) {
        super.setData(id, nama, jarak);
        this.jarak = jarak;
        this.total = getHarga() * jarak;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Total: Rp. " + total);
    }
}

public class Gojekk {
    public static void main(String[] args) {
        Bayar bayar1 = new Bayar();
        bayar1.setData(1, "Roni", 15);

        Bayar bayar2 = new Bayar();
        bayar2.setData(1, "Doni", 10);

        System.out.println("Data Bayar 1:");
        bayar1.tampil();

        System.out.println("\nData Bayar 2:");
        bayar2.tampil();
    }
}
