package ru.ZherebtsovND.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import ru.ZherebtsovND.toastapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        EditText editText= findViewById(R.id.editTextText);
        String text = editText.getText().toString();
        int characterCount = text.length();


        Toast toast = Toast.makeText(getApplicationContext(), "СТУДЕНТ №10 ГРУППА БСБО-11-21 Количество символов - "+characterCount, Toast.LENGTH_SHORT);
        toast.show();
    }


}