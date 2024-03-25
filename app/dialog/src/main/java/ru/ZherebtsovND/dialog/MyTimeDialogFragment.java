package ru.ZherebtsovND.dialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TimePicker;

import androidx.fragment.app.DialogFragment;

import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;

public class MyTimeDialogFragment extends DialogFragment {
    private String time = "";

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);


        return new TimePickerDialog(getActivity(), this::onTimeSet, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    public void onTimeSet(TimePicker view, int hour, int minute) {
        time = hour + ":" + minute;
        View rootView = getActivity().getWindow().getDecorView().findViewById(android.R.id.content);
        Snackbar.make(rootView, "ТЫ время видел? Посмотри- " + time, Snackbar.LENGTH_LONG).show();
    }
}
