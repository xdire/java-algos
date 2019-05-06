package examples;

import java.util.Arrays;

public class AbstractCodingTask {

    public void printResultForInput(String sessionId, int[] input, int result) {
        System.out.println("\nSession id " +sessionId+ ". Input:");
        System.out.println(Arrays.toString(input));
        System.out.println("Result: ");
        System.out.println(result);
    }

    public void printResultForInput(String sessionId, int[] input, int[] results) {
        System.out.println("\nSession id " +sessionId+ ". Input:");
        System.out.println(Arrays.toString(input));
        System.out.println("Result: ");
        System.out.println(Arrays.toString(results));
    }

    public void printResultForInput(String sessionId, String input, boolean result) {
        System.out.println("\nSession id " +sessionId+ ". Input:");
        System.out.println(input);
        System.out.println("Result: \n" + result);
    }

    public void printTaskHeader() {
        System.out.println("----------------TASK---------------\n");
    }

}
