package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {

    private String[] words;
    private Random random;
    private String currWord;
    private TextView[] charViews;
    private LinearLayout wordLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        words=getResources().getStringArray(R.array.words);
    }
    private void playGame(){
        String newWord=words[random.nextInt(words.length)];
        while(newWord.equals(currWord))newWord=words[random.nextInt(words.length)];
        currWord=newWord;
        charViews= new TextView[currWord.length()];

        for(int i=0; i<currWord.length(); i++){
            charViews[i]=new TextView(this);
            charViews[i].setText(currWord.charAt(i));
            charViews[i].setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
            charViews[i].setGravity(Gravity.CENTER);
            charViews[i].setTextColor(Color.WHITE);
            charViews[i].setBackgroundResource(com.google.android.material.R.drawable.abc_ic_star_black_16dp);
            wordLayout.addView(charViews[i]);
        }
    }
}