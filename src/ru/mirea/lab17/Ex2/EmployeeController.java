package ru.mirea.lab17.Ex2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name){
        model.setName(name);
    }
    public String getEmployeeName(){
        return model.getName();
    }

    public void setEmployeeIDNum(int idNum){
        model.setiDNum(idNum);
    }
    public int getEmployeeIDNum(){
        return model.getiDNum();
    }

    public void setEmployeeWorkHours(int workHours){
        model.setWorkHours(workHours);
    }
    public int getEmployeeWorkHours(){
        return model.getWorkHours();
    }

    public void setEmployeePayRate(int payRate){
        model.setPayRate(payRate);
    }
    public int getEmployeePayRate(){
        return model.getPayRate();
    }

    public int getEmployeeWage(){
        return model.getWage();
    }


    public void UpdateInfo(){
        view.displayInfo(model.getName(),model.getiDNum(),model.getWorkHours(),model.getPayRate());
    }
    public void UpdateWage(){
        view.displayWage(model.getWage());
    }


}
