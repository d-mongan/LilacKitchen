package com.example.lilackitchen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TabLayoutMediator.TabConfigurationStrategy {

    ViewPager2 viewPager2;
    TabLayout tabLayout;
    ArrayList<String> titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewPager2);
        tabLayout = findViewById(R.id.tabLayout);
        titles = new ArrayList<>();
        titles.add("Recipes");
        titles.add("POS");
        titles.add("Reports");
        setViewPagerAdapter();
        new TabLayoutMediator(tabLayout, viewPager2, this).attach();

    }

    public void setViewPagerAdapter() {
        ViewPager2Adapter viewPager2Adapter = new
                ViewPager2Adapter(this);
        ArrayList<Fragment> fragmentList = new ArrayList<>(); //creates an ArrayList of Fragments
        fragmentList.add(new RecipesFragment());
        fragmentList.add(new POSFragment());
        fragmentList.add(new ReportsFragment());
        viewPager2Adapter.setData(fragmentList); //sets the data for the adapter
        viewPager2.setAdapter(viewPager2Adapter);

    }

    @Override
    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
        tab.setText(titles.get(position));
    }
}