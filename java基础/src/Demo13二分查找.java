import java.util.Collections;

public class Demo13二分查找 {

    /**
     * LeetCode 二分查找
     * 题目描述
     * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
     * @param a
     */


     //第一种情况
    //右边值可以取到
     private static int binarySearch(int a[],int target){
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
    }
    //右边值取不到

    private static int binarySearch1(int a[],int left,int right,int target){
        int i= left;
        int j =right;  //当右边取不到情况下
        while (i<j){
            int mid = i + (j-i)/2;
            if(target<=a[mid]){  //取不到可以==
                j = mid;  //右边取不到    //右边取不到j
            }else{
                return  i+1;
            }
        }
        return -1;
    }
    //如果有重复元素
    private static int binarySearch2(int a[],int target){
        int i= 0;
        int j =a.length-1;  //当右边取不到情况下
        while (i<j){
            int mid = i + (j-i)/2;
            if(target<a[mid]){
                j = mid;  //右边取不到
            }else{
                  if(target==a[mid]){
                     j=mid;
                  }else{
                      i= mid+1;
                  }
            }
        }
        if (a[i] == target)
            return i;
        else
            return -1;
       }

    public static void main(String[] args){
         int array[] = new int[]{-1,2,3,3,5,9,12,};
         System.out.println(binarySearch2(array,3));
         //一般的查找都是左闭右开
       // Collections.binarySearch()
      }

}
