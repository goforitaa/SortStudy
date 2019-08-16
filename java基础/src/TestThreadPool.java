import java.io.Serializable;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool{

    private static  int produceTaskSleepTime =2000;
    public static  void main(String[] args){
        ThreadPoolExecutor  threadpool = new ThreadPoolExecutor(1,
        1,
        0,
        TimeUnit.SECONDS,
        new ArrayBlockingQueue(3),
                new ThreadPoolExecutor.DiscardOldestPolicy());
        int i = 1;
        while (true){
            try{
                Thread.sleep(produceTaskSleepTime);
                String task = "task@" +i;
                System.out.println("put" + task);
                //用execute方法启动一个线程
                threadpool.execute(new ThreadPoolTask(task));
                if (i==15){
                    break;
                }
                i++;

            }catch (Exception e){
                e.printStackTrace();
            }
        }



    }


}
//线程类
class ThreadPoolTask implements Runnable,Serializable{
    private static final long serialVersionUid = 0;
    private static int consumTaskSleepTime =2000;
    private String threadPoolTaskData;
    ThreadPoolTask(String tasks){
        this.threadPoolTaskData = tasks;

    }
//每个任务执行过程，现在是什么都没做，除了print 和sleep
    //@Override
    public void run() {
        System.out.println("start.." + threadPoolTaskData);
        try{
            Thread.sleep(consumTaskSleepTime);
        }catch (Exception e){
            e.printStackTrace();
        }
        threadPoolTaskData = null;

    }
}