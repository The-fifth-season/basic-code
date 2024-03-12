package Thread.Callable;

public class SumTask implements Runnable{
    int[] num ;
    int sum=0;
    public SumTask(int[] num){
        this.num = num;
    }

    public void run() {
            for (int j : num) {
                sum += j;
                //System.out.println(Thread.currentThread().getName());
            }
    }
    public int getResult(){
        return this.sum;
    }
}
