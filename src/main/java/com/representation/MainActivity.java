package com.representation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import data.Database;
import measurements.Measurements;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Database.initalizeDatabase();
        Intent i = new Intent(this, Measurements.class);
        startActivity(i);
    }
}
