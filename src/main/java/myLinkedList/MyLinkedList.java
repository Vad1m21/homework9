package myLinkedList;

import arrayList.MyList;

public class MyLinkedList <T>{

    private Node<T> head;
    private int size = 0;



    public void add(T value) {
        Node<T> node = new Node<T>(value);
        node.next = null;
        if(head == null){
          head = node;
        }
        else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }


            last.next =node;
        }
        size++;
    }



    public void remove(int index) {
        Node currNode = head, prev = null;

        if (index == 0 && currNode != null) {
            head = currNode.next;

        }

        int counter = 0;
        while (currNode != null) {

            if (counter == index) {
                prev.next = currNode.next;


                break;
            }
            else {

                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        size--;
    }


    public int size() {
        return size;
    }


    public T get(int index) {
        Node currNode = head, prev = null;
        int counter = 0;
        T obj = null;
        while (currNode != null) {

            if (counter == index) {
                obj = (T) currNode.value;
                break;
            }
            else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        return obj;
    }


    public void clear() {
       head = null;
       size = 0;
    }
}
