import java.util.ArrayList;
import java.util.Scanner;

public class Demo17 {

    public static   int function2(int num)//经典解法
    {
        int count=0;
        int j = 0;
        while(num!=0)
        {
            num=num&(num-1);
           // System.out.println(num);
            count++;

        }
        return count;

    }
    public static void main(String[] args) {
       int j =  function2(320);
       System.out.println(j+" j=");
      // int arr[] = new int[j+1];
        ArrayList list = new ArrayList(j+1);
         list.add(j);
        String i = Integer.toBinaryString(161);
        System.out.println(i.toString());
        char[] b = i.toCharArray();
        for (int k = 0; k <b.length ; k++) {
            if(Integer.parseInt(String.valueOf(b[k]))==1){
                list.add(k+1);

            }
        }
        for (int k = 0; k <list.size() ; k++) {
            System.out.println(list.get(k));
        }
    }
}