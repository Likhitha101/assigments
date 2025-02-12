package javaassignments;
import java.util.Scanner;

class Player2 {
    private int id;
    private String name;
    private int iccRank;
    private int matchesPlayed;
    private int runsScored;

    public Player2(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getIccRank() {
        return iccRank;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }
}

class Solution {
    public static double[] findAverageOfRuns(Player2[] players, int target) {
        return Arrays.stream(players)
                .filter(player -> player.getMatchesPlayed() <= target)
                .mapToDouble(player -> (double) player.getRunsScored() / player.getMatchesPlayed())
                .toArray();
    }
}

public class CricketPlayerManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player2[] players = new Player2[4];

        for (int i = 0; i < 4; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            int iccRank = scanner.nextInt();
            int matchesPlayed = scanner.nextInt();
            int runsScored = scanner.nextInt();
            players[i] = new Player2(id, name, iccRank, matchesPlayed, runsScored);
        }

        int target = scanner.nextInt();
        double[] averages = Solution.findAverageOfRuns(players, target);

        for (double averageRun : averages) {
            if (averageRun >= 80) {
                System.out.println("Grade A");
            } else if (averageRun >= 50) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }
        }

        scanner.close();
    }
}

