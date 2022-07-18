package Lab4StackOperations;

import java.util.Arrays;

public class RMStock {
    int[] arrRm =new int[100];
    int top=0;

    RMStock(){
        Arrays.fill(arrRm,0);
    }

    void push(int rm){
        arrRm[top++]=rm;
    }

    int pop(){
        return arrRm[--top];
    }

    int topElement(){
        return  arrRm[top-1];
    }

    boolean isEmpty(){
        return top==0;
    }

    boolean isFull(){
        return top-1==arrRm.length;
    }

    int size(){
        return top;
    }

    int findElement(int element){
        for (int i = 0; i < top; i++) {
            if(arrRm[i]==element){
                return i;
            }
        }
        return -1;
    }

    void printStack(){
        for (int i = 0; i < top; i++) {
            System.out.print(arrRm[i]+" ");
        }
        System.out.println();
    }
}
