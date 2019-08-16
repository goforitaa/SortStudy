/**
 * 方法内部类 不能使用访问修饰符修饰 (public protected private)均不循允许
 *
 */
public class Outer2 {
    /*public void fun2(){

    }
*/

    public void test1( int temp){
        //内部类的修饰符省略
          class  b{
             public void fun(){
              //方法内部类如果想调用方法的形参的话，形参声明必须是final

                 System.out.println(temp);
            }

        }
        //方法的内部类在方法里面创建
        new b().fun();



    }


    //匿名内部类
   /* public void test(final int b) {
        final int a = 10;
        //匿名内部类  匿名内部类和方法内部类完全一致
        // 匿名内部类必须继承一个抽象类或者实现一个接口
        //匿名内部类 没有类名，因此没有构造方法
        new Thread(){
            public void run() {
                System.out.println(a);
                System.out.println(b);
            };
        }.start();
    }*/


    public static void main(String[] args)  {
        new Outer2().test1(10);

    }
}
