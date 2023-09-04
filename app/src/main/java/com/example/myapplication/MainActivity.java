package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerForContextMenu((TextView) findViewById(R.id.textView4));
    }
}
//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