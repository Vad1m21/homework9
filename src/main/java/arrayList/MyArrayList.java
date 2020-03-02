package arrayList;


import java.util.List;

public class MyArrayList <T>  implements MyList<T>{

  private final int INIT_SIZE = 16;
  private Object [] array = new Object[INIT_SIZE];
  private int pointer = 0;

    @Override
    public void add (T value){
        array[pointer] = value;
        pointer++;
    }
    @Override
    public int size (){
        return pointer;
    }
    @Override
    public T get(int index){

        return (T) array[index];
    }
    @Override
    public void remove(int index){
        for (int i = index; i<pointer;i++)
            array[i] = array[i + 1];

        array[pointer] = null;
        pointer--;

    }
    @Override
    public T clear(){
        for (Object object:array) {
            array = null;
        }
        pointer = 0;
        return (T) array;
    }




}
