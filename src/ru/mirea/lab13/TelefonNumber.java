package ru.mirea.lab13;

public class TelefonNumber {
    public static String telefonFormat(String line){
        if(line.charAt(0)=='8'){
            return "+7"+" " +
                    line.substring(1,4) + "-"+
                    line.substring(4,7) + "-"+
                    line.substring(7,11);
        }
        else{
            return line.substring(0,2)+" " +
                    line.substring(2,5) + "-"+
                    line.substring(5,8) + "-"+
                    line.substring(8,12);
        }
    }

    public static void main(String[] args) {
        System.out.println(TelefonNumber.telefonFormat("+77590678567"));
        System.out.println(TelefonNumber.telefonFormat("88763865767"));

    }
}
