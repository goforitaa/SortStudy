import java.util.Scanner;

public class Demo23举重{
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            int count =0;
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 0; i <=arr.length; i++) {
                for (int j = i+1; j <arr.length; j++) {
                   /* if(i==j){
                        continue;
                    }*/
                    int max = Math.max(arr[i],arr[j]);
                    int min = Math.min(arr[i],arr[j]);
                    if(min>=0.9*max){
                        count++;
                    }
                }
                System.out.println(count);

            }

        }

}