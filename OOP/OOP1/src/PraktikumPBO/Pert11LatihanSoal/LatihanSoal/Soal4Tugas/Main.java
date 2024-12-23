package PraktikumPBO.Pert11LatihanSoal.LatihanSoal.Soal4Tugas;

abstract class Team {
    protected String teamName;
    protected String principal;

    public Team(String teamName, String principal) {
        this.teamName = teamName;
        this.principal = principal;
    }

    public abstract void showTeamDetails();

    public String getTeamName() {
        return teamName;
    }

    public String getPrincipal() {
        return principal;
    }
}

interface Performance {
    void calculatePoints(int wins, int podiums, int fastestLaps);
    void displayPerformance();
}

class F1Team extends Team implements Performance {
    private int wins;
    private int podiums;
    private int fastestLaps;
    private int totalPoints;

    public F1Team(String teamName, String principal) {
        super(teamName, principal);
        this.wins = 0;
        this.podiums = 0;
        this.fastestLaps = 0;
        this.totalPoints = 0;
    }

    @Override
    public void showTeamDetails() {
        System.out.println("Team: " + teamName);
        System.out.println("Principal: " + principal);
    }

    @Override
    public void calculatePoints(int wins, int podiums, int fastestLaps) {
        this.wins = wins;
        this.podiums = podiums;
        this.fastestLaps = fastestLaps;
        this.totalPoints = (wins * 25) + (podiums * 15) + (fastestLaps * 1);
    }

    @Override
    public void displayPerformance() {
        System.out.println("Team: " + teamName);
        System.out.println("Wins: " + wins);
        System.out.println("Podiums: " + podiums);
        System.out.println("Fastest Laps: " + fastestLaps);
        System.out.println("Total Points: " + totalPoints);
    }
}

public class Main {
    public static void main(String[] args) {
        F1Team[] teams = {
            new F1Team("Red Bull Racing", "Christian Horner"),
            new F1Team("Mercedes AMG", "Toto Wolff"),
            new F1Team("Ferrari", "Frederic Vasseur"),
            new F1Team("McLaren", "Andrea Stella"),
            new F1Team("Aston Martin", "Mike Krack")
        };

        teams[0].calculatePoints(18, 10, 5);
        teams[1].calculatePoints(12, 15, 3);
        teams[2].calculatePoints(10, 8, 4);
        teams[3].calculatePoints(5, 7, 2);
        teams[4].calculatePoints(7, 6, 1);

        for (F1Team team : teams) {
            team.showTeamDetails();
            team.displayPerformance();
            System.out.println("----------------------");
        }
    }
}