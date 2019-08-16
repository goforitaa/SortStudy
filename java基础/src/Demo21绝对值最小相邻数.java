import java.util.Scanner;
//绝对值最小的相邻数
public class Demo21绝对值最小相邻数{
  //1 3 4 7 2 6 5 12 32
    public static long[] find(int n, long[] nums) {
        if(nums == null || nums.length == 0)
            return new long[]{};
        long[] res = new long[2];
        long min = Long.MAX_VALUE;
        for(int i =1;i <n;i++){ //从前往后遍历，后面只要小于，就赋值，如果从后往前遍历，<=赋值
            long temp = Math.abs(nums[i]-nums[i-1]);
            if(temp <min) {
                min = temp;
                res[0] = nums[i-1];
                res[1] = nums[i];
            }
        }
        return res;
    }

   /* private static int binarySearch(int a[],int target){
        int left = 0;
        int right =a.length-1;
        while (left<=right){
            int mid =  left + (right-left)/2;
            if(target<a[mid]){
                right = mid-1;
            }else if(target >a[mid]){
                left = mid+1;
            }else{
                return  mid;
            }
        }
        return -1;
    }*/

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long[] a = new long[N];
        //int b[] = new int [N-1];
        for (int i = 0; i <N; i++) {
            a[i] = s.nextLong();
        }
         long[] b  = find(N,a);
        System.out.print(b[0]  + " " + b[1]);

        /*for (int i = 0; i <N-1; i++) {
            if(i+1!=N){
                b[i] = Math.abs(a[i + 1] - a[i]);

            }else{
                break;
            }
        }
        // 1 3 4 7 2 6 5 12 32
        for (int i = 0; i <b.length; i++) {
            System.out.print(b[i]);
        }
        int min= Integer.MAX_VALUE;
        for (int i = 0; i <b.length; i++) {
            if(i+1<b.length) {
                if (b[i + 1] < b[i]) {
                    min = b[i + 1];
                }
            }

        }
        int index = binarySearch(b,min);
        System.out.print("index ="+index);
        System.out.print(a[index] +" "+ a[index+1] );*/

    }
}
