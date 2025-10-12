package ru.mirea.lab7.Ex5_6;

public class ProcessStrings implements StringMod {


    @Override
    public int countSyl(String line) {
        int count = 0;
        try {
            while (true) {
                line.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {

        }
        return count;
    }

    @Override
    public String oddSyl(String line) {
        String result ="";
        for (int i =0; i<countSyl(line);i++){
            if(i%2==0) result += line.charAt(i);
        }
        return result;
    }

    @Override
    public String invert(String line) {
        String result ="";
        for (int i =countSyl(line)-1; i>=0;i--){
            result += line.charAt(i);
        }
        return result;
    }
}
