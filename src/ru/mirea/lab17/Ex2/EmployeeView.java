package ru.mirea.lab17.Ex2;

public class EmployeeView {
    public void displayInfo(String name, int idNum, int workHours, int payRate){
        System.out.println("Данные о работнике: "+
                "\n Имя: "+name+
                "\n ID: "+idNum+
                "\n Количество рабочих часов: "+workHours+
                "\n Почасовая оплата: " + payRate+"$/час");
    }
    public void displayWage(int wage){
        System.out.println("Месячная зарплата составляют: "+wage+"$");
    }
}
