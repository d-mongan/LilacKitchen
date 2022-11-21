package com.example.lilackitchen;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OtherRecipesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OtherRecipesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public OtherRecipesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OtherRecipesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OtherRecipesFragment newInstance(String param1, String param2) {
        OtherRecipesFragment fragment = new OtherRecipesFragment();
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
        return inflater.inflate(R.layout.fragment_other_recipes, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // initialise your views
        Spinner spinnerFlavour = view.findViewById(R.id.spinnerFlavour);
        //ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(getActivity(), R.array.RecipeFlavours, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Recipes, R.layout.spinner_style);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        spinnerFlavour.setAdapter(adapter);
        Button addBtn = view.findViewById(R.id.addBtn);
        Button removeBtn = view.findViewById(R.id.removeBtn);
        Button createRecipe = view.findViewById(R.id.btnCreate);
        TextView textView = view.findViewById(R.id.itemQuanEt);

        //onClick logic
        addBtn.setOnClickListener(v ->
        {
            // click handling code
            int i = Integer.parseInt((String)textView.getText());
            i = i+1;
            textView.setText(Integer.toString(i));
        });

        removeBtn.setOnClickListener(v ->
        {
            // click handling code
            int i = Integer.parseInt((String)textView.getText());
            if (i > 0) {
                i = i - 1;
            } else
            {i = 0;}
            textView.setText(Integer.toString(i));
        });

        createRecipe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                MainActivity.fragmentPosition = MainActivity.viewPager2.getCurrentItem();
                final int batchNumber = Integer.parseInt(textView.getText().toString());
                final String flavour = spinnerFlavour.getSelectedItem().toString();
                Intent intent = new Intent(v.getContext(), RecipeActivity.class);
                intent.putExtra("batchNumber", batchNumber);
                intent.putExtra("flavour", flavour);
                startActivity(intent);

            }
        });

    }

}