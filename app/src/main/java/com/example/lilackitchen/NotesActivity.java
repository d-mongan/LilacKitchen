package com.example.lilackitchen;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;

import java.util.HashSet;

public class NotesActivity extends AppCompatActivity {
    int noteID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

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

        EditText editText = (EditText)findViewById(R.id.editTextTextMultiLine);
        Intent intent = getIntent();
        noteID = intent.getIntExtra("noteID", -1);         //default value is -1 (in case of intent error)
        //set edittext field to value from the array
        if(noteID != -1)
        {
            editText.setText(NotesFragment.notes.get(noteID));
        }
        else
        {
            NotesFragment.notes.add("");                // as initially, the note is empty
            noteID = NotesFragment.notes.size() - 1;
            NotesFragment.arrayAdapter.notifyDataSetChanged();
        }
        //edittext listener for changes to the text, saves them back to the array
        editText.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                NotesFragment.notes.set(noteID, String.valueOf(s));
                NotesFragment.arrayAdapter.notifyDataSetChanged();
                //save changes externally
                SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("notes", Context.MODE_PRIVATE);
                HashSet<String> set = new HashSet<>(NotesFragment.notes);
                sharedPreferences.edit().putStringSet("notes", set).apply();
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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