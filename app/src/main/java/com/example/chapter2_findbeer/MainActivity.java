package com.example.chapter2_findbeer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view){

        Spinner color = (Spinner) findViewById(R.id.color);
        String selectedBeerType = String.valueOf(color.getSelectedItem());
        TextView brands = (TextView) findViewById(R.id.brands);
        brands.setText(selectedBeerType);
    }
}