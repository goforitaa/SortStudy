public class bubbleSort{
    private static boolean flag;


    public static int[] bubbleSort(int[] arr){
        boolean flag =false;
        for (int i = 0; i <arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag=false){
                break;
            }

        }
        return  arr;

    }


   public static  void main(String[] args){
       bubbleSort sort = new bubbleSort();
       int arr[] = {22,3,6,54,86,21,35,1,65,4};
       int arr1[] = sort.bubbleSort(arr);
       for (int i = 0; i <arr1.length ; i++) {
           System.out.print(arr1[i]+" ");
       }
      // System.out.println();

   }


































}
