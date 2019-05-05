package examples.a_split_numbers;

import examples.AbstractCodingTask;
import examples.ICodingTask;

/**
 *  Coding task as well named as Equilibrium
 */
public class SplitNumbers extends AbstractCodingTask implements ICodingTask {

    @Override
    public void run() {
        int[] input = new int[]{3,5,7,6,8};
        int res = solution(input);
        this.printResultForInput("Split numbers 1", input, res);
    }

    /**
     * Solution here is to introduce a marker which will flow through the
     * array values with counting left part and right part on the base of
     * pre-calculated values
     *
     * @param A int[]
     * @return int
     */
    private int solution(int[] A) {
        if (A.length == 0)
            return 0;
        // Take initial left as a first value parameter
        int leftSum = A[0];
        // Initialize right with zero sum value
        int rightSum = 0;
        // Pre-calculate right part with counting from start to end on input array
        for (int x : A)
            rightSum += x;
        // As we starting with exactly first entry then it can be safely subtracted from the total
        rightSum -= leftSum;
        // We'll calculate our first absolute minimum at starting position
        int diff = Math.abs(leftSum - rightSum);
        int index = 1;
        // Moving from left to right starting at current first element until the one before last element
        // to preserve requirement on left / right parts to be presented
        for (int x = index; x < A.length - 1; x++) {
            // Add to the left sum
            leftSum += A[x];
            // Subtract from the right sum
            rightSum -= A[x];
            // Calculate new diff to provide it to new comparison
            int testDiff = Math.abs(leftSum - rightSum);
            // Check if this new diff is new best balanced and store it in index
            if (testDiff < diff) {
                index = x;
            }
        }
        return index;
    }

}
