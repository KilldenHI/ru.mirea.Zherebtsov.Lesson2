package com.example.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;

public class MyDateDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Создаем DatePickerDialog с текущей датой
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), this::onDateSet, year, month, day);
    }

    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        View rootView = getActivity().getWindow().getDecorView().findViewById(android.R.id.content);
        Snackbar.make(rootView, "На абум ты тыкнуд в: " + dayOfMonth + "." + (month + 1) + "." + year, Snackbar.LENGTH_LONG).show();
    }

}
