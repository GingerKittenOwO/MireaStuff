package ru.mirea.lab17.Ex2;


public class MVCDemonstration {
    public static void main(String[] args) {
        Employee model = retrieveStudentFromDataBase();
        EmployeeView view = new EmployeeView();
        EmployeeController cntrl = new EmployeeController(model,view);

        cntrl.UpdateInfo();
        cntrl.UpdateWage();
        cntrl.setEmployeePayRate(50);
        System.out.println("Почасовая оплата сотрудника "+cntrl.getEmployeeName()+" была изменена на "+ cntrl.getEmployeePayRate()+"$");
        cntrl.UpdateWage();



    }
    public static Employee retrieveStudentFromDataBase(){
        Employee employee = new Employee();
        employee.setName("Egor");
        employee.setiDNum(12345);
        employee.setPayRate(20);
        employee.setWorkHours(100);
        return employee;
    }
}
