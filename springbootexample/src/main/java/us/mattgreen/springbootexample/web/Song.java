package us.mattgreen.springbootexample.web;

public class Song {
    private String name;
    private String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getartist() {
        return artist;
    }

    public void setartist(String artist) {
        this.artist = artist;
    }
}
