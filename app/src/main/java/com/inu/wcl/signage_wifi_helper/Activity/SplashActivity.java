package com.inu.wcl.signage_wifi_helper.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.inu.wcl.signage_wifi_helper.R;
import com.inu.wcl.signage_wifi_helper.model.WifiCellItem;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //init()
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
