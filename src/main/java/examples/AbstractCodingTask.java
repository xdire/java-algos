package examples;

import java.util.Arrays;

public class AbstractCodingTask {

    public void printResultForInput(String sessionId, int[] input, int result) {
        System.out.println("Session id " +sessionId+ ". Input:");
        System.out.println(Arrays.toString(input));
        System.out.println("Result: ");
        System.out.println(result);
    }

    public void printResultForInput(String sessionId, int[] input, int[] results) {
        System.out.println("Session id " +sessionId+ ". Input:");
        System.out.println(Arrays.toString(input));
        System.out.println("Result: ");
        System.out.println(Arrays.toString(results));
    }

}
