package com.example.chapter2_findbeer;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
   public BeerExpert() {
   }

        List<String> getBrands(String color){
       List<String> bands = new ArrayList<>();

        if(color.equals("amber")){
            bands.add("Jack Amber");
            bands.add("Red Moose");
        }else{
            bands.add("Jail pale Ale");
            bands.add("Gout Stout");
        }

        return bands;
    }

}
