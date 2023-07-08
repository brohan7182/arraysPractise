package com.arrays;

public class isSorted {
    public static void main(String[] args) {
        boolean isSortedd=true;
        int arr1[]={1,2,3,4,5,6};
        for (int i=0;i< arr1.length-1;i++){
            if (arr1[i]>arr1[i+1]){
                isSortedd=false;
                break;
            }
        }
        if (isSortedd) {
            System.out.println("Sorted");
        }else {
            System.out.println("Not Sorted");
        }
    }
}
