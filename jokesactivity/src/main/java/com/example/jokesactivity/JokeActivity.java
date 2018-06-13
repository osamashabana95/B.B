package com.example.jokesactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView textView = (TextView) findViewById(R.id.jokes_text);
        Intent intent= getIntent();
        String joke = intent.getStringExtra(Intent.EXTRA_TEXT);
        textView.setText(joke);
    }

}
