package ru.mirea.lab1;
import java.util.Scanner;
import java.lang.String;
import java.util.Formatter;

public class Lab1 {
    //Task 3
   public static void main(String[] args) {
       int[] nums = {1, 2, 3, 4, 5};
       int length = nums.length;
       int y = 0;
       int i=0;
       for (i=0;i<length;i++){
           y=y+nums[i];
       }
       while(i<length){
           y=y+nums[i];
           i++;
       }
       do {
           y=y+nums[i];
           i++;
       }
       while (i<length);
       System.out.println(y);

   }

// Task 4 ++
    /*public static void main(String[] args){
        for (String str : args){
            System.out.println("аргумент = " + str);
        }
    }*/
// Task 5 ++
    /*    public static void main(String[] args) {
            double x;
            Formatter formatter = new Formatter();
            double i=1;
            for (i=1;i<10;i++){
                x = 1/i;
                formatter.format("%.2f%n", x);
                System.out.println(formatter);
            }
        }*/
    }
