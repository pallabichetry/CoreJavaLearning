package com.pallabi.learn;

import java.io.OptionalDataException;

public class SumOfEvenNumbers extends EvenOrOddNumbers {

    static int[] n = {10,25,35,40,55,60,70,85};
    static int sum;


    public static void main(String[] args) {
        SumOfEvenNumbers sm = new SumOfEvenNumbers();

        //System.out.println(n[0]);

//        for(int i =0;  i< n.length; i++){
//            if(n[i]%2==0){
//                sum = sum+n[i];
//                System.out.println(sum);
//            }

            for(int index =0; index<n.length; index++){
                if(sm.checkNumber(n[index])==true){
                    sum = sum + n[index];
                    System.out.println(sum);
                }
            }

        }
   }




