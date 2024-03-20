package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static final String TAG ="myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
    }
    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
        Log.i(TAG, "onRestoreInstanceState()");

    }
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart()");
    }
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume()");
    }
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause()");
    }
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super.onSaveInstanceState(saveInstanceState);
        Log.i(TAG, "onSaveInstanceState()");
    }
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop()");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
    }






}