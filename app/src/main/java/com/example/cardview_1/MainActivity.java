package com.example.cardview_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<CourseModel> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        recyclerView = findViewById(R.id.recyclerView);
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new CourseModel("Smart Campus",R.drawable.diu));
        courseModelArrayList.add(new CourseModel("Teacher",R.drawable.teacher));
        courseModelArrayList.add(new CourseModel("Student",R.drawable.student));
        courseModelArrayList.add(new CourseModel("driver",R.drawable.driver));

        MyAdapter myAdapter = new MyAdapter(this,courseModelArrayList);
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myAdapter);

    }
}