package ru.mirea.lab1;

public class Ex6 {
    public static void main(String[] args){
        System.out.print("Гармночиеский ряд: ");
        for(int i=1;i<11;i++){
            if (i==1){
                System.out.print(i);
                continue;
            }
            System.out.print(" + "+"1/"+i);
        }
    }
}
