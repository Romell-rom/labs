package ru.mirea.lab1;
import java.util.Scanner;
import java.lang.String;
import java.util.Formatter;
import java.util.Random;

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
    //Task 6
     /*
    public static void main(String[] args) {
        Random rand = new Random();
        double nums[] =  new double[5];
        int length = nums.length;
        //Math.random
        for (int i = 0; i < length; i++) {
            nums[i] = Math.random();
        }
        //Random()
       for (int i = 0; i < length; i++) {
            nums[i] = rand.nextInt(100);
        }
        for (int i=nums.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if (nums[j]>nums[j+1]){
                    double temp =nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    } */
//Task 7
public static void main (String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your number ");
    int s = scanner.nextInt();
    System.out.println(Fact(s));
}
    static int Fact(int s){
        int result = 1;
        for (int i = 1; i <=s; i ++){
            result = result*i;
        }
        return result;
    }
}

    }
