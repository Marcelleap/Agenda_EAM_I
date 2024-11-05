package com.example.agenda_eam;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class MainActivity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "WrongViewCast", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void intraDialogDatePicker(View v) {
        DialogFragment newFragment = new FragmentoDatePicker();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void intraDialogTimePicker(View v) {
        DialogFragment newFragment = new FragmentoTimePicker();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }
}
