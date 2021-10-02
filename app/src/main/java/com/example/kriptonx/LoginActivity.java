package com.example.kriptonx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class LoginActivity extends AppCompatActivity{

    TabLayout tabLayout;
    ViewPager viewPager;
    FloatingActionButton fb,google,twitter;
    float v=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tabLayout=findViewById(R.id.tab_layout);
        viewPager=findViewById(R.id.view_pager);
        fb=findViewById(R.id.fab_facebook);
        google=findViewById(R.id.fab_google);
        twitter=findViewById(R.id.fab_twitter);

        tabLayout.addTab(tabLayout.newTab().setText("LOG IN"));
        tabLayout.addTab(tabLayout.newTab().setText("SIGN UP"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final LoginAdapter adapter=new LoginAdapter(getSupportFragmentManager(),this,tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });


        google.setTranslationY(300);
        fb.setTranslationY(300);
        twitter.setTranslationY(300);
        tabLayout.setTranslationY(300);

        fb.setAlpha(v);
        google.setAlpha(v);
        twitter.setAlpha(v);
        tabLayout.setAlpha(v);

        fb.animate().translationY(0).alpha(1).setDuration(2000).setStartDelay(400).start();
        google.animate().translationY(0).alpha(1).setDuration(2000).setStartDelay(600).start();
        twitter.animate().translationY(0).alpha(1).setDuration(2000).setStartDelay(800).start();
        tabLayout.animate().translationY(0).alpha(1).setDuration(2000).setStartDelay(100).start();

    }
}