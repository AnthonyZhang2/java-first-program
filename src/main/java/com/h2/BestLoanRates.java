package com.h2;
import java.util.Scanner;
import java.util.Map;
public class BestLoanRates {

    public static final Map<Integer, Float> bestRates = Map.of(
            1, 5.50f,
            2, 3.45f,
            3, 2.67f
    );

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = sc.nextLine();

        System.out.println("Hello " + name);

    }

    public static float getRates(int loanTermInYears){
        return 0.0f;
    }

}
