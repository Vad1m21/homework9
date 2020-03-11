package myLinkedList;

public class Node<T>{


    public T value;
    public   Node<T> next;


    public Node(T value){
        this.value = value;
        next = null;
    }



    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }




        }