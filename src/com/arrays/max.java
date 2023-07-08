package com.arrays;

public class max {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int max=0;
        for (int e:arr){
            if (e>max){
                max=e;
            }
        }
        System.out.println(max);
        System.out.println();
        int arr1[]={10,2,3,4,5,6};
        int min=100;
        for (int e:arr){
            if (e<min){
                min=e;
            }
        }
        System.out.println(min);
    }
}
