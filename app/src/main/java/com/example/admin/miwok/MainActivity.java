package com.example.admin.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.N;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openNumbersList(View view){
        Intent i = new Intent (this, Numbers.class);
        startActivity(i);
    }

    public void openFamilyList(View view){
        Intent i = new Intent (this, Family.class);
        startActivity(i);
    }
    public void openColorsList(View view){
        Intent i = new Intent (this, Colors.class);
        startActivity(i);
    }
    public void openPhrasesList(View view){
        Intent i = new Intent (this, Phrases.class);
        startActivity(i);
    }
}
