package PraktikumPBO.Pert9.Pegawai;

public class Manager extends Pegawai {
    @Override
    public void menampilkan()
    {
        System.out.println("Nama : "+nama);
        System.out.println("Id_Pegawai : "+id_pegawai);
        System.out.println("Gaji : "+gaji);
    }

    public void tugas(){
        System.out.println("Tugas : Melakukan manajemen untuk franchise");
        System.out.println("-----------------------------------------------");
    }
}
