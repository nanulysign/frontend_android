package com.inu.wcl.signage_wifi_helper;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() { @Override
        public void run() {
            init();

        } }, 1500);
    }

    private void init(){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }

}
