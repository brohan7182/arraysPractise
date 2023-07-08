package com.arrays;

public class isPresent {
    public static void main(String[] args) {
        float arr[]={10.5f,20.5f,30.5f,75.5f,50.5f,60.5f,100.0f};
        boolean isInArray=false;
        float num=100.0f;
        for (float e:arr){
            if (num==e){
                isInArray=true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("It is in the Array");
        }
        else {
            System.out.println("It is not in the Array");
        }
        }
    }
