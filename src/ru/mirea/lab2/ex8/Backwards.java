package ru.mirea.lab2.ex8;

public class Backwards {
    public static void main(String[] args) {
        String[] arr = new String[]{"dawdwa", "w","dawdaw","jujuk"};
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"; ");
        }
        System.out.println('\n');

        arr = reverse(arr);
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"; ");
        }
    }
    public static String[] reverse(String[] arr){
        for (int i =0;i<arr.length/2;i++){
            String temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
}
