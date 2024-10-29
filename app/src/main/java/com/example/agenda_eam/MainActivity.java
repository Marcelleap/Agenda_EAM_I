package com.example.agenda_eam;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class MainActivity extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
            }
            public void intraDialogTimePicker(View v) {
                DialogFragment newFragment = new FragmentoTimePicker();
                newFragment.show(getSupportFragmentManager(), "timePicker");
            }
            public static void intraDialogDatePicker(MainActivity mainActivity, View v) {
                DialogFragment newFragment = new FragmentoDatePicker();
                newFragment.show(mainActivity.getSupportFragmentManager(), "datePicker");
            }
    }