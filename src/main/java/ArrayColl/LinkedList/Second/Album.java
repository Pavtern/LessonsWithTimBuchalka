package ArrayColl.LinkedList.Second;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs;
    private String name;

    public Album(String name) {
        songs = new ArrayList<>();
        this.name = name;
    }

    public boolean addSong(String name, double duration) {
        for (int i = 0; i < songs.size(); i++) {
            String currentSong = songs.get(i).getSongTitle();
            if (currentSong.equals(name)) {
                System.out.println("Song " + name + " is already exists.");
                return false;
            }
        }
        songs.add(new Song(name, duration));
        return true;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
