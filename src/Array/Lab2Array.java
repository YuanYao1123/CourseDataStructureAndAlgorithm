package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input;
        ArrayList<Integer> list=new ArrayList<Integer>();
        do{
            input = sc.nextInt();
            boolean flag=true;
            for (int number:list) {
                if(input==number){
                    flag=false;
                    System.out.println("have added before");
                    break;
                }
            }
            if(flag){
                list.add(input);
                for (Integer integer : list) {
                    System.out.print(integer+" ");
                }
                System.out.println();
            }
        }while (input!=-1);
    }
}
