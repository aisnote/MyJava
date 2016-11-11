package com.aisnote.lambda;

import java.util.*;

public class LambdaTest {

    public static void test(){
        LambdaTest tester = new LambdaTest();

        MathOperation addition = (int a, int b) -> {return a + b;};
        MathOperation multiplication = (int a, int b) -> a * b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
