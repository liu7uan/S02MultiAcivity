package com.aq.s02multiacivity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                System.out.println("SecondonCreate");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("SecondonStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("SecondonStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("SecondonDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("SecondonPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("SecondonResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("SecondonRestart");
    }


}
