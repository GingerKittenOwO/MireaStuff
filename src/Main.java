import ru.mirea.lab1.Ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();

        System.out.println(Ex7.factorial(a));
    }
}