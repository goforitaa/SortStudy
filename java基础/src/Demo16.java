import java.util.Scanner;

public class Demo16 {

    public static  void main(String[] args){

        Scanner s = new Scanner(System.in);
        int M=11;
        int[] money = {6,5,4,3,2,1};
        int sum = 0;
        for (int i = 0; i <=money[0]; i++) {
            for (int j = 0; j <=money[1]; j++) {
                for (int k = 0; k <=money[2]; k++) {
                    for (int l = 0; l <= money[3]; l++) {
                        for (int m = 0; m <= money[4]; m++) {
                            for (int n = 0; n <= money[5]; n++) {
                                if(i*1+j*5+k*10+l*20+m*50+n*100==M){
                                    sum+=i+j+k+l+m+n;
                                    System.out.println(i+" "+j+" "+k+" "+l+" "+m+" "+n);
                                }
                            }
                        }
                    }
                }
            }

        }
        System.out.println(sum);

    }
}
