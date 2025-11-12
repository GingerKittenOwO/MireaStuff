package ru.mirea.CP1;
//Vasilev Ivan KVBO-11-24
public class LinkedList {
    //эта ссылка всегда указывает на первый узел
    // в связанном списке
    private Link first;

    //конструктор для создания пустого списка
    public LinkedList() {
        first = null;
    }

    public void insertFirst(int key, int data) {
        Link newLink = new Link(key, data);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        if (first == null) {
            return null; // список пуст
        }

        Link temp = first;
        first = first.next;
        temp.next = null;
        return temp;
    }

    public void display() {
        System.out.println("Вывод списка:");
        Link currentLink = first;
        while (currentLink != null){
            System.out.println(currentLink);
            currentLink = currentLink.next;
        }
    }

    public Link find(int key) {
        Link currentLink = first;

        while (currentLink != null) {
            if (currentLink.key == key) {
                return currentLink;
            }
            currentLink = currentLink.next;
        }
        return null;
    }

    public Link delete(int key) {
        if (first == null) {
            return null;
        }
        Link currentLink = first;
        Link previousLink = null;
        if (currentLink.key == key){
            return deleteFirst();
        }
        while (currentLink != null){
            if (currentLink.key == key){
                previousLink.next = currentLink.next;
                currentLink.next=null;
                return currentLink;
            }
            previousLink = currentLink;
            currentLink = currentLink.next;

        }
        return currentLink;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void sort() {
        if(first == null || first.next == null){
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Link prev = null;
            Link current = first;

            while (current.next != null) {
                if (current.data > current.next.data) {
                    // Меняем ссылки местами
                    Link temp = current.next;
                    current.next = temp.next;
                    temp.next = current;

                    if (prev == null) {
                        first = temp; // если переставляем самый первый элемент
                    } else {
                        prev.next = temp;
                    }

                    swapped = true;
                    prev = temp; // temp теперь стоит перед current
                } else {
                    prev = current;
                    current = current.next;
                }
            }
        } while (swapped);
    }

    public LinkedList reverse() {
        if (first == null) {
            return new LinkedList();
        }

        LinkedList reversedlist = new LinkedList();
        Link nextLink = null;
        reversedlist.insertFirst(first.key, first.data);
        Link currentLink = first;
        // Пока в списке не закончились данные,
        // вставьте текущую ссылку перед первой и двигайтесь дальше.
        while(currentLink.next != null){
            nextLink = currentLink.next;
            // Insert at start of new list.
            reversedlist.insertFirst(nextLink.key,
                    nextLink.data);
            currentLink = currentLink.next; //Переход к следующему узлу
        }
        return reversedlist;
    }


    public void concatenate (LinkedList list){
        Link currentLink = first;
        if (currentLink==null){
            first = list.first;
            return;
        }
        while (currentLink.next != null) {
            currentLink = currentLink.next;
        }
        currentLink.next = list.first;
    }
}