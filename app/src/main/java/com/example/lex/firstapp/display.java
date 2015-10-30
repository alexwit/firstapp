package com.example.lex.firstapp;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Papi lexus on 30-10-2015.
 */
public class display extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        String username = getIntent().getStringExtra("Username");
    }
}
