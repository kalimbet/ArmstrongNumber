package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 0;
        int numberByTen;
        int temp;

        int number = 153;   //Our number
        temp = number;

        while (number>0){
            numberByTen = number % 10;
            number = number / 10;
            result = result+(numberByTen*numberByTen*numberByTen);
        }

        if(temp == result){
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not Armstrong number");
        }

    }
}
