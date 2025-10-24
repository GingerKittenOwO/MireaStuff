package ru.mirea.lab18;

public class ThrowDemo {

//    public static void getDetails(String key) {
//        try {
//            if (key == null) {
//                throw new NullPointerException("null key in getDetails");
//            }
//            // do something with the key
//            System.out.println("data for: " + key);
//        } catch (NullPointerException e) {
//            System.out.println("Ошибка " + e.getMessage());
//        }
//    }
    public void printMessage(String key) {
        try {
            String message = getDetails(key);  // Может бросить исключение
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
            // Здесь можем сделать что-то полезное с ошибкой
        }
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for: " + key; }

    public static void main(String[] args) {
        ThrowDemo td = new ThrowDemo();
        td.printMessage(null);
    }
}
