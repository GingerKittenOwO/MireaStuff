package ru.mirea.lab17.Ex3;

public class TaskListController {
    private TaskListModel model;
    private TaskListView view;

    public TaskListController(TaskListModel model, TaskListView view) {
        this.model = model;
        this.view = view;
        view.addListener(view.getTaskAdd(), this::addTask);
    }
    public void addTask(){
        String text = view.getNewTaskText().getText();
        if (!text.trim().isEmpty()) {
            model.addTask(text);
            view.displayTask(model.getTasks(),this); // Нужно передать все задачи
            view.clearNewTaskField(); // Добавим этот метод
        }
    }

    // НОВЫЙ МЕТОД ДЛЯ УДАЛЕНИЯ
    public void deleteTask(int taskIndex) {
        model.removeTask(taskIndex);
        view.displayTask(model.getTasks(), this); // Обновляем список
    }

}
