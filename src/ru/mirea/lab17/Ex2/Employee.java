package ru.mirea.lab17.Ex2;

public class Employee {
    private String name;
    private int iDNum;
    private int workHours;
    private int payRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getiDNum() {
        return iDNum;
    }

    public void setiDNum(int iDNum) {
        this.iDNum = iDNum;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
    public int getWage(){
        return this.workHours*this.payRate;
    }
}
