package ru.mirea.lab20;

public class MinMax<N extends Number> {
    private N[] arr;

    public MinMax(N[] arr) {
        this.arr = arr;
    }
    public N min(){
        if (arr.length==0){
            return null;
        }
        N min = arr[0];
        for(int i =1; i<arr.length;i++){
            if(min.doubleValue() > arr[i].doubleValue()) min = arr[i];
        }
        return min;
    }
    public N max(){
        if (arr.length==0){
            return null;
        }
        N max = arr[0];
        for(int i =1; i<arr.length;i++){
            if(max.doubleValue() < arr[i].doubleValue()) max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {

        MinMax<Double> mm = new MinMax<Double>(new Double[]{3.5, 6.78, 1.67});
        System.out.println(mm.min());
        System.out.println(mm.max());
    }
}
