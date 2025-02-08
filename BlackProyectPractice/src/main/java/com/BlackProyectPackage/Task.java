package com.BlackProyectPackage;
import java.util.Date;

public class Task {

    private String taskName;
    private String taskDescription;
    private Date taskDate;

    public Task(String taskName, String taskDescription, Date taskDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDate = taskDate;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Date getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

}
