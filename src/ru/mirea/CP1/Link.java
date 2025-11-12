package ru.mirea.CP1;
//Vasilev Ivan KVBO-11-24
public class Link {
    public int key;
    public int data;
    Link next;
    public Link(int key, int data){
        this.key = key;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Link{" +
                "key=" + key +
                ", data=" + data +
                '}';
    }
}
