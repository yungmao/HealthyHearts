package com.company;

import java.util.Scanner;

public class HealthyHearts {
    private final static int MAX = 220;
    private final static int MAX_AGE = 123; // Oldest person was 122 years and 164 days old
    private final static double LOWER_RANGE = 0.5;
    private final static double UPPER_RANGE = 0.8;
    public static int age;

    public static void getAge() {
        System.out.print("What is your age? ");
        Scanner input = new Scanner(System.in);
        int _age = input.nextInt();
        if ((_age >= 0) && (_age < MAX_AGE)) {
            age = _age;
        } else if (_age < 0) {
            System.out.println("Well you can't be that young!");
            age = -1;
        } else if (_age >= MAX_AGE) {
            age = -1;
            System.out.println("Congratulations on having an extraordinary live! We recommend asking a GP this question.");
        }
    }

    public static void calculateAndPrintResult() {
        if(age>=0){
        int max_hearth_rate = MAX - age;
        int min_range = (int) Math.floor(max_hearth_rate * LOWER_RANGE);
        int max_range = (int) Math.ceil(max_hearth_rate * UPPER_RANGE);
        System.out.println("Your maximum heart rate should be " + max_hearth_rate + " beats per minute");
        System.out.println("Your target HR Zone is " + min_range + " - " + max_range + " beats per minute");
    }
        else if(age==-1){
            System.out.println("Error: Invalid age");
        }
    }

    HealthyHearts(){
        getAge();
        calculateAndPrintResult();
    }
}
