import java.util.HashMap;
import java.util.Scanner;

public class Demo14 {
       /* static int a; //静态变量在初始化的时候，就赋值了，仅初始化一次
        int b;   //实例变量默认初始化为0；
        static int c;

        public int aMethod() {
            a++;
            return a;
        }

        public int bMethod() {
            b++;
            return b;
        }

        public static int cMethod() {
            c++;
            return c;
        }*/

        public static void main(String args[]) {
            /*Scanner  s = new Scanner(System.in);
            //int n = s.nextInt();
            //
            // int k = s.nextInt();
            // y>k < n
            System.out.println(2%3 + " " + 2%4 + " " + 2%5+ " " + 3%4 + 3%5+ " " + 4%5 + " "+5%3);*/

            String A = "hello";
            String B = "java";
            StringBuilder s = new StringBuilder();
            char j =  A.charAt(0);

            System.out.println(j);
            s.append(Character.toUpperCase(j));

            s.append(A,1,A.length());
            s.append(" ");
            char i = B.charAt(0);
            s.append(Character.toUpperCase(i));

            s.append(B,1,B.length());

            System.out.println(s.toString());



















            //String str=null;
            //str.concat("abc");
            //str.concat("123");
            "abc".concat("123");

            //System.out.println(str);
           /* Demo14 test1 = new Demo14();
            test1.aMethod();
            System.out.println(test1.aMethod());
            Demo14 test2 = new Demo14();
            test2.bMethod();
            System.out.println(test2.bMethod());
            Demo14 test3 = new Demo14();
            test3.cMethod();
            System.out.println(test3.cMethod());*/
        }
    }
