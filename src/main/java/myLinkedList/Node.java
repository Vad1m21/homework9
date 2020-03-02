package myLinkedList;

public class Node <T> {

    public  T currentElement;
    public  Node<T>  prevElement;
    public  Node<T>  nextElement;

    public Node(T currentElement, Node<T> prevElement, Node<T> nextElement) {
        this.currentElement = currentElement;
        this.prevElement = prevElement;
        this.nextElement = nextElement;
    }



    public T getCurrentElement() {
        return currentElement;
    }

    public void setCurrentElement(T currentElement) {
        this.currentElement = currentElement;
    }

    public Node<T> getPrevElement() {
        return prevElement;
    }

    public void setPrevElement(Node<T> prevElement) {
        this.prevElement = prevElement;
    }

    public Node<T> getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node<T> nextElement) {
        this.nextElement = nextElement;
    }


}
