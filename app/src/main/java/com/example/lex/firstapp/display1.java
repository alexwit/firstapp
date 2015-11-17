package com.example.lex.firstapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class display1 extends AppCompatActivity {

    public static final String PREFS_NAME = "MyPreferenceData";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display1);
        TextView tv = (TextView)findViewById(R.id.TVusername);
        TextView av = (TextView)findViewById(R.id.TVage);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 2);

        tv.setText(settings.getString("Username", "No name"));
        av.setText(settings.getString("Age", "No age"));

    }
}
