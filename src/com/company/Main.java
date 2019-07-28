package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("Enter the size Array");
            size = scanner.nextInt();
            if (size >20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size >20);

        array = new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter element :" + (i+1));
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Before list");
        for (int j =0; j<array.length; j++) {
            System.out.println(array[j]+"\t");
        }
        for (int j = 0; j< array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }
        System.out.println("After list");
        for (int j =0; j<array.length; j++) {
            System.out.println(array[j]+"\t");
        }
    }
}
