package examples.b_cyclic_rotation;

import examples.AbstractCodingTask;
import examples.ICodingTask;

public class CyclicRotation extends AbstractCodingTask implements ICodingTask {

    private int runs = 0;

    /**
     *  Will run 3 times for representation of result-sets
     */
    @Override
    public void run() {
        run(3);
    }

    /**
     * Overload for run with times allowed to be passed as a parameter
     * @param times
     */
    public void run(int times) {
        for (int i=1; i <= times; i++) {
            int[] input = new int[]{1,2,7,9,10};
            int[] res = solution(input, i);
            runs++;
            this.printResultForInput("Rotate numbers iteration: " + runs, input, res);
        }
    }

    /**
     * Solution goes as following we have mapping like:
     *       [1, 2, 7, 9, 10]
     *        0  1  2  3  4
     *
     * Solution can be look like as following
     *       [9, 10, 1, 2, 7]
     *       Where following replacements made on the basis of:
     *         1) sum of previous index + cycles need to happen
     *         2) resulting sum is checked against array boundary and shifted
     *            circularly if it overhits one
     *
     *         -> 9 at 0       3 + 2 = 5 % 5 = 0
     *         -> 10 at 1      4 + 2 = 6 % 5 = 1
     *         -> 1 at 2       0 + 2 = 2 % 5 = 2
     *         -> 2 at 3       1 + 2 = 3 % 5 = 3
     *         -> 7 at 4       2 + 2 = 4 % 5 = 4
     *
     * @param input
     * @param times
     * @return
     */
    private int[] solution(int[] input, int times) {
        int[] out = new int[input.length];
        for (int i=0; i<input.length; i++) {
            out[(i + times) % input.length] = input[i];
        }
        return  out;
    }

}
