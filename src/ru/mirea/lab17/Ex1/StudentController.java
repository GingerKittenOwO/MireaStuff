package ru.mirea.lab17.Ex1;

public class StudentController {
    private StudentView view;
    private Student model;

    public StudentController(StudentView view, Student model){
        this.view = view;
        this.model = model;
    }

    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNO(String rollNO){
        model.setName(rollNO);
    }
    public String getStudentRollNO(){
        return model.getRollNO();
    }
    public void updateView(){
        view.printStudentDetails(model.getRollNO(), model.getName());
    }
}
