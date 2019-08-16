import java.util.Scanner;

public class Demo20{
    private static int isBeauty(int x){
        if(x>1000 && x<9000){
         while (true){
            int i,j,k,l;
            /*i = x/1000;
            j = (x%1000)/100;
            k = (x-(i*1000+j*100))/10;
            l = x -(i*1000+j*100+k*10);*/
            i = x%10;
            j=(x/10)%10;
            k = (x/100)%10;
            l=(x/1000)%10;
            if(i!=j && i!=k && i!=l && j!=k && j!=l && k!=l){
               // System.out.print(x);
                return x;
            }else{
                return 0;
             }

         }
       }else{
            return  -1;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
         int N = s.nextInt();
         int x = 0;
         x = N+1;

         while (true) {
             int  index = isBeauty(x);
             if (index == 0) {
                 x++;
                 //System.out.print(index);
             }else {
                 System.out.print(index);
                 break;
             }
         }




    }
}
