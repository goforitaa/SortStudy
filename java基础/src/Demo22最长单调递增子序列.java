import java.util.Scanner;

public class Demo22最长单调递增子序列 {
     //动态规划
     /*public static int lengthOfLIS(int[] nums) {
         int max = 1;
       int length[] = new int [nums.length];
         for (int i = 0; i <nums.length;i++){  //子序列的终点
               length[i] = 1;   //默认只有自己一个
             for (int j = 0; j <i;j++) {  //从头开始向终点找序列
                 if(nums[i]> nums[j]){
                     length[i]=Math.max(length[i],length[j]+1);
                 }
             }
             max = Math.max(max,length[i]);
         }
         return max;
     }*/
    //二分查
    public static int lengthOfLIS(int[] nums){
        int[] top = new int[nums.length];
        int piles = 0;
        for (int i = 0; i < nums.length; i++) {
            int poker = nums[i];
            //***** 搜索左侧边界的二分查找 *****//*
            int left = 0, right = piles;
            while (left < right){
                int mid = (left + right) / 2;
                if (top[mid] > poker) {
                    right = mid;
                } else if (top[mid] < poker) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            if (left == piles) piles++;
            top[left] = poker;
        }
        return piles;
    }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            int []arr = new int [N];
            for (int i = 0; i <N ; i++) {
                arr[i] = s.nextInt();
            }
            System.out.print(lengthOfLIS(arr));
        }
    }



