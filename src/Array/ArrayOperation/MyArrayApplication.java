package Array.ArrayOperation;

import java.util.Scanner;

public class MyArrayApplication {
    public static void main(String[] args) {
        MyArray array=new MyArray();
        System.out.println(array);

        System.out.println("input the insertion index:");
        Scanner sc=new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("input the value:");
        int value = sc.nextInt();
        array.insert(index,value);
        System.out.println(array);
        array.delete(2);
        System.out.println(array);
    }
}
