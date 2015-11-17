package com.example.lex.firstapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;

public class memory_game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_game);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            ScrollView scrollView = (ScrollView) findViewById(R.id.scrollview1);
            scrollView.setEnabled(false);
        }

        Button buttoncheck = (Button) findViewById(R.id.btnCheck);
        buttoncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),display1.class);
                startActivityForResult(intent,0);
            }
        });

    }

    public static final String PREFS_NAME = "MyPreferenceData";

    public void mouseClick(View view) {

        EditText b = (EditText)findViewById(R.id.TFage);
        EditText a = (EditText) findViewById(R.id.TFusername);
        String str = a.getText().toString();
        String string = b.getText().toString();

        SharedPreferences prefs = this.getSharedPreferences(PREFS_NAME,
                this.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("Username", str);
        editor.putString("Age", string);
        editor.commit();


        Intent i = new Intent(memory_game.this, display1.class);
        startActivity(i);


    }


}




