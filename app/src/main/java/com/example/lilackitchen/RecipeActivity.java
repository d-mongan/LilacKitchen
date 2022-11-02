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
import android.widget.TextView;

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

        int fourInch = intent.getIntExtra("fourInch",-1);
        int sixInch = intent.getIntExtra("sixInch",-1);
        int sevenInch = intent.getIntExtra("sevenInch",-1);
        int cuppies = intent.getIntExtra("cuppies",-1);
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
        int fourinbrownsugar = 300;
        int fourindutchcocoa = 60;
        int fourinbakingsoda = 8;
        int fourinbutter = 125;
        double fourincoffee = 0.5;
        int fourinwarmwater = 185;
        int fourineggs = 2;
        int fourincanola = 60;
        double fourinvanillaextract = 1;
        int fourinbuttermilk = 130;

        int cakeTflour=0;
        int cakeTbrownsugar=0;
        int cakeTdutchcocoa=0;
        int cakeTbakingsoda=0;
        int cakeTbutter=0;
        double cakeTcoffee=0.0;
        int cakeTwarmwater=0;
        int cakeTeggs=0;
        int cakeTcanola=0;
        double cakeTvanillaextract=0.0;
        int cakeTbuttermilk=0;
        if (fourInch > 0 ){
            cakeTflour = cakeTflour + (fourinflour * fourInch);
            cakeTbrownsugar = cakeTbrownsugar + (fourinbrownsugar * fourInch);
            cakeTdutchcocoa = cakeTdutchcocoa + (fourindutchcocoa * fourInch);
            cakeTbakingsoda = cakeTbakingsoda + (fourinbakingsoda * fourInch);
            cakeTbutter = cakeTbutter + (fourinbutter * fourInch);
            cakeTcoffee = cakeTcoffee + (fourincoffee * fourInch);
            cakeTwarmwater = cakeTwarmwater + (fourinwarmwater * fourInch);
            cakeTeggs = cakeTeggs + (fourineggs * fourInch);
            cakeTcanola = cakeTcanola + (fourincanola * fourInch);
            cakeTvanillaextract = cakeTvanillaextract + (fourinvanillaextract * fourInch);
            cakeTbuttermilk = cakeTbuttermilk + (fourinbuttermilk * fourInch);

        }
        if (sixInch > 0){
            cakeTflour = (int) (cakeTflour + ((fourinflour*1.5) * sixInch));
            cakeTbrownsugar = (int) (cakeTbrownsugar + ((fourinbrownsugar*1.5) * sixInch));
            cakeTdutchcocoa = (int) (cakeTdutchcocoa + ((fourindutchcocoa*1.5) * sixInch));
            cakeTbakingsoda = (int) (cakeTbakingsoda + ((fourinbakingsoda*1.5) * sixInch));
            cakeTbutter = (int) (cakeTbutter + ((fourinbutter*1.5) * sixInch));
            cakeTcoffee = cakeTcoffee + ((fourincoffee*1.5) * sixInch);
            cakeTwarmwater = (int) (cakeTwarmwater + ((fourinwarmwater*1.5) * sixInch));
            cakeTeggs = (int) (cakeTeggs + ((fourineggs*1.5) * sixInch));
            cakeTcanola = (int) (cakeTcanola + ((fourincanola*1.5) * sixInch));
            cakeTvanillaextract = cakeTvanillaextract + ((fourinvanillaextract*1.5) * sixInch);
            cakeTbuttermilk = (int) (cakeTbuttermilk + ((fourinbuttermilk*1.5) * sixInch));
        }
        if (sevenInch > 0){
            cakeTflour = cakeTflour + ((fourinflour*2) * sevenInch);
            cakeTbrownsugar = cakeTbrownsugar + ((fourinbrownsugar*2) * sevenInch);
            cakeTdutchcocoa = cakeTdutchcocoa + ((fourindutchcocoa*2) * sevenInch);
            cakeTbakingsoda = cakeTbakingsoda + ((fourinbakingsoda*2) * sevenInch);
            cakeTbutter = cakeTbutter + ((fourinbutter*2) * sevenInch);
            cakeTcoffee = cakeTcoffee + ((fourincoffee*2) * sevenInch);
            cakeTwarmwater = cakeTwarmwater + ((fourinwarmwater*2) * sevenInch);
            cakeTeggs = cakeTeggs + ((fourineggs*2) * sevenInch);
            cakeTcanola = cakeTcanola + ((fourincanola*2) * sevenInch);
            cakeTvanillaextract = cakeTvanillaextract + ((fourinvanillaextract*2) * sevenInch);
            cakeTbuttermilk = cakeTbuttermilk + ((fourinbuttermilk*2) * sevenInch);
        }
        //cupcakes
        int sixflour = 183;
        int sixbrownsugar = 300;
        int sixdutchcocoa = 60;
        int sixbakingsoda = 8;
        int sixbutter = 125;
        double sixcoffee = 0.5;
        int sixwarmwater = 185;
        int sixeggs = 2;
        int sixcanola = 60;
        double sixvanillaextract = 1;
        int sixbuttermilk = 130;
        int cuppiemultiplier = cuppies/6;
        if(cuppies > 0){
            cakeTflour = cakeTflour + (sixflour * cuppiemultiplier);
            cakeTbrownsugar = cakeTbrownsugar + (sixbrownsugar * cuppiemultiplier);
            cakeTdutchcocoa = cakeTdutchcocoa + (sixdutchcocoa * cuppiemultiplier);
            cakeTbakingsoda = cakeTbakingsoda + (sixbakingsoda * cuppiemultiplier);
            cakeTbutter = cakeTbutter + (sixbutter * cuppiemultiplier);
            cakeTcoffee = cakeTcoffee + (sixcoffee * cuppiemultiplier);
            cakeTwarmwater = cakeTwarmwater + (sixwarmwater * cuppiemultiplier);
            cakeTeggs = cakeTeggs + (sixeggs * cuppiemultiplier);
            cakeTcanola = cakeTcanola + (sixcanola * cuppiemultiplier);
            cakeTvanillaextract = cakeTvanillaextract + (sixvanillaextract * cuppiemultiplier);
            cakeTbuttermilk = cakeTbuttermilk + (sixbuttermilk * cuppiemultiplier);
        }
        //output to string
        String output = "";
        if(fourInch > 0){
            output = output + "Four Inch " + flavour.toString() + " Cake x"+ Integer.toString(fourInch) +"\n";
        }
        if(sixInch > 0){
            output = output + "Six Inch " + flavour.toString() + " Cake x"+ Integer.toString(sixInch) +"\n";
        }
        if(sevenInch > 0){
            output = output + "Seven Inch " + flavour.toString() + " Cake x"+ Integer.toString(sevenInch) +"\n";
        }
        if(cuppies > 0){
            output = output + flavour.toString() + " Cupcakes x"+ Integer.toString(cuppies) +"\n";
        }
        if(fourInch > 0 || sixInch > 0 || sevenInch > 0){
            output = output + "Oven Temp:170\u00B0C\n";
        }
        if (cuppies > 0 && fourInch == 0 && sixInch == 0 && sevenInch == 0){
            output = output + "Oven Temp:160\u00B0C\n";
        }
        output = output + "\n"+Integer.toString(cakeTflour)+"g Flour\n";
        output = output + Integer.toString(cakeTbrownsugar)+"g Brown Sugar\n";
        output = output + Integer.toString(cakeTdutchcocoa)+"g Dutch Cocoa\n";
        output = output + Integer.toString(cakeTbakingsoda)+"g Baking Soda\n";
        output = output + Integer.toString(cakeTbutter)+"g Butter\n";
        output = output + Double.toString(Math.round(cakeTcoffee * 100.0) / 100.0) +" tsp Coffee\n";
        output = output + Integer.toString(cakeTwarmwater)+"g Warm Water\n";
        output = output + Integer.toString(cakeTeggs)+" Eggs\n";
        output = output + Integer.toString(cakeTcanola)+"g Canola Oil\n";
        output = output + Double.toString(Math.round(cakeTvanillaextract * 100.0) / 100.0) +" tsp Vanilla Extract\n";
        output = output + Integer.toString(cakeTbuttermilk)+"g Buttermilk\n";
        TextView recipeTextView = findViewById(R.id.recipetextView);
        recipeTextView.setText(output);

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
        int cuppieMultiplier = cuppies/6;
        if (cuppies > 0){
            cakeTflour = cakeTflour + (sixflour * cuppieMultiplier);
            cakeTcornflour = cakeTcornflour + (sixcornflour * cuppieMultiplier);
            cakeTcastersugar = cakeTcastersugar + (sixcastersugar * cuppieMultiplier);
            cakeTbakingpowder = cakeTbakingpowder + (sixbakingpowder * cuppieMultiplier);
            cakeTbutter = cakeTbutter + (sixbutter * cuppieMultiplier);
            cakeTeggs = cakeTeggs + (sixeggs * cuppieMultiplier);
            cakeTmilk = cakeTmilk + (sixmilk * cuppieMultiplier);
            cakeTcanola = cakeTcanola + (sixcanola * cuppieMultiplier);
            cakeTvanillaextract = cakeTvanillaextract + (sixvanillaextract * cuppieMultiplier);
            cakeTvanillabeanpaste = cakeTvanillabeanpaste + (sixvanillapaste * cuppieMultiplier);
        }
        /* output values in formatted string to textview */
        String output = "";
        if(fourInch > 0){
            output = output + "Four Inch " + flavour.toString() + " Cake x"+ Integer.toString(fourInch) +"\n";
        }
        if(sixInch > 0){
            output = output + "Six Inch " + flavour.toString() + " Cake x"+ Integer.toString(sixInch) +"\n";
        }
        if(sevenInch > 0){
            output = output + "Seven Inch " + flavour.toString() + " Cake x"+ Integer.toString(sevenInch) +"\n";
        }
        if(cuppies > 0){
            output = output + flavour.toString() + " Cupcakes x"+ Integer.toString(cuppies) +"\n";
        }
        if(fourInch > 0 || sixInch > 0 || sevenInch > 0){
            output = output + "Oven Temp:170\u00B0C\n";
        }
        if (cuppies > 0 && fourInch == 0 && sixInch == 0 && sevenInch == 0){
            output = output + "Oven Temp:160\u00B0C\n";
        }
        output = output + "\n"+Integer.toString(cakeTflour)+"g Flour\n";
        output = output + Integer.toString(cakeTcornflour)+"g Cornflour\n";
        output = output + Integer.toString(cakeTcastersugar)+"g Caster Sugar\n";
        output = output + Integer.toString(cakeTbakingpowder) +"g Baking Powder\n";
        output = output + Integer.toString(cakeTbutter) +"g Butter\n";
        output = output + Integer.toString(cakeTeggs) + " Eggs\n";
        output = output + Integer.toString(cakeTmilk) + "g Milk\n";
        output = output + Integer.toString(cakeTcanola) + "g Canola Oil\n";
        output = output + Double.toString(Math.round(cakeTvanillaextract * 100.0) / 100.0) + " tsp Vanilla Extract\n";
        output = output + Double.toString(Math.round(cakeTvanillabeanpaste * 100.0) / 100.0) + " tsp Vanilla Paste\n";
        TextView recipeTextView = findViewById(R.id.recipetextView);
        recipeTextView.setText(output);
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