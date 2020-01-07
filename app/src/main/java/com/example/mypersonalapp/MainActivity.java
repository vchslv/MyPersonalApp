package com.example.mypersonalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

// main activity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMyData(View view) {
        Intent intentMyData = new Intent(this, MyData.class);
        startActivity(intentMyData);
    }

    public void showMyPhoto(View view) {
        Intent intentMyPhoto = new Intent(this, MyPhoto.class);
        startActivity(intentMyPhoto);
    }
}
