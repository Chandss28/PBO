package PraktikumPBO.pert8Inheritance;

public class Hewan {
    protected String suara;

        public Hewan() {
            this.suara = "suara";
        }

        public void cetak(){
            System.out.println("Hewan Bersuara : " + suara);
        }
}

class Mamalia extends Hewan{
    protected String berkembangbiak;

    public Mamalia(){
        this.berkembangbiak = "beranak";
    }

    public void cetak(){
        System.out.println("Mamalia berkembangbiak : " + berkembangbiak);
    }
}

class Sapi extends Mamalia{
    private String nama;
    private String umur;

    public Sapi(){
        suara = "Moo";
        berkembangbiak = "beranak";
        this.nama = "sapy";
        this.umur = "2";
    }

    public void cetak(){
        System.out.println("Nama Sapi : " + nama);
        System.out.println("Umur Sapi : " + umur);
        System.out.println("Suara Sapi : " + suara);
        System.out.println("Sapi berkembangbiak : " + berkembangbiak);
    }
}

class Kambing extends Mamalia{
    private String nama;
    private String umur;

    public Kambing(){
        suara = "Mbee";
        berkembangbiak = "beranak";
        this.nama = "kambing";
        this.umur = "1";
    }
    public void cetak(){
        System.out.println("========== Data Hewan Mamalia Sapi ==========");
        System.out.println("Suara                 :"+suara);
        System.out.println("Berkembang Biak       :"+berkembangbiak);   
        System.out.println("Nama                  :"+nama);
        System.out.println("Umur                  :"+umur+" tahun");
    } 
}

class Unggas extends Hewan{
protected String berkembangbiak;

public Unggas(){
    this.berkembangbiak = "bertelur";
}

public void cetak(){
    System.out.println("Unggas berkembangbiak : " + berkembangbiak);
}
}

class Burung extends Unggas{
private String nama;
private String umur;

public Burung(){
    suara = "Cuit";
    berkembangbiak = "bertelur";
    this.nama = "burung";
    this.umur = "1";
}

    public void cetak(){
        System.out.println("Nama Burung : " + nama);
        System.out.println("Umur Burung : " + umur);
        System.out.println("Suara Burung : " + suara);
        System.out.println("Burung berkembangbiak : " + berkembangbiak);
    }
}

class Ayam extends Unggas{
private String nama;
private String umur;

public Ayam(){
    suara = "Kukuruyuk";
    berkembangbiak = "bertelur";
    this.nama = "ayam";
    this.umur = "1";
}

    public void cetak(){
        System.out.println("Nama Ayam : " + nama);
        System.out.println("Umur Ayam : " + umur);
        System.out.println("Suara Ayam : " + suara);
        System.out.println("Ayam berkembangbiak : " + berkembangbiak);
    }
}

class ikan extends Hewan{
protected String napas;

    public ikan(){
        this.napas = "insang";
    }

    public void cetak(){
        System.out.println("Insang");
    }
}

class Gurame extends ikan{
private String ciri;
private String berat;

public Gurame(){
    suara = "Tak ada";
    napas = "insang";
    this.ciri = "berbadan besar";
    this.berat = "2";
}

    public void cetak(){
        System.out.println("Ciri Gurame : " + ciri);
        System.out.println("Berat Gurame : " + berat);
        System.out.println("Suara Gurame : " + suara);
        System.out.println("Gurame bernapas dengan : " + napas);
    }
}

class lele extends ikan{
private String ciri;
private String berat;

public lele(){
    suara = "Tak ada";
    napas = "insang";
    this.ciri = "berbadan kecil";
    this.berat = "1";
}

    public void cetak(){
        System.out.println("Ciri Lele : " + ciri);
        System.out.println("Berat Lele : " + berat);
        System.out.println("Suara Lele : " + suara);
        System.out.println("Lele bernapas dengan : " + napas);
    }
}

class Pewarisan{
    public static void main (String[] args){
        Sapi sp1 = new Sapi();
        sp1.cetak();
                    System.out.println("");
        Kambing kg1 = new Kambing();
        kg1.cetak();
                    System.out.println("");
        Burung br1 = new Burung();
        br1.cetak();
                    System.out.println("");
        Ayam ay1 = new Ayam();
        ay1.cetak();
                    System.out.println("");
        Gurame gr1 = new Gurame();
        gr1.cetak();
                    System.out.println("");
        lele le1 = new lele();
        le1.cetak();
    }
}