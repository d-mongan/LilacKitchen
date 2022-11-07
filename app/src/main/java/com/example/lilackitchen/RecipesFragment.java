package com.example.lilackitchen;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;


public class RecipesFragment extends Fragment  {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public RecipesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RecipesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RecipesFragment newInstance(String param1, String param2) {
        RecipesFragment fragment = new RecipesFragment();
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

            //initializations here


        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipes, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        // initialise your views
        Spinner spinnerFlavour = view.findViewById(R.id.spinnerFlavour);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(getActivity(), R.array.RecipeFlavours, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerFlavour.setAdapter(adapter);
        Button addBtn4in = view.findViewById(R.id.addBtn);
        Button addBtn6in = view.findViewById(R.id.addBtn2);
        Button addBtn7in = view.findViewById(R.id.addBtn3);
        Button addBtnCuppies = view.findViewById(R.id.addBtn4);
        Button removeBtn4in = view.findViewById(R.id.removeBtn);
        Button removeBtn6in = view.findViewById(R.id.removeBtn2);
        Button removeBtn7in = view.findViewById(R.id.removeBtn3);
        Button removeBtnCuppies = view.findViewById(R.id.removeBtn4);
        Button createRecipe = view.findViewById(R.id.btnCreate);
        TextView textView4in = view.findViewById(R.id.itemQuanEt);
        TextView textView6in = view.findViewById(R.id.itemQuanEt2);
        TextView textView7in = view.findViewById(R.id.itemQuanEt3);
        TextView textViewCuppies = view.findViewById(R.id.itemQuanEt4);


        //onClick logic
        addBtn4in.setOnClickListener(v ->
            {
                // click handling code
                int i = Integer.parseInt((String)textView4in.getText());
                i = i+1;
                textView4in.setText(Integer.toString(i));
            });
        addBtn6in.setOnClickListener(v ->
        {
            // click handling code
            int i = Integer.parseInt((String)textView6in.getText());
            i = i+1;
            textView6in.setText(Integer.toString(i));
        });
        addBtn7in.setOnClickListener(v ->
        {
            // click handling code
            int i = Integer.parseInt((String)textView7in.getText());
            i = i+1;
            textView7in.setText(Integer.toString(i));
        });
        addBtnCuppies.setOnClickListener(v ->
        {
            // click handling code
            int i = Integer.parseInt((String)textViewCuppies.getText());
            i = i+6;
            textViewCuppies.setText(Integer.toString(i));
        });

        removeBtn4in.setOnClickListener(v ->
        {
            // click handling code
            int i = Integer.parseInt((String)textView4in.getText());
            if (i > 0) {
                i = i - 1;
            } else
                {i = 0;}
            textView4in.setText(Integer.toString(i));
        });
        removeBtn6in.setOnClickListener(v ->
        {
            // click handling code
            int i = Integer.parseInt((String)textView6in.getText());
            if (i > 0) {
                i = i - 1;
            } else
            {i = 0;}
            textView6in.setText(Integer.toString(i));
        });
        removeBtn7in.setOnClickListener(v ->
        {
            // click handling code
            int i = Integer.parseInt((String)textView7in.getText());
            if (i > 0) {
                i = i - 1;
            } else
            {i = 0;}
            textView7in.setText(Integer.toString(i));
        });
        removeBtnCuppies.setOnClickListener(v ->
        {
            // click handling code
            int i = Integer.parseInt((String)textViewCuppies.getText());
            if (i > 0) {
                i = i - 6;
            } else
            {i = 0;}
            textViewCuppies.setText(Integer.toString(i));
        });
        createRecipe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                MainActivity.fragmentPosition = MainActivity.viewPager2.getCurrentItem();
                final int fourInch = Integer.parseInt(textView4in.getText().toString());
                final int sixInch = Integer.parseInt(textView6in.getText().toString());
                final int sevenInch = Integer.parseInt(textView7in.getText().toString());
                final int cuppies = Integer.parseInt(textViewCuppies.getText().toString());
                final String flavour = spinnerFlavour.getSelectedItem().toString();
                Intent intent = new Intent(v.getContext(), RecipeActivity.class);
                intent.putExtra("fourInch", fourInch);
                intent.putExtra("sixInch", sixInch);
                intent.putExtra("sevenInch", sevenInch);
                intent.putExtra("cuppies", cuppies);
                intent.putExtra("flavour", flavour);
                startActivity(intent);

            }
        });

    }

}