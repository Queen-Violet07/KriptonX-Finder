package com.example.kriptonx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout2;
    ViewPager viewPager2;
    MainAdapter adapter;
    float v=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout2=findViewById(R.id.tab_layout_2);
        viewPager2=findViewById(R.id.view_pager_2);

        tabLayout2.addTab(tabLayout2.newTab().setText("RECENT DATA"));
        tabLayout2.addTab(tabLayout2.newTab().setText("SCAN DATA"));
        tabLayout2.addTab(tabLayout2.newTab().setText("PUBLISHED "));
        tabLayout2.setTabGravity(TabLayout.GRAVITY_FILL);

        final MainAdapter adapter=new MainAdapter(getSupportFragmentManager(),this,tabLayout2.getTabCount());
        viewPager2.setAdapter(adapter);

        viewPager2.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout2));
        tabLayout2.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

    }
}