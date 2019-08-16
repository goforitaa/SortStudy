public class MegeSOrt {
    public static void main(String[] args){
        int arr[]={2,4,7,5,8,1,3,6};
        mergeSort(arr,0,arr.length-1);
       // System.out.println("排序后...");
        printarr(arr);



    }


     //划分

    public static void mergeSort(int a[],int left,int right){
        if(left<right) {
            int mid = (left + right) / 2;

            mergeSort(a, left, mid);  //将原来的数组划分为两个数组
            mergeSort(a,mid+1,right);
            merge(a,left,mid,right); //将划分排序好的两个数组合并成原来的数组

        }
    }
    //归并
    public static void merge(int[] arr, int L, int mid, int R) {
        int[] temp = new int[R - L + 1];
       // System.out.println(" 长度： "+temp.length);
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        // 比较左右两部分的元素，哪个小，把那个元素填入temp中
        while(p1 <= mid && p2 <= R) {
            temp[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 上面的循环退出后，把剩余的元素依次填入到temp中
        // 以下两个while只有一个会执行
        while(p1 <= mid) {
            temp[i++] = arr[p1++];
        }
        while(p2 <= R) {
            temp[i++] = arr[p2++];
        }
        // 把最终的排序的结果复制给原数组
        for(i = 0; i < temp.length; i++) {
            arr[L + i] = temp[i];
        }
    }
    public static void printarr(int a[]){
        for (int i = 0; i <a.length;i++) {
            System.out.print(a[i]+" ");

        }
    }
}
