package com.example.raksmey.nou_raksmey_mobileapp_assignment.log_form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.raksmey.nou_raksmey_mobileapp_assignment.R;

public class SignUpActivity extends AppCompatActivity {

    Button btn_create;
    TextView txt_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btn_create = findViewById(R.id.btnCreateAcc);
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent create = new Intent(SignUpActivity.this, SignInAcitity.class);
                startActivity(create);
            }
        });
        txt_signin = findViewById(R.id.txtSignin);
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signin = new Intent(SignUpActivity.this, SignInAcitity.class);
                startActivity(signin);
            }
        });
    }
}
