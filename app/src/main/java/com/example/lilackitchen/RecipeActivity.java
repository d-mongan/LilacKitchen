package com.example.lilackitchen;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Objects;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        // Define ActionBar object
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        // Define ColorDrawable object and parse color
        // using parseColor method
        // with color hash code as its parameter
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#FFFFFF"));
        // Set BackgroundDrawable
        actionBar.setBackgroundDrawable(colorDrawable);


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

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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

        int cakeTflour=0;
        int cakeTcornflour=0;
        int cakeTcastersugar=0;
        int cakeTbakingpowder=0;
        int cakeTbutter=0;
        int cakeTeggs=0;
        int cakeTmilk=0;
        int cakeTcanola=0;
        double cakeTvanillaextract=0.0;
        double cakeTvanillabeanpaste=0.0;
        if (fourInch > 0){
            cakeTflour = cakeTflour + (fourinflour * fourInch);
            cakeTcornflour = cakeTcornflour + (fourincornflour * fourInch);
            cakeTcastersugar = cakeTcastersugar + (fourincastersugar * fourInch);
            cakeTbakingpowder = cakeTbakingpowder + (fourinbakingpowder * fourInch);
            cakeTbutter = cakeTbutter + (fourinbutter * fourInch);
            cakeTeggs = cakeTeggs + (fourineggs * fourInch);
            cakeTmilk = cakeTmilk + (fourinmilk * fourInch);
            cakeTcanola = cakeTcanola + (fourincanola * fourInch);
            cakeTvanillaextract = cakeTvanillaextract + (fourinvanillaextract * fourInch);
            cakeTvanillabeanpaste = cakeTvanillabeanpaste + (fourinvanillabeanpaste * fourInch);
        }
        if (sixInch > 0){
            cakeTflour = cakeTflour + ((fourinflour*2) * sixInch);
            cakeTcornflour = cakeTcornflour + ((fourincornflour*2) * sixInch);
            cakeTcastersugar = cakeTcastersugar + ((fourincastersugar*2) * sixInch);
            cakeTbakingpowder = cakeTbakingpowder + ((fourinbakingpowder*2) * sixInch);
            cakeTbutter = cakeTbutter + ((fourinbutter*2) * sixInch);
            cakeTeggs = cakeTeggs + ((fourineggs*2) * sixInch);
            cakeTmilk = cakeTmilk + ((fourinmilk*2) * sixInch);
            cakeTcanola = cakeTcanola + ((fourincanola*2) * sixInch);
            cakeTvanillaextract = cakeTvanillaextract + ((fourinvanillaextract*2) * sixInch);
            cakeTvanillabeanpaste = cakeTvanillabeanpaste + ((fourinvanillabeanpaste*2) * sixInch);
        }
        if (sevenInch > 0){
            cakeTflour = (int) (cakeTflour + ((fourinflour*2.5) * sevenInch));
            cakeTcornflour = (int) (cakeTcornflour + ((fourincornflour*2.5) * sevenInch));
            cakeTcastersugar = (int) (cakeTcastersugar + ((fourincastersugar*2.5) * sevenInch));
            cakeTbakingpowder = (int) (cakeTbakingpowder + ((fourinbakingpowder*2.5) * sevenInch));
            cakeTbutter = (int) (cakeTbutter + ((fourinbutter*2.5) * sevenInch));
            cakeTeggs = (int) (cakeTeggs + ((fourineggs*2.5) * sevenInch));
            cakeTmilk = (int) (cakeTmilk + ((fourinmilk*2.5) * sevenInch));
            cakeTcanola = (int) (cakeTcanola + ((fourincanola*2.5) * sevenInch));
            cakeTvanillaextract = cakeTvanillaextract + ((fourinvanillaextract*2.5) * sevenInch);
            cakeTvanillabeanpaste = cakeTvanillabeanpaste + ((fourinvanillabeanpaste*2.5) * sevenInch);
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
        if (cuppies > 0){
            cakeTflour = cakeTflour + (sixflour * cuppies);
            cakeTcornflour = cakeTcornflour + (sixcornflour * cuppies);
            cakeTcastersugar = cakeTcastersugar + (sixcastersugar * cuppies);
            cakeTbakingpowder = cakeTbakingpowder + (sixbakingpowder * cuppies);
            cakeTbutter = cakeTbutter + (sixbutter * cuppies);
            cakeTeggs = cakeTeggs + (sixeggs * cuppies);
            cakeTmilk = cakeTmilk + (sixmilk * cuppies);
            cakeTcanola = cakeTcanola + (sixcanola * cuppies);
            cakeTvanillaextract = cakeTvanillaextract + (sixvanillaextract * cuppies);
            cakeTvanillabeanpaste = cakeTvanillabeanpaste + (sixvanillapaste * cuppies);
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}