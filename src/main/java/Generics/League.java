package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Player> {
    private String name;
    private ArrayList<Team<T>> teams;

    public String getName() {
        return name;
    }

    private void sort(){
        Collections.sort(teams);
    }

    public void print(){
        this.sort();
        for (Team t : teams){
            System.out.println(t.getName() + ": " + t.ranking() + " points");
        }
    }

    public boolean add(Team<T> team) {
        return teams.add(team);
    }

    public League(String name) {
        this.name = name;
        teams = new ArrayList<>();
    }
}
