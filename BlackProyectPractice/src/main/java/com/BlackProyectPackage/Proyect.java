package com.BlackProyectPackage;
import com.BlackProyectPackage.Task;

public class Proyect {

    private String proyectName;
    private Task[] tasks;

    public Proyect(String proyectName, Task[] tasks) {
        this.proyectName = proyectName;
        this.tasks = tasks;
    }

    public String getProyectName() {
        return proyectName;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }
}
