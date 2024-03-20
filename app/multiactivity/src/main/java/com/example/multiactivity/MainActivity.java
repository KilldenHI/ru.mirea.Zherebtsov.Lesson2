package com.example.multiactivity;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onClickNewActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", "MIREA - ЖЕРЕБЦОВ НИКОЛАЙ ДМИТРИЕВИЧ");
        startActivity(intent);
    }
    public void onClickAddTextAct(View view) {
        EditText test = findViewById(R.id.editTextText);

        Intent intent = new Intent(this, SecondActivity.class);
        String text = test.getText().toString();
        intent.putExtra("text", text);
        startActivity(intent);
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