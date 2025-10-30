package ru.mirea.lab17.Ex3;

import java.util.ArrayList;
import java.util.List;

public class TaskListModel {
    private List<Task> tasks = new ArrayList<>();


    public void addTask(Task task){
        tasks.add(task);
    }
    public void addTask(String text){
        Task task = new Task(text);
        tasks.add(task);
    }


    public void removeTask(int id){
        tasks.remove(id);
    }
    public Task getTask(int id){
        return tasks.get(id);
    }


    public List<Task> getTasks() {
        return new ArrayList<>(tasks); // Возвращаем копию для безопасности
    }

    public int getTaskCount() {
        return tasks.size();
    }


}
