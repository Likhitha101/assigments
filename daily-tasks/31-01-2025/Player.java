package javaassignments;
import java.util.Scanner;
public class Player {
	    private int playerId;
	    private String skill;
	    private String level;
	    private int points;
	    public Player(int playerId, String skill, String level, int points) {
	        this.playerId = playerId;
	        this.skill = skill;
	        this.level = level;
	        this.points = points;
	    }
	    public int getPlayerId() {
	        return playerId;
	    }
        public String getSkill() {
	        return skill;
	    }

	    public String getLevel() {
	        return level;
	    }

	    public int getPoints() {
	        return points;
	    }
	    public void setPlayerId(int playerId) {
	        this.playerId = playerId;
	    }

	    public void setSkill(String skill) {
	        this.skill = skill;
	    }

	    public void setLevel(String level) {
	        this.level = level;
	    }

	    public void setPoints(int points) {
	        this.points = points;
	    }
	}

	class Solution {
	    public static int findPointsForGivenSkill(Player[] players, String skill) {
	        int totalPoints = 0;
	        for (Player player : players) {
	            if (player.getSkill().equalsIgnoreCase(skill)) {
	                totalPoints += player.getPoints();
	            }
	        }
	        return totalPoints;
	    }
	    public static Player getPlayerBasedOnLevel(String level, String skill, Player[] players) {
	        for (Player player : players) {
	            if (player.getLevel().equalsIgnoreCase(level) && player.getSkill().equalsIgnoreCase(skill) && player.getPoints() >= 20) {
	                return player;
	            }
	        }
	        return null;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Player[] players = new Player[4];
	        for (int i = 0; i < 4; i++) {
	            int playerId = sc.nextInt();
	            sc.nextLine();  
	            String skill = sc.nextLine();
	            String level = sc.nextLine();
	            int points = sc.nextInt();
	            sc.nextLine();  
	            players[i] = new Player(playerId, skill, level, points);
	        }
	        String skill = sc.nextLine();
	        String level = sc.nextLine();
	        int pointsForSkill = findPointsForGivenSkill(players, skill);
	        if (pointsForSkill > 0) {
	            System.out.println(pointsForSkill);
	        } else {
	            System.out.println("The given Skill is not available");
	        }
	        Player playerForLevel = getPlayerBasedOnLevel(level, skill, players);
	        if (playerForLevel != null) {
	            System.out.println(playerForLevel.getPlayerId());
	        } else {
	            System.out.println("No player is available with specified level, skill and eligibility points");
	        }

	        sc.close();
	    }
	}


