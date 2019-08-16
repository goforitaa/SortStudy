import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo19 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  n = s.nextInt();
        double p =0;
        double sum =1;
        for (int i = n;i >0;i--){
            if (i-1==0){
                break;
            }
            //System.out.println((double)(i-1)/i);
            sum *=(double)(i-1)/i;

        }
        System.out.printf("p=%.2f",1-sum-0.005);





    }
}
