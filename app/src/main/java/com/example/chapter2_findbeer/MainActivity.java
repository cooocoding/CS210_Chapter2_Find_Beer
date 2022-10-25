package com.example.chapter2_findbeer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

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
        List<String> brandsList = expert.getBrands(selectedBeerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand:brandsList){
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
    }
}