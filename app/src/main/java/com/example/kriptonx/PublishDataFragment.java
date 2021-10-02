package com.example.kriptonx;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PublishDataFragment extends Fragment {



    public PublishDataFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup root=(ViewGroup) inflater.inflate(R.layout.fragment_publish_data,container,false);

        return root;
    }
}