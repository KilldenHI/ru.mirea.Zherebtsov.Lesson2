package com.example.multiactivity;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.text1);
        String text = (String) getIntent().getSerializableExtra("key");
        textView.setText(text);

        TextView textView2 = findViewById(R.id.textView3);
        String text2 = (String) getIntent().getSerializableExtra("text");
        textView2.setText(text2);
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