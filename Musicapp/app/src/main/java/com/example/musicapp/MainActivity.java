package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Songs list");

        ArrayList<Artist_Album> words = new ArrayList<Artist_Album>();
        words.add(new Artist_Album("Jack", "Fire Song"));
        words.add(new Artist_Album("Katty", "Water Song"));
        words.add(new Artist_Album("James", "X Song"));
        words.add(new Artist_Album("Carla", "Wood"));
        words.add(new Artist_Album("Murshdelow", "March"));
        words.add(new Artist_Album("Leonardo", "The Song"));
        words.add(new Artist_Album("Rabbit DJ", "Electric Song"));
        words.add(new Artist_Album("Pete", "Pete rap Song"));
        words.add(new Artist_Album("Ninja", "lee Song"));


        ArtistAdapter adapter = new ArtistAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Song} object at the given position the user clicked on
                Artist_Album songSelected = (Artist_Album) adapterView.getItemAtPosition(position);
                Intent songDetail = new Intent(MainActivity.this, Player.class);
                songDetail.putExtra("title", songSelected.getSong());
                songDetail.putExtra("artist", songSelected.getArtist());
                startActivity(songDetail);
            }
        });
    }


}
