/**
 * ==和equals的区别
 */
public class Demo4{

    public static void main(String[] args){
        int a = 4;
        int b= 4;
        //System.out.println(a==b);
        String st1 = "hello";
        String  st2 = "hello";
        String  st3 = new String("hello");
        /*Integer integer = 2;

        Integer integer1 = 2;
        System.out.println(integer==integer1);*/
        System.out.println( st1==st2);
        System.out.println(st1==st3);
       // st1.equals(st2);



    }

}
