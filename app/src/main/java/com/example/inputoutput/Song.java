package com.example.inputoutput;

/**
 * This class models a Song consisting of a title, artist, and year produced
 */
public class Song {

    private String title;
    private String artist;
    private int year;

    /**
     * Constructs a Song object with a given title, artist, and year
     * @param title the title of the song
     * @param artist the artist(s) of the song
     * @param year the year the song was produced
     */
    public Song(String title, String artist, int year){
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    /**
     * Gets the title of the song
     * @return the title of the song
     */
    public String getTitle() {return title;}

    /**
     * Gets the artist of the song
     * @return the artist of the song
     */
    public String getArtist() {return artist;}

    /**
     * Gets the year the song was produced
     * @return the year
     */
    public int getYear() {return year;}
}
