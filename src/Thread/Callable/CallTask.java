package Thread.Callable;

import java.util.concurrent.Callable;

public class CallTask implements Callable<Integer> {
    int[] num;
    public CallTask(int[] num) {
        this.num = num;
    }
    int sum=0;

    @Override
    public Integer call() throws Exception {
        for (int j : num) {
            sum += j;
        }
        return sum;
    }
}
