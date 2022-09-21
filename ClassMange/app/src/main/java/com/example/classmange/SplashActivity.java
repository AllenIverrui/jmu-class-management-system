package com.example.classmange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {
    private Button splashButton;
    private Handler splashHandler=new Handler();
    private Runnable splashRunnable= new Runnable() {
        @Override
        public void run() {
            toLoginActivety();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
        initEvent();
        splashHandler.postDelayed(splashRunnable,3000);
    }

    private void initEvent() {
        splashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toLoginActivety();
                splashHandler.removeCallbacks(splashRunnable);
            }
        });
    }

    private void initView() {
        splashButton =findViewById(R.id.id_btn_skip);

    }

    /**
     * 点击按钮进入下一个页面
     */
    public void  toLoginActivety(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        splashHandler.removeCallbacks(splashRunnable);
    }
}