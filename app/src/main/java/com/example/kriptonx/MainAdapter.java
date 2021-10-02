package com.example.kriptonx;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.kriptonx.databinding.FragmentPublishDataBinding;

public class MainAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public MainAdapter(FragmentManager fm, Context context, int totalTabs) {
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                RecentDataFragment recentDataFragment=new RecentDataFragment();
                return recentDataFragment;
            case 1:
                ScanDataFragment scanDataFragment=new ScanDataFragment();
                return scanDataFragment;
            case 2:
                PublishDataFragment publishDataFragment=new PublishDataFragment();
                return publishDataFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
