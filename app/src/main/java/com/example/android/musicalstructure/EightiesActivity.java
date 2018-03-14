package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EightiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighties);

        // Create a list of words
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Eurythmics", "Sweet dreams", R.drawable.eighties_one));
        songs.add(new Song("Michael Jackson", "Billie Jean", R.drawable.eighties_two));
        songs.add(new Song("Queen", "Another one bites the dust", R.drawable.eighties_three));
        songs.add(new Song("Kim Carnes", "Bette Davis eyes", R.drawable.eighties_four));
        songs.add(new Song("Alphaville", "Forever young", R.drawable.eighties_five));
        songs.add(new Song("Kenny Loggins", "Footloose", R.drawable.eighties_six));
        songs.add(new Song("Aha", "Take on me", R.drawable.eighties_seven));
        songs.add(new Song("Cyndi Lauper", "Girls just want to have fun", R.drawable.eighties_eight));
        songs.add(new Song("Guns & Roses", "Sweet child of mine", R.drawable.eighties_nine));
        songs.add(new Song("Rick Ashley", "Never gonna give you up", R.drawable.eighties_ten));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_eighties);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);
    }
}