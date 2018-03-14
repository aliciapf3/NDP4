package com.example.android.musicalstructure;

/**
 * {@link Song} represents a song with its correspondant artist
 * It contains an Artist name and a Song name.
 */


public class Song {

    /** Name of the artis */
    private String mArtistName;

    /** Name of the song */
    private String mSongName;

    /** Image resource ID for the song */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this song */
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Song object.
     *
     * @param artistName is the name of the artist which sings the song
     * @param songName is the name of the song
     */
    public Song(String artistName, String songName) {
        mArtistName = artistName;
        mSongName = songName;
    }


    /**
     * Create a new Song object.
     *
     * @param artistName is the name of the artist which sings the song
     * @param songName is the name of the song
     * @param imageResourceId is the drawable resource ID for the image associated with the song
     *
     */
    public Song(String artistName, String songName, int imageResourceId) {
        mArtistName = artistName;
        mSongName = songName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the artist.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the name of the song.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Return the image resource ID of the song.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this song.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}

