package com.arrays;

public class avgMarks {
    public static void main(String[] args) {
        float arr[]={10.5f,20.5f,30.5f,75.5f,50.5f,60.5f,100.0f};
        float sum=0;
        for(float element:arr){
            sum=sum+element;
        }
        System.out.println("the sum is : "  +sum/ arr.length);
    }
}
