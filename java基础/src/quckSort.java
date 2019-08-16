public class quckSort {


    public static void sort(int[] a) {
        if (a.length > 0) {
            sort(a, 0, a.length - 1);
        }
    }


//    public  static void sort(int a[],int low,int height){
//        int p = a[low];//选取划分元
//        int i=low,j=height;
//        if(i>j){
//            return;
//        }
//        while(i<j){
//            while (a[j]>p && i<j){
//                  j--;
//            }
//
//            while (a[i]<p && i<j){
//                i++;
//            }
//            int t=a[i];//交换大小值
//            a[i] =a[j];
//            a[j]=t;
//
//        }
//        if(i==j){
//            p = a[i];
//            a[i] =a[low];
//            a[low]=p;
//
//        }
//        sort(a, low, i - 1);//对左边
//        sort(a, i + 1, height);
//
//    }
    public static void sort(int a[],int low,int height){
        int i=low;int j= height;

        if(i>j){
            return;
        }
        int k = a[i];
        while (i <= j) {
            while (i < j && a[j] > k) { //从右向左比较，比基准大，继续向左走
                System.out.println("while 1.......");

                  j--;
               }
            while(i < j && a[i]<= k) {//从左往右比较,比基准小，则一直向右走
                System.out.println("while 2.......");
                i++;
              }
             //交换
             if(i<=j && a[i]>k &&a[j]<k ) {
                 int swap = a[i];
                 a[i] = a[j];
                 a[j] = swap;
                 System.out.println("11111111111");
             }
      }
        //交换K
        k = a[i];
        a[i] = a[low];
        System.out.println(".................");
        a[low] = k;

        //对左边进行排序,递归算法
        sort(a, low, i - 1);//对左边
        sort(a, i + 1, height);
        return;
    }
    public void printf(int[] arr){


    }

    public static void main(String[] args){

     int arr[]=  {2,1,6,4};
     quckSort q = new quckSort();
     q.sort(arr);
     for (int a:arr){
         System.out.println(a);
     }



    }

}
