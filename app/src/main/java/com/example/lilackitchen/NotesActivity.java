package com.example.lilackitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class NotesActivity extends AppCompatActivity {
    int noteID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);


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
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

    }


}