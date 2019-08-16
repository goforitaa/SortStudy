
//快排时间复杂度为O(NlogN)
public class QuikSort1{
    private int[] array;
    private int length;
    public QuikSort1(int arr[]){
        this.length = arr.length;
        this.array = arr;
    }
    public void quickSort(int arr[],int l,int r){
        if(l>r){
            return;
        }
        // p为基准
       int p =  Partion(arr,l,r);
       quickSort(arr,l,p-1);
       quickSort(arr,p+1,r);

    }
    // arr[l+1..j] < arr[p]  arr[j+1 ...i) >arr[p]
    private int Partion(int arr[],int l,int r){
        //选择第一个元素为基准
        int   v = arr[l];//
        int j = l;
        // i为当前遍历的节点,遍历整个数组，将数组分为两个部分
        for (int i = l+1; i<=r;i++){
              if(arr[i]<v){
                  swap(j+1,i);
                  j++;
              }
        }
        swap(l,j);
        return j;
    }
    private void swap(int i, int j){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j]  = temp;
    }

    public void display(){
        for (int a:array){
            System.out.print( a + " ");
        }
        System.out.println( );
    }

    public static void main(String[] args){
        int array[] = {99,78,26,17,82,36,9,81,22,100,30,20,85};
        QuikSort1 qs = new QuikSort1(array);
        System.out.println("排序前 .........");
        qs.display();
        qs.quickSort(array,0,array.length-1);
        System.out.println("排序后 .........");
        qs.display();
    }

}
