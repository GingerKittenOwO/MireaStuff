package ru.mirea.lab17.Ex3;

import javax.swing.*;

public class Testing {
    public static void main(String[] args) {
//        // Запускаем в Event Dispatch Thread (обязательно для Swing)
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                TaskListView view = new TaskListView();
//                //view.testGUI(); // Показываем тестовые данные
//            }
//        });
        TaskListModel model = new TaskListModel();
        TaskListView view = new TaskListView();
        TaskListController controller = new TaskListController(model,view);
    }
}
