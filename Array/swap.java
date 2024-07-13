package Array;

import java.util.Arrays;

public class swap {
    static void swap(String[]name,int index1,int index2){
       String temp = name[index1];
        name[index1]=name[index2];
        name[index2]=temp;
        System.out.println(Arrays.toString(name));
    }
    public static void main(String[] args) {
        String[]name={"ruba","roobi","rose","raja","mano"};
        swap(name,1,2);
    }
}
/*
swap(arr,5,8)
swap(datatype[]name,int index1,int index2)
 */