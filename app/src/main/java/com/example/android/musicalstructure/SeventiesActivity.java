package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SeventiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventies);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Eagles", "Hotel California", R.drawable.seventies_one));
        songs.add(new Song("Queen", "Bohemian Rhapsody", R.drawable.seventies_two));
        songs.add(new Song("Dire Straits", "Sultans of swing", R.drawable.seventies_three));
        songs.add(new Song("Supertramp", "The logical song", R.drawable.seventies_four));
        songs.add(new Song("Led Zeppelin", "Stairway to heaven", R.drawable.seventies_five));
        songs.add(new Song("Earth, Wind & Fire", "Boogie wonderland", R.drawable.seventies_six));
        songs.add(new Song("The Police", "Roxanne", R.drawable.seventies_seven));
        songs.add(new Song("The Buggles", "Video killed the radio star", R.drawable.seventies_eight));
        songs.add(new Song("The Knack", "My sharona", R.drawable.seventies_nine));
        songs.add(new Song("Boston", "More than a feeling", R.drawable.seventies_ten));




// Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter= new SongAdapter(this, songs, R.color.category_seventies);


// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);


        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

    }
}



