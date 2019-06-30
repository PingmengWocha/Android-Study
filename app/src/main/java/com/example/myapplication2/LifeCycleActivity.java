package com.example.myapplication2;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LifeCycleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Log.d("LifeCycle","-----onCreate-----");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","-----onStart-----");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","-----onResume-----");
    }

    @Override
    protected void onPause() {
        Log.d("LifeCycle","-----onPause-----");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("LifeCycle","-----onStop-----");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d("LifeCycle","-----onRestart-----");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("LifeCycle","-----onDestroy-----");
        super.onDestroy();
    }
}
