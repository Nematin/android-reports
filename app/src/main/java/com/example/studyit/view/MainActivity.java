package com.example.studyit.view;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.studyit.R;
import com.example.studyit.model.CTask;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.Loader;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    boolean prevStateFabManualAdd = true;
    boolean prevStateFabQRAdd = true;
    boolean prevStateManualTextView = true;
    boolean prevStateQrTextView = true;


    List<CTask> tasks = new ArrayList<CTask>();
    FloatingActionButton fabManualAdd;
    FloatingActionButton fabQRAdd;
    TextView manualTextView;
    TextView qrTextView;

    @Override
    public boolean shouldUpRecreateTask(Intent targetIntent) {
        return super.shouldUpRecreateTask(targetIntent);
    }

    public void onFABClick(View view)
    {
        Intent intent = new Intent(this, NewLab.class);
        startActivity(intent);

        if (fabManualAdd.getVisibility() == View.VISIBLE)
        {
            fabManualAdd.setVisibility(View.GONE);
            prevStateFabManualAdd = false;
        }

        if (fabQRAdd.getVisibility() == View.VISIBLE)
        {
            fabQRAdd.setVisibility(View.GONE);
            prevStateFabQRAdd = false;
        }

        if (manualTextView.getVisibility() == View.VISIBLE)
        {
            manualTextView.setVisibility(View.GONE);
            prevStateManualTextView = false;
        }

        if (qrTextView.getVisibility() == View.VISIBLE)
        {
            qrTextView.setVisibility(View.GONE);
            prevStateQrTextView = false;
        }
    }

    public void showHideButtons(View view)
    {
       if (fabManualAdd.getVisibility() == View.GONE)
       {
           fabManualAdd.setVisibility(View.VISIBLE);
           prevStateFabManualAdd = false;
       }

       if (fabQRAdd.getVisibility() == View.GONE)
       {
           fabQRAdd.setVisibility(View.VISIBLE);
           prevStateFabQRAdd = false;
       }

       if (manualTextView.getVisibility() == View.GONE)
       {
           manualTextView.setVisibility(View.VISIBLE);
           prevStateManualTextView = false;
       }

       if (qrTextView.getVisibility() == View.GONE)
       {
           qrTextView.setVisibility(View.VISIBLE);
           prevStateQrTextView = false;
       }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabManualAdd   = (FloatingActionButton) findViewById(R.id.fabManualAdd);
        fabQRAdd       = (FloatingActionButton) findViewById(R.id.fabQRAdd);
        manualTextView             = (TextView) findViewById(R.id.manualTextView);
        qrTextView                 = (TextView) findViewById(R.id.qrTextView);

        fabManualAdd.setVisibility(View.GONE);
        fabQRAdd.setVisibility(View.GONE);
        manualTextView.setVisibility(View.GONE);
        qrTextView.setVisibility(View.GONE);


        tasks.add(new CTask("Lab1", "12", "2", UUID.randomUUID()));

        RecyclerView rv = (RecyclerView)findViewById(R.id.RecyclerViewTasks);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        ViewAdaptor adapter = new ViewAdaptor(this, tasks);
        // устанавливаем для списка адаптер
        rv.setAdapter(adapter);
}
}
