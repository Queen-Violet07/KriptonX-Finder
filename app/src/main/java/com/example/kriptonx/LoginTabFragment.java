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

public class LoginTabFragment extends Fragment {

    EditText email, password;
    TextView forgetPass;
    Button login;
    float v=0;

    public LoginTabFragment() {
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup root=(ViewGroup) inflater.inflate(R.layout.login_tab_fragment,container,false);

        email=root.findViewById(R.id.log_email);
        password=root.findViewById(R.id.log_password);
        forgetPass=root.findViewById(R.id.forget_pass);
        login=root.findViewById(R.id.login_button);

        email.setTranslationX(600);
        password.setTranslationX(600);
        forgetPass.setTranslationX(600);
        login.setTranslationX(600);

        email.setAlpha(v);
        password.setAlpha(v);
        forgetPass.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        password.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        forgetPass.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        login.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(1000).start();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        return root;
    }


}
