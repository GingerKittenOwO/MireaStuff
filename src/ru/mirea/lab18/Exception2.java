package ru.mirea.lab18;

import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");

        try{
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }catch (NumberFormatException e){
            System.out.println("Число введено некорректно");
        }catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        }catch (Exception e) {  // Общий обработчик ПЕРВЫМ
            System.out.println("Общая ошибка");
        } finally {
            System.out.println("Финал!");
        }



    }
    public static void main(String[] args) {
        Exception2.exceptionDemo();
    }
}
