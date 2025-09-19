package ru.mirea.lab2.ex5;
import java.util.ArrayList;
public class DogShelter {
    private ArrayList<Dog> shelter = new ArrayList<Dog>();
    public void addDogs(ArrayList<Dog> dogs){
        shelter.addAll(dogs);

    }
}
