package ru.mirea.lab13;

public class Ex1 {
    public static void workWithString(String line){
        System.out.println(line.charAt(line.length()-1));
        System.out.println("Строка заканчивается на \"!!!\"?: " + line.endsWith("!!!"));
        System.out.println("Строка начинается на \"I like\"?: " + line.startsWith("I like"));
        System.out.println("Строка содержит \"Java\"?: " + line.contains( "Java"));
        System.out.println("Позиция подстроки \"Java\":" + line.indexOf("Java"));
        System.out.println(line.replace('a','o'));
        System.out.println(line.toUpperCase());
        System.out.println(line.toLowerCase());
        String new_line = line.substring(line.indexOf("Java"),line.lastIndexOf("Java"));
        System.out.println("lol");
        System.out.println(new_line);


    }

    public static void main(String[] args) {
        workWithString("I like Java!!!");

    }
}
