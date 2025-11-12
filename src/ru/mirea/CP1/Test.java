package ru.mirea.CP1;
//Vasilev Ivan KVBO-11-24
public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(0,10);
        list.display();
        list.insertFirst(1,8);
        list.display();
        list.insertFirst(2,6);
        list.display();
        //list.sort();
        list.deleteFirst();
        list.display();
        list.delete(0);
        list.display();

        list.insertFirst(0,10);
        list.insertFirst(1,8);
        list.insertFirst(2,6);


        LinkedList list2 = new LinkedList();
        list2.insertFirst(3,67);
        list2.find(3).next=new Link(4,34);

        list.concatenate(list2);
        list.display();
        list.reverse().display();


        list.sort();
        list.display();
        System.out.println(list.isEmpty());
    }
}
