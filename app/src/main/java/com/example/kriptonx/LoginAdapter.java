package com.example.kriptonx;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class LoginAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public LoginAdapter(FragmentManager fm, Context context, int totalTabs) {
        super(fm);
        this.context=context;
        this.totalTabs=totalTabs;
    }

    public Fragment getItem(int position) {

        switch (position){
            case 0:
                LoginTabFragment loginTabFragment=new LoginTabFragment();
                return loginTabFragment;
            case 1:
                SignupTabFragment signupTabFragment=new SignupTabFragment();
                return signupTabFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }


}
