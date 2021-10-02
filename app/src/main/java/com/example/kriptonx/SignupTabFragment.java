package com.example.kriptonx;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {

    EditText email, password,name;
    Button signup;
    float v=0;

    public SignupTabFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup root=(ViewGroup) inflater.inflate(R.layout.signup_tab_fragment,container,false);

        name=root.findViewById(R.id.sign_name);
        email=root.findViewById(R.id.sign_email);
        password=root.findViewById(R.id.sign_password);
        signup=root.findViewById(R.id.signup_button);

        name.setTranslationX(600);
        email.setTranslationX(600);
        password.setTranslationX(600);
        signup.setTranslationX(600);

        name.setAlpha(v);
        email.setAlpha(v);
        password.setAlpha(v);
        signup.setAlpha(v);

        name.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        email.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        password.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        signup.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(1000).start();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }
}
