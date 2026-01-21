package com.example.doit;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.doit.Adapter.ToDoAdapter;
import com.example.doit.Model.ToDoModel;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView taskRecyclerViwe;
    private ToDoAdapter taskAdapter;

    private List<ToDoModel> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        taskList = new ArrayList<>();

        taskRecyclerViwe = findViewById(R.id.tasksRecyclerView);
        taskRecyclerViwe.setLayoutManager(new LinearLayoutManager(this));
        taskAdapter = new ToDoAdapter((this));
        taskRecyclerViwe.setAdapter((taskAdapter));

        ToDoModel task = new ToDoModel();
        task.setTask("This is a Test Task");
        task.setStatus(0);
        task.setId(1);

        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);

        taskAdapter.setTask(taskList);

    }
}