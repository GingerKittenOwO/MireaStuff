package ru.mirea.lab13;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String id, String name, String color, String size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }
    @Override
    public String toString(){
        return "=========\n"+
                "ID: " + id+"\n"+
                "Name: " + name+"\n"+
                "Color: " + color+"\n"+
                "Size: " + size+"\n"+
                "=========\n";

    }
    public static Shirt[] arrStringToArrObj(String[] arr){
        Shirt[] new_arr = new Shirt[arr.length];
        for(int i=0;i< arr.length;i++){
            String[] temp_arr = arr[i].split(",");
            new_arr[i] = new Shirt(temp_arr[0],temp_arr[1],temp_arr[2],temp_arr[3]);
        }
        return new_arr;
    }

    public static void main(String[] args) {
        String[] shirts = new String[]{
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White TShirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"};
        Shirt[] final_arr = Shirt.arrStringToArrObj(shirts);
        for (Shirt shirt : final_arr){
            System.out.println(shirt);
        }
    }
}
