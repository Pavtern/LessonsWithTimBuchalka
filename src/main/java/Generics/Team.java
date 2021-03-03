package Generics;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private ArrayList<T> players;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<T>();
    }

    public boolean addPlayer(T player){
        if (players.contains(player)) {
            System.out.println(player.getName() + " is already in team " + this.name);
            return false;
        } else {
            players.add(player);
            System.out.println(player.getName() + " piked for team " + this.name);
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public List<T> getPlayers() {
        return players;
    }



    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String massage;
        if (ourScore > theirScore) {
            won++;
            massage = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            massage = " drew with ";
        } else {
            lost++;
            massage = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + massage + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return won * 2 + tied;
    }


    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(team.ranking(), this.ranking());
    }
}
