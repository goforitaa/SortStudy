/**
 * 类变量  实例变量   局部变量
 */
public class Demo1 {



    private static int x = 100;// 2
    public static void main(String args[]) {// 3
        Demo1 hsl = new Demo1();// 4
        System.out.println("之前hs1="+hsl);
        hsl.x++;// 5
        System.out.println("之後hs1="+hsl);
        Demo1  hs3 = hsl;
        Demo1.x++;
        //System.out.println("x5=" + x);
        Demo1 hs2 = new Demo1();// 6
       // hs2.x++;// 7
       /* System.out.println(" x7=" + x);
        hsl = new Demo1();// 8
        hsl.x++;// 9
        System.out.println(" x9=" + x);
        Demo1.x--;// 10
        System.out.println(" x=" + x);// 11*/



        System.out.println("hs2="+hs2);
        System.out.println("hs3="+hs3);

    }
}
