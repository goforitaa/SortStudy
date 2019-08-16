public class InsertSort {


    public static void insertsort(int array[]) {
        int length = array.length;

        for (int i = 1; i < length; i++) {   //外层循环控制的是待排序的序列
            int temp = array[i];
            int j = i;
            // 依次从后向前进行比较，如果前面的元素比他大，则前面的元素向后移动，直到比它小在替换
            for (;j > 0 && array[j - 1] > temp; j--) { //
                array[j] = array[j - 1];
            }

            array[j] = temp;
        }
    }
    public static void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
   public static  void main(String[] args){
        int arr[] ={5, 8,4, 9, 3, 7, 6, 1};

       insertsort(arr);
       print(arr);
   }

}
