package ru.mirea.lab2;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<Computer> stock = new ArrayList<Computer>();

    public void addComputer(Computer pc){
        stock.add(pc);
    }
    public int getComputerId(Computer pc){
        return stock.indexOf(pc);
    }
    public Computer getComputer(int id){
        return stock.get(id);
    }
    public void removeComputer(int id){
        stock.remove(id);
    }
    public void removeComputer(Computer pc){
        stock.remove(pc);
    }

    public void spitout(){
        System.out.println("Компьютеры по индексам:");
        for (int i = 0;i<stock.size();i++){
            System.out.printf("[%d] - %s\n",i,stock.get(i));
        }
    }

    @Override
    public String toString(){
        String line ="";
        for (Computer pc: stock) {
            line += pc;
            line += '\n';

        }
        return line;
    }


    public static void main(String[] args) {
        Shop dns = new Shop();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите изнаальное число компьютеров: ");
        int am = sc.nextInt();
        for(int i =0;i<am;i++){
            String os;
            String cpu;
            int ram;
            System.out.println("Ввод данных компьютера №"+(i+1));

            System.out.println("Введите операционную систему:");
            os = sc.nextLine();

            System.out.println("Введите модель процессора:");
            cpu = sc.nextLine();

            System.out.println("Введите количество ОЗУ (целое число гб):");
            ram = sc.nextInt();

            Computer pc = new Computer(os,cpu,ram);
            dns.addComputer(pc);
        }
        dns.spitout();
        System.out.println(dns.getComputer(2));
        dns.removeComputer(2);
        dns.spitout();
        Computer pc = new Computer("Windows","Intel 7",16);
        dns.addComputer(pc);
        dns.spitout();


    }

}
