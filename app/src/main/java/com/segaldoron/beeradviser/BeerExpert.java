package com.segaldoron.beeradviser;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dsegal on 11/28/15.
 */


public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        switch (color.toLowerCase()){
            case "light":
                brands.add("Jail Pale Ale");
                brands.add("Gout Stout");
                break;
            case "amber":
                brands.add("Jack Amber");
                brands.add("Red Moose");
                break;
            case "brown":
                brands.add("brown Ale");
                brands.add("brown Stout");
                break;
            case "dark":
                brands.add("darky");
                brands.add("dark maniac");
                break;
            default:
                brands.add("Unknown");
                break;
        }

        return brands;
    }

}
