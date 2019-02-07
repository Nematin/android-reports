package com.example.ksitproduction.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.ksitproduction.R;
import com.example.ksitproduction.model.CTask;

public class MainActivity extends AppCompatActivity {

    List<CTask> tasks = new ArrayList<CTask>();

    @Override
    public boolean shouldUpRecreateTask(Intent targetIntent) {
        return super.shouldUpRecreateTask(targetIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tasks.add(new CTask("Lab1", "12", "2", UUID.randomUUID()));

        RecyclerView rv = (RecyclerView)findViewById(R.id.RecyclerViewTasks);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        ViewAdaptor adapter = new ViewAdaptor(this, tasks);
        // устанавливаем для списка адаптер
        rv.setAdapter(adapter);
}
}
