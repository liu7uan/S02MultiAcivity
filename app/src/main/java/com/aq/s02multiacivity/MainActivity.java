package com.aq.s02multiacivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button openBtn;

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("MonStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("MonStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("MonDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("MonPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("MonResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("MonRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("MonCreate");

        openBtn = (Button) findViewById(R.id.openBtn);
        openBtn.setOnClickListener(new openBtnListener());
    }

    class openBtnListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            //COntext IS CLASS ,AVCTITY IS CONTEXT SUBCLASS,
            intent.setClass(MainActivity.this, secondActivity.class);
            startActivity(intent);
        }
    }
}
