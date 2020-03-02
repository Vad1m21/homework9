package myQueue;

import java.util.Queue;

public class MyQueue <T> {

    private Object [] array;
    private int size;
    private int amountElements;
    private int front;
    private int rear;


    public MyQueue(int size) {
        this.size = size;
        array = new Object[size];
        amountElements = 0;
        front = 0;
        rear = 1;
    }


    public void add(T value){
        if(rear == size - 1){
            rear = -1;
        }
        array[++front] = value;
        amountElements++;
    }


    public void remove(int index){
       array[index] = null;
        if(front == size){
            front = 0;
        }
        amountElements--;
        for (int i = index; i< array.length;i++){
            array[i] = array[i+1];
        }
    }
    public int size(){
        return amountElements;
    }

    public void clear(){
        for (int i = 0;i<array.length;i++){
            array[i] = null;
        }
        rear = 1;
        amountElements = 0;
        front = 0;
    }

    public Object peek(){
       Object obj = new Object();
        obj = array[front];
        return obj;
    }

    public Object poll(){
        Object obj = new Object();
        obj = array[front];
        array[front] = null;
        for (int i = 0;i<array.length;i++){
            array[i] = array[i+1];
        }
        
        return obj;
    }


}
