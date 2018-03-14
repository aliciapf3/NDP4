package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the seventies category
        TextView seventies = (TextView) findViewById(R.id.seventies);

        // Set a click listener on that View
        seventies.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                //Create a new intent to open the {@Link SeventiesActivity}
                Intent seventiesIntent = new Intent(MainActivity.this, SeventiesActivity.class);

                //Start the new activity
                startActivity(seventiesIntent);
            }
        });

        // Find the View that shows the eighties category
        TextView eighties = (TextView) findViewById(R.id.eighties);

        // Set a click listener on that View
        eighties.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                //Create a new intent to open the {@Link EightiesActivity}
                Intent eightiesIntent = new Intent(MainActivity.this, EightiesActivity.class);

                //Start the new activity
                startActivity(eightiesIntent);
            }
        });

        // Find the View that shows the nineties category
        TextView nineties = (TextView) findViewById(R.id.nineties);

        // Set a click listener on that View
        nineties.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                //Create a new intent to open the {@Link NinetiesActivity}
                Intent ninetiesIntent = new Intent(MainActivity.this, NinetiesActivity.class);

                //Start the new activity
                startActivity(ninetiesIntent);
            }
        });


    }


    public void openSeventiesList(View view) {
        Intent i = new Intent(this, SeventiesActivity.class);
        startActivity(i);

    }
}
