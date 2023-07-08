package com.arrays;

public class reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int l = arr.length;
        int num=l/2;
        int temp;
        for (int i=0;i<num;i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for (int e:arr){
            System.out.println(e+ " ");
        }
    }
}
