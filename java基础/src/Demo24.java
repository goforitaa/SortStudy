import java.util.Arrays;
import java.util.Scanner;
public class Demo24 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for(int i = n - 1; i > 0; i--){
            // 找到最后一个小于等于 arr[i] * 0.9
            int index = find(arr, i, arr[i] * 0.9);
            if(index <0){
                index = 0;
            }
            if(arr[index] < arr[i] * 0.9){
                index++;
            }
            if(i - index > 0){
                sum += (i - index);
            }
        }
        System.out.println(sum);
    }
    private static int find(int[] b, int rr, double fen){
        int l = 0;
        int r = rr;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(b[mid] > fen){
                r = mid - 1;
            }else if(b[mid] < fen){
                l = mid + 1;
            }else{
                while(mid <= rr && b[mid] == fen){
                    mid++;
                }
                return mid - 1;
            }
        }
        l--;
        return l;
    }
}
