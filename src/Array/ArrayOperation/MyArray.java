package Array.ArrayOperation;

import java.util.Arrays;

public class MyArray {
    private final int initialLength=10;
    private int[] array=new int[initialLength];

    public MyArray(){
        for(int i =0; i< array.length;i++){
            array[i]=0;
        }
    }

    //supposing the array index is from 0-9, we can insert to the index from 0-10, which insert to 10 means add the element to the end.
    public void insert(int index,int value){
        int[] arrayNew;
        arrayNew = Arrays.copyOf(array, array.length + 1);
        if(index== array.length){
            arrayNew[array.length]=value;
        }
        else if(index>=0 && index<= array.length-1) {
            for (int i = array.length-1; i>=index ; i--) {
                arrayNew[i+1]=arrayNew[i];
            }
            arrayNew[index]=value;
        }
        else {
            System.out.println("wrong index, please input again");
        }
        array=arrayNew;
    }

    public void delete(int index){
        for (int i = index+1; i <= array.length-1; i++) {
            array[i-1]=array[i];
        }
        int[] arrayNew;
//        for (int i = 0; i < array.length - 2; i++) {
//            arrayNew[i]=array[i];
//        }
        arrayNew=Arrays.copyOf(array,array.length-1);

        array=arrayNew;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
