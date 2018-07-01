package com.example.raksmey.nou_raksmey_mobileapp_assignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

import com.example.raksmey.nou_raksmey_mobileapp_assignment.log_form.SignInAcitity;

public class SplashScreenActivity extends Activity {

    private static int splashInterval=3000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this, SignInAcitity.class);
                startActivity(i);

                this.finish();
            }
            private void finish(){
                //

            }
        }, splashInterval);
    }
}
