public class Outer {

    private static String outstr = "外部类";
    static  class Inner{
    private String innerstr="内部类";
    public void print(){
    System.out.println(innerstr);
    }

    }
    public void fun(){
        //在外部类内部创建内部类  一般对象创建方法
        Inner in = new Inner();
        in.print();


    }

    public static void main(String[] args) {
        //内部类可以访问外部类的私有属性
        //内部类可以方便的访问彼此的私有域（包括私有方法，私有属性）
        //Outer out = new Outer();
        //out.fun();
       //在外部类外部创建非静态内部类
        //外部类.内部类 内部对象 = new 外部对象().new 内部对象()
       // Outer.Inner inner = new Outer().new Inner();
       // System.out.println("外部类调用内部类");
       //inner.print();
       /*//在外部类外部创建静态内部类
        Outer.Inner inner = new Outer.Inner();
        inner.print();*/
       //String a = "hello";
       //String b = "hello";
       //int a1 = 1;
       //Integer b1 = new Integer(1);

         int a= 1;
         Integer b = 1;
         System.out.println(a==b);
      /* System.out
               .println(a==b);
       System.out.println(a1==b1);*/
      String  s1 = new String("he");
      String  s2 = new String("he");
      System.out.println(s1==s2);

    }

}
