class RunnableDemo extends  ThreadRun implements  Runnable{
      Thread t2=null;

    public void Remo(RunnableDemo r1){
        Thread t1 = new Thread(r1,"第一线程");
        System.out.println("正在运行的是" + t1);
        t2=new Thread(r1,"第二线程");
        System.out.println("创建第二线程");
        System.out.println("第一线程开始休眠");
        t2.start();
        try {
               t1.sleep(400);
        }catch (InterruptedException e){
            System.out.println("第一下线程错误");
        }
        System.out.println("第一线程恢复运行");


    }
    @Override
    public void run() {
        try{
            for (int i = 0; i <800 ; i+=100) {
                System.out.println("第二线程的休眠时间：" +i);
                t2.sleep(i);
            }
        }catch (InterruptedException e){
            System.out.println("第二线程错误");
        }
        System.out.println("第二线程结束");

    }
}
class ThreadRun{
    public String print(){
        return "我是RunnableDemo的父类";
    }

}
