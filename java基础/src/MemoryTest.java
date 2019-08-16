import java.util.Random;

public class MemoryTest {

      int x, y,read_x,read_y;
    public void randomSleep(){
      try {
          Thread.sleep(new Random().nextInt(30));
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
    }
      Thread CreateThread1(){
        return  new Thread(new Runnable() {
            @Override
            public void run() {
                randomSleep();
                x=1;
              read_y=y;

            }
        });

      }

    Thread CreateThread2(){
        return  new Thread(new Runnable() {
            @Override
            public void run() {
                randomSleep();
                y=1;
                read_x=x;

            }
        });

    }

    public static void main(String[] args) {
        while (true) {
            MemoryTest test = new MemoryTest();
            Thread test1 = test.CreateThread1();
            Thread test2 = test.CreateThread2();
            test1.start();
            test2.start();

            try {
                test1.join();
                test2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("(%d, %d)", test.read_x, test.read_y));
            while (test.read_x==0 && test.read_y==0){
                new RuntimeException("What?");
            }

        }
    }
}
