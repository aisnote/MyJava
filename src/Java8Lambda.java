/**
 * Created by liuliu on 11/11/2016.
 */

package Java8Lambda;
import java.util.*;

public class Java8Lambda {

    public void test(){
        Java8Lambda tester = new Java8Lambda();

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
