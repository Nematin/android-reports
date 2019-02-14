package com.example.studyit.view;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.studyit.R;

import androidx.appcompat.app.AppCompatActivity;

public class NewLab extends AppCompatActivity {

    String[] items = {"1 предмет", "2 предмет", "3 предмет", "4 предмет"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_lab);


        Spinner spinnerSubject = (Spinner) findViewById(R.id.spinnerDiscipline);
        Spinner spinnerControlPoint = (Spinner) findViewById(R.id.spinnerCP);
        TextView labName = (TextView) findViewById(R.id.textViewLabName);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                // Применяем адаптер к элементу spinner
        spinnerSubject.setAdapter(adapter);

    }



}
