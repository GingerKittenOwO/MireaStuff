package ru.mirea.lab2.ex4;

public class Computer {
    private final String os;
    private final String cpu;
    private final int ram;
    public Computer(String os, String cpu, int ram){
        this.os = os;
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                '}';
    }
}
