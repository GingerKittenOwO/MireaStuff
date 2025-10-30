package ru.mirea.lab17.Ex3;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.time.LocalDateTime;
import java.util.Date;

public class TaskListView {
    private JTextField newTaskText = new JTextField(20);
    private JButton taskAdd = new JButton("Добавить");
    private JPanel tasksPanel;

    public TaskListView() {
        initializeGUI();

    }

    private void initializeGUI() {
        JFrame frame = new JFrame("Список дел");

        //Создаем общую панель для верхней и нижней частей
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        //Верхняя строка для добавления задач
        JPanel inputPanel = new JPanel();
        inputPanel.add(newTaskText);
        inputPanel.add(taskAdd);

        //Основная панель с задачами
        tasksPanel = new JPanel();
        tasksPanel.setLayout(new BoxLayout(tasksPanel, BoxLayout.Y_AXIS));

        //Размещаем две предыдущие панели
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(tasksPanel, BorderLayout.CENTER);


        frame.add(mainPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void addListener(JButton button, Runnable action) {
        button.addActionListener(e -> action.run());
    }
    public void displayTask(List<Task> tasks, TaskListController controller) {
        tasksPanel.removeAll();

        for (int i = 0; i < tasks.size(); i++) {
            final int taskIndex = i;
            Task task = tasks.get(i);

            //Новое поле-задача, которая служит контейнером для компонентов
            JPanel taskPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

            JCheckBox taskCheckbox = new JCheckBox(task.getText());
            JButton deleteButton = new JButton("Удалить");
            JButton detailsButton = new JButton("Подробнее");

            // добавляем действия для кнопок
            deleteButton.addActionListener(e -> {
                controller.deleteTask(taskIndex); // taskIndex зафиксирован для этой кнопки
            });


            // Добавляем компоненты В taskPanel
            taskPanel.add(taskCheckbox);
            taskPanel.add(deleteButton);
            taskPanel.add(detailsButton);


            tasksPanel.add(taskPanel);
        }

        tasksPanel.revalidate(); // Обновляем отображение
        tasksPanel.repaint();
    }

    public void clearNewTaskField() {
        newTaskText.setText("");
    }
    public JButton getTaskAdd(){
        return taskAdd;
    }

    public JTextField getNewTaskText() {
        return newTaskText;
    }
}
