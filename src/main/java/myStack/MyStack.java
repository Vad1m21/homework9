package myStack;

public class MyStack <T> {

    private int size;
    private Object  [] array;
    private int top;


    public MyStack(int size) {
        this.size = size;
        array = new Object [size];
        top = -1;
    }


    public void push(T value){
        array[++top] = value;
    }

    public void  remove(int index){
        array[index] = null;
        for (int i = index; i<array.length;i++){
            array[i] = array[i+1];
        }

    }

    public int size(){
        return top;
    }

    public Object peek(){
        return array[top];
    }

    public Object pop(){
       Object obj =  new Object();
       obj = array[top];

       array[top] = null;
       top--;
    return obj;
    }

    public void clear(){
        for (int i = 0;i<array.length;i++){
            array[i] = null;
        }
        top = -1;
    }


}
