package ru.mirea.lab17.Ex1;

public class MVCPPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDataBase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(view,model);
        controller.updateView();
        controller.setStudentRollNO("55555");
        System.out.println("После обновления, вот новая информация о студенте: ");
        controller.updateView();
    }
    public static Student retrieveStudentFromDataBase(){
        Student student = new Student();
        student.setName("Egor");
        student.setRollNO("12345");
        return student;
    }
}
