package com.example.lilackitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Objects;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        Intent intent = getIntent();
        int fourInch = intent.getIntExtra("fourInch",0);
        int sixInch = intent.getIntExtra("sixInch",0);
        int sevenInch = intent.getIntExtra("sevenInch",0);
        int cuppies = intent.getIntExtra("cuppies",0);
        String flavour = intent.getStringExtra("flavour");

        if (Objects.equals(flavour, "Vanilla")) {
            createVanillaRecipe(fourInch, sixInch, sevenInch, cuppies, flavour);
        } else if (Objects.equals(flavour, "Chocolate")){
            createChocolateRecipe(fourInch, sixInch, sevenInch, cuppies, flavour);
        } else if (Objects.equals(flavour, "Carrot")){
            createCarrotRecipe(fourInch, sixInch, sevenInch, cuppies, flavour);
        } else if (Objects.equals(flavour, "Lemon")){
            createLemonRecipe(fourInch, sixInch, sevenInch, cuppies, flavour);
        } else if (Objects.equals(flavour, "Banana")){
            createBananaRecipe(fourInch, sixInch, sevenInch, cuppies, flavour);
        } else if (Objects.equals(flavour, "Coffee")){
            createCoffeeRecipe(fourInch, sixInch, sevenInch, cuppies, flavour);
        }


    }

    private void createCoffeeRecipe(int fourInch, int sixInch, int sevenInch, int cuppies, String flavour) {
    }

    private void createBananaRecipe(int fourInch, int sixInch, int sevenInch, int cuppies, String flavour) {
    }

    private void createLemonRecipe(int fourInch, int sixInch, int sevenInch, int cuppies, String flavour) {
    }

    private void createCarrotRecipe(int fourInch, int sixInch, int sevenInch, int cuppies, String flavour) {
    }

    private void createChocolateRecipe(int fourInch, int sixInch, int sevenInch, int cuppies, String flavour) {
        //six inch is 1.5x 4 inch. 7 inch is 2 times 4 inch
        int fourinflour = 183;
        int sixinflour = 274;
        int seveninflour = 365;

    }

    public void createVanillaRecipe (int fourInch, int sixInch, int sevenInch, int cuppies, String flavour) {
        //six inch is double the four inch, 7 inch is 2.5x the 4 inch
        int fourinflour = 200;
        int fourincornflour = 40;
        int fourincastersugar = 170;
        int fourinbakingpowder = 14;
        int fourinbutter = 114;
        int fourineggs = 2;
        int fourinmilk = 148;
        int fourincanola = 40;
        double fourinvanillaextract = 0.6;
        double fourinvanillabeanpaste = 0.4;

        int cakeTflour;
        int cakeTcornflour;
        int cakeTcastersugar;
        int cakeTbakingpowder;
        int cakeTbutter;
        int cakeTeggs;
        int cakeTmilkl;
        int cakeTcanola;
        double cakeTvanillaextract;
        double cakeTvanillabeanpaste;
        if (fourInch > 0){

        }
        if (sixInch > 0){

        }
        if (sevenInch > 0){

        }

        //do cupcakes here
        int sixflour = 100;
        int sixcornflour = 20;
        int sixcastersugar = 85;
        int sixbakingpowder = 7;
        int sixbutter = 57;
        int sixeggs = 1;
        int sixmilk = 74;
        int sixcanola = 10;
        double sixvanillaextract = 0.3;
        double sixvanillapaste = 0.2;

    }

}