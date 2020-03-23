package com.android.tasks;

public class Task {

     private String task;
    private Execution taskStatus;

    public Task(String task, Execution taskStatus) {
        this.task = task;
        this.taskStatus = taskStatus;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Execution getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Execution taskStatus) {
        this.taskStatus = taskStatus;
    }
}
