

public class Outer1 {

    private String name="外部类额";
    private static  int age = 21;
    static class Inner{

        private  String name;
        public void fun(){
            System.out.println(name);
            System.out.println(age);

        }

    }
    /*@Test
    public void test1(){
        Outer1.Inner inner = new Outer1.Inner();
        inner.fun();

    }*/
    public static void main(String[] args){

    }


}
