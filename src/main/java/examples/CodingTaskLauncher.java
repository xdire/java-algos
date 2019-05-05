package examples;

import examples.a_split_numbers.SplitNumbers;
import examples.b_cyclic_rotation.CyclicRotation;

import java.util.ArrayList;
import java.util.List;

public class CodingTaskLauncher {

    private static List<ICodingTask> lessons = new ArrayList<ICodingTask>();

    public static void main(String[] args) {
        /*
         *  Configuration stage
         */
        CodingTaskLauncher.addTask(new SplitNumbers());
        CodingTaskLauncher.addTask(new CyclicRotation());
        /*
         *  Runner stage
         */
        CodingTaskLauncher.run();
    }

    public static void run() {
        for (ICodingTask l: CodingTaskLauncher.lessons) {
            l.run();
        }
    }

    public static void addTask(ICodingTask l) {
        CodingTaskLauncher.lessons.add(l);
    }

}
