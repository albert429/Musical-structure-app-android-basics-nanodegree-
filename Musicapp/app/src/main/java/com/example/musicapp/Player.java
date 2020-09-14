package com.example.musicapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Player extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        setTitle("Now playing");
    }

    public void Goback (View view){
        Intent goback = new Intent(Player.this,MainActivity.class);
        startActivity(goback);
    }
}