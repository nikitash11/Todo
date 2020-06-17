package com.example.todomvvm.screens.tasks.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.todomvvm.data.task.TaskRepository;
import com.example.todomvvm.data.task.entity.TaskEntry;

import java.util.List;

public class DeleteViewModel extends AndroidViewModel
{
    TaskRepository taskRepository;
    private LiveData<List<TaskEntry>> tasks;

    public DeleteViewModel(@NonNull Application application) {
        super(application);
        taskRepository = TaskRepository.getInstance(application);
    }

    public void deleteAllTasks(){
        taskRepository.deleteAllTasks();
    }
}
