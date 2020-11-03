package com.example.android.tourguide;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



import java.util.ArrayList;

public class WordAdaptor extends ArrayAdapter<Word> {



    public WordAdaptor(MainActivity context, ArrayList<Word> words) {

        super(context, 0, words);
    }


    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.mainlayout, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.textView);
        miwokTextView.setText(currentWord.getcityName());




        return listItemView;
    }
}
