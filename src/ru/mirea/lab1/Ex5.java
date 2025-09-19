package ru.mirea.lab1;
/* cd /d D:\_Programming\IdeaProjects\MireaStuff\src - PC
* compile the file from .java to .class with: javac ru\mirea\lab1\Ex5.java
* run it with: java ru.mirea.lab1.Ex5 value1 value2
* */
/* - Laptop
cd  C:\_Personal\_Programming_Laptop\_GithubReps_Laptop\MireaStuff
javac src\ru\mirea\lab1\Ex5.java
cd  C:\_Personal\_Programming_Laptop\_GithubReps_Laptop\MireaStuff\src
java ru.mirea.lab1.Ex5 value1 value2
 */

public class Ex5 {
    public static void main(String[] args){
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
