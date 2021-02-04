package ArrayColl.LinkedList.Second;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    private ArrayList<Album> albums;
    private LinkedList<Song> playlist;
    private Song song;

    public Playlist() {
        albums = new ArrayList<>();
        playlist = new LinkedList<>();
    }

    public boolean addSong(String name) {
        for (int i = 0; i < albums.size(); i++) {
            Album currentAlbum = albums.get(i);
            for (int j = 0; j < currentAlbum.getSongs().size(); j++) {
                Song currentSong = currentAlbum.getSongs().get(j);
                if(currentSong.getSongTitle().equals(name)){
                    playlist.add(new Song(name, currentSong.getDuration()));
                    System.out.println("Song " + name + " added from album " + currentAlbum.getName());
                    return true;
                }
            }
        }
        return false;
    }


    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(LinkedList<Song> playlist) {
        this.playlist = playlist;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}
