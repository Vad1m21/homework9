package myLinkedList;

import arrayList.MyList;

public class MyLinkedList <T> implements MyList<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    public MyLinkedList() {

        lastNode = new Node<T>(null, firstNode,null);
        firstNode = new Node<T>(null,null,lastNode);

    }

    @Override
    public void add(T value) {
        Node<T> prev = lastNode;
        prev.setCurrentElement(value);
        lastNode = new Node<T>(null,prev,null);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public void remove(int index) {
        Node <T> target = firstNode.getNextElement();
        for(int i = 0;i<index;i++){

        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        Node<T> target = firstNode.getNextElement();
        for(int i =0;i<index;i++){
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    @Override
    public T  clear() {

            lastNode = null;
            firstNode = null;
            size = 0;
     return null;
    }

    private Node<T>getNextElement(Node<T> current){
        return current.getNextElement();
    }
}
