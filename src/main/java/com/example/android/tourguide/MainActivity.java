package com.example.android.tourguide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("New Delhi"));
        words.add(new Word("Kolkata"));
        words.add(new Word("Mumbai"));
        words.add(new Word("Chennai"));
        words.add(new Word("Banglore"));
        words.add(new Word("Pune"));
        words.add(new Word("Ahemdabad"));
        words.add(new Word("Jamshedpur"));
        words.add(new Word("Patna"));
        words.add(new Word("Prayagraj"));
        words.add(new Word("Lucknow"));
        words.add(new Word("Ladakh"));
        words.add(new Word("Ranchi"));
        words.add(new Word("Bhopal"));

        WordAdaptor Adapter = new WordAdaptor(this, words);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(Adapter);



    }



}