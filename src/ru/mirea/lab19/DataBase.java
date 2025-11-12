package ru.mirea.lab19;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataBase {
    private Map<String, String> db;

    public DataBase(Map<String, String> db) {
        this.db = db;
    }
    public void validateINN(String fullName, String inn) throws InvalidINNException{
        if(!db.containsKey(fullName)){
            throw new InvalidNameException("Клиент не найден: " + fullName);
        }

        String checkINN = db.get(fullName);
        if (checkINN==null || !checkINN.equals(inn)){
            throw new InvalidINNException("Недействительный ИНН для: " + fullName);
        }

        System.out.println("ИНН действителен!");
    }



    public static void main(String[] args) throws InvalidINNException {
        DataBase db = loadData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        System.out.println("Введите ИНН: ");
        String inn = sc.nextLine();
        db.validateINN(name,inn);
//        try{
//            db.validateINN(name,inn);
//        } catch(InvalidINNException e){
//            System.out.println(e.getMessage());
//        }

    }
    public static DataBase loadData(){

        Map<String, String> db1 = new HashMap<>();
        db1.put("Иванов Иван Иванович", "123456789012");
        db1.put("Петрова Анна Сергеевна", "987654321098");
        db1.put("Игнатий Романов Игоревич", "576924566725");
        return new DataBase(db1);

    }
}
