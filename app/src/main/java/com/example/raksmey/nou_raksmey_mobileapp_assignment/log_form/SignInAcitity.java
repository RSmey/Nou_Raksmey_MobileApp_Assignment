package com.example.raksmey.nou_raksmey_mobileapp_assignment.log_form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.raksmey.nou_raksmey_mobileapp_assignment.NaviDrawerActivity;
import com.example.raksmey.nou_raksmey_mobileapp_assignment.R;

public class SignInAcitity extends AppCompatActivity {

    Button btn_login;
    TextView txt_skip;
    TextView txt_signup;
    TextView txt_forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInAcitity.this, NaviDrawerActivity.class);
                startActivity(intent);
            }
        });
        txt_skip = findViewById(R.id.txt_skip);
        txt_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent skip = new Intent(SignInAcitity.this, NaviDrawerActivity.class);
                startActivity(skip);
            }
        });
        txt_signup = findViewById(R.id.txtSignup);
        txt_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(SignInAcitity.this, SignUpActivity.class);
                startActivity(signup);
            }
        });
    }
}
