package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num1 = 5;
        int num2 = 2;

        int sum = num1 + num2;
        System.out.println(sum);

        for(int i = 0; i < 5; i++) { System.out.println("Hello"); i++;}


        int i = 0;
        while(i < 5) {System.out.println("I am abdullah"); i++;};


        int j = 0;
        do
        {
            System.out.println("Hello I am abdullah ahmed");
            j++;
        }
        while(j < 5);

        // if else if else statements in java
        int myNumber = 4;

        switch (myNumber)
        {
            case 1:
            {
                System.out.println("The number is 1");
                break;
            }
            case 2:
            {
                System.out.println("The number is 2");
                break;
            }
            case 3:
            {
                System.out.println("The number is 3");
                break;
            }
            case 4:
            {
                System.out.println("The number is 4");
                break;
            }
            default:
            {
                System.out.println("Nothing matches");
            }
        }

    }
}
