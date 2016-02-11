package com.udacity.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static String EXTRA_JOKE_KEY = "extra_joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(EXTRA_JOKE_KEY);
        TextView tvJoke = (TextView) findViewById(R.id.tv_joke);
        if (joke != null && joke.length() != 0) {
            tvJoke.setText(joke);
        }

    }
}
