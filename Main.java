package com.company;

import java.util.Arrays;

public class Main {
    static void sort(int[] arr){
        int numofarray = arr.length; // 9
        int array_new;
        for(int firstcond=0; firstcond <numofarray; firstcond++){ //i = 0 0<9 correct 0->1 i=1
            for(int secondcond=1; secondcond<(numofarray-firstcond);secondcond++){ //1 < 9-1 = 8 j=2
                if(arr[secondcond-1]>arr[secondcond]){ //arr[1] > j=2  temp = arr[1]
                    array_new = arr[secondcond-1];
                    arr[secondcond-1]=arr[secondcond];
                    arr[secondcond]=array_new;
                }
            }
        }
    }
    public static void main(String[] args) {
            int [] arr = {6,9,3,2};
            //1st 6 9 3 2
            //2nd 6 3 9 2
            //3rd 6 3 2 9
            //4th 3 6 2 9
            //5th 3 2 6 9
            //6th 2 3 6 9

            sort(arr);
            for(int i=0;i<arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
    }

    }






