package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NinetiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineties);

        // Create a list of words
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("The Cranberries", "Zombie", R.drawable.nineties_one));
        songs.add(new Song("Oasis", "Wonderwall", R.drawable.nineties_two));
        songs.add(new Song("The verve", "Bitter sweet simplhony", R.drawable.nineties_three));
        songs.add(new Song("REM", "Losing my religion", R.drawable.nineties_four));
        songs.add(new Song("Metallica", "Nothing else matters", R.drawable.nineties_five));
        songs.add(new Song("No doubt", "Just a girl", R.drawable.nineties_six));
        songs.add(new Song("Depeche Mode", "Personal Jesus", R.drawable.nineties_seven));
        songs.add(new Song("Soul Asylum", "Runaway train", R.drawable.nineties_eight));
        songs.add(new Song("The breeders ", "Cannonball", R.drawable.nineties_nine));
        songs.add(new Song("Green day", "Welcome to paradise", R.drawable.nineties_ten));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_nineties);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);
    }
}