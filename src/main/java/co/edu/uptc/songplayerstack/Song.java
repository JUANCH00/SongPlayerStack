package co.edu.uptc.songplayerstack;

public class Song implements Comparable<Song>{
    private String name;
    private String artist;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return name +" "+ artist;
    }

    @Override
    public int compareTo(Song otherSong) {
        return this.name.compareTo(otherSong.getName());
    }
}
