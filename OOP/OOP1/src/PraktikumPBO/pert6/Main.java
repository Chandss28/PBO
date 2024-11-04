package PraktikumPBO.pert6;

class DriverF1 {
    String name;
    String team;
    int wins;
    String country;

    public DriverF1(String name, String team, int wins, String country) {
        this.name = name;
        this.team = team;
        this.wins = wins;
        this.country = country;
    }

    public void displayInfo(boolean isFirst) {
        if (isFirst) {
            System.out.println("                    Forza Ferrari");
            System.out.println();
        }
        System.out.println("Nama              : " + name);
        System.out.println("Tim               : " + team);
        System.out.println("Jumlah Kemenangan : " + wins);
        System.out.println("Negara Asal       : " + country);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DriverF1 leclerc = new DriverF1("Charles Leclerc", "Scuderia Ferrari", 8, "Monako");
        DriverF1 sainz = new DriverF1("Carlos Sainz", "Scuderia Ferrari", 4, "Spanyol");

        leclerc.displayInfo(true);
        sainz.displayInfo(false);
    }
}
