package ru.mirea.lab17.Ex3;

public class Task {
    private String text;
    private boolean isCompleted = false;

    public Task(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
