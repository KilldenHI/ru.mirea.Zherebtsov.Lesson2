package com.example.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Создаем ProgressDialog
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("Удаление папки \"Учеба\"...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setMax(2148);
        progressDialog.setIndeterminate(true);
        return progressDialog;
    }
}
