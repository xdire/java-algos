package examples.c_stack_brackets;

import examples.AbstractCodingTask;
import examples.ICodingTask;

import java.util.*;

public class BracketsParse extends AbstractCodingTask implements ICodingTask {

    private int runs = 0;
    private static Map<Character, Character> markers = new HashMap<Character, Character>();

    /**
     *  Constructor
     *
     *  If opening brackets weren't defined for their closing counterparts then
     *  initialize mapping
     */
    public BracketsParse() {
        if (markers.size() == 0) {
            markers.put(']', '[');
            markers.put(')', '(');
            markers.put('}', '{');
        }
    }

    /**
     * Main interface method to run the task
     */
    @Override
    public void run() {
        printTaskHeader();
        this.run("[[(])]]{}");
        this.run("[[()()]]{}");
    }

    /**
     * Run task with string as an input
     * @param s String
     */
    public void run(String s) {
        boolean res = this.solution(s);
        this.printResultForInput("Split numbers iteration: " + runs++, s, res);
    }

    /**
     * Accept the string and parse it to determine if it is valid closed brackets string
     *
     * @param s String
     * @return bool
     */
    private boolean solution(String s) {
        // Take existing Stack structure from utils
        Stack<Character> stack = new Stack<>();
        // Walk through every character
        for (char c:s.toCharArray()) {
            // Take current character counterpart from the predefined map
            Character marker = markers.get(c);
            // If Stack is empty or current character not having opening character defined
            if (stack.empty() || !stack.peek().equals(marker))
                // Then add to the stack
                stack.push(c);
            // If current character is actually had an opening bracket
            else if (stack.peek().equals(marker))
                // Close the opening and move next
                stack.pop();
            else
                // For any else situation for this coding task and it's format
                // do premature return as non-matched brackets string
                return false;
        }
        // If stack is empty then brackets condition is satisfied
        return stack.empty();
    }

}
