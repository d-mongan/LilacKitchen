package com.example.lilackitchen;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NotesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NotesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    static ArrayList<String> notes = new ArrayList<String>();
    static ArrayAdapter<String> arrayAdapter;
    public NotesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NotesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NotesFragment newInstance(String param1, String param2) {
        NotesFragment fragment = new NotesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notes2, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // initialise your views
        ListView listView = view.findViewById(R.id.listViewNotes);
        Button addNoteBtn = view.findViewById(R.id.addNote);
        //get saved notes
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("notes", Context.MODE_PRIVATE);
        HashSet<String> set = (HashSet<String>)sharedPreferences.getStringSet("notes", null);
        //add saved notes if any, otherwise start with example note
        if (set == null) {
            notes.add("Example Note");
        } else {
            notes = new ArrayList<>(set);
        }
        //create array adapter and link it listview
        arrayAdapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, notes);
        listView.setAdapter(arrayAdapter);


        //clicking list items to edit
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                MainActivity.fragmentPosition = MainActivity.viewPager2.getCurrentItem();
                Intent intent = new Intent(view.getContext(), NotesActivity.class);
                intent.putExtra("noteID", position);            //to tell us which row of listView was tapped
                startActivity(intent);
            }
        });
        //clicking add note button to add notes
        addNoteBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    MainActivity.fragmentPosition = MainActivity.viewPager2.getCurrentItem();
                    Intent intent = new Intent(v.getContext(), NotesActivity.class);
                    startActivity(intent);
            }
        });
        //long press list items to delete
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id)
            {
                new AlertDialog.Builder(getContext())
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Delete?")
                        .setMessage("Are you sure you want to delete this note?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                notes.remove(position);
                                arrayAdapter.notifyDataSetChanged();
                                //save array externally
                                //save changes externally
                                SharedPreferences sharedPreferences = getActivity().getApplicationContext().getSharedPreferences("notes", Context.MODE_PRIVATE);
                                HashSet<String> set = new HashSet<>(NotesFragment.notes);
                                sharedPreferences.edit().putStringSet("notes", set).apply();

                            }
                        })

                        .setNegativeButton("No", null)
                        .show();

                return true;
            }
        });

    }
}