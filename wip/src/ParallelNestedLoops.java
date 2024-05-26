import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ParallelNestedLoops {

    public static void main(String[] args) {
        // Create a ForkJoinPool with the number of available processors
        ForkJoinPool pool = new ForkJoinPool();

        // Execute the task
        pool.invoke(new LoopTask(0, 10000));

        // Shutdown the pool
        pool.shutdown();
    }

    static class LoopTask extends RecursiveAction {
        private static final int THRESHOLD = 1000; // Threshold for splitting tasks
        private int start;
        private int end;

        public LoopTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            if (end - start <= THRESHOLD) {
                // Perform the task sequentially
                for (int i = start; i < end; i++) {
                    for (int j = 0; j < 10000; j++) {
                        for (int k = 0; k < 10000; k++) {
                            // Perform your task here
                            System.out.println(i + j + k);
                        }
                    }
                }
            } else {
                // Split the task into smaller subtasks
                int mid = (start + end) / 2;
                LoopTask task1 = new LoopTask(start, mid);
                LoopTask task2 = new LoopTask(mid, end);

                // Fork the subtasks
                invokeAll(task1, task2);
            }
        }
    }
}
