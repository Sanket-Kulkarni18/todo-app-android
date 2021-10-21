package com.example.todoapp.model;

public class Todo{
    private int id;
    private String todostr;

    public Todo(int id, String todostr) {
        this.id = id;
        this.todostr = todostr;
    }

    public Todo(String todostr) {
        this.todostr = todostr;
    }

    public Todo(int id) {
        this.id = id;
    }
    public Todo(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodostr() {
        return todostr;
    }

    public void setTodostr(String todostr) {
        this.todostr = todostr;
    }
}
