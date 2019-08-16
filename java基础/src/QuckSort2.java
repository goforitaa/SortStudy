import java.util.Random;
import java.util.Scanner;
public class QuckSort2 {

    private int[] array;
    private int length;
    public QuckSort2(int arr[]){
        this.length = arr.length;
        this.array = arr;
    }
    public void quickSort1(int arr[],int l,int r){
        if(l>r){
            return;
        }
        int p =  Partion1(arr,l,r);
        quickSort1(arr,l,p-1);
        quickSort1(arr,p+1,r);
    }

    //双路快速排序
    private int Partion1(int arr[],int l,int r){
        //选择给定区间的任意索引为基准
        swap(l, (int) (Math.random()%(r -l + 1)+l));
        //选择第一个元素为基准
        int   v = arr[l];//
        int i = l+1;
        int j = r;
        while (true){
            while (  i <=r &&arr[i]<=v) i++;
            while (  j>=l+1&& arr[j]>=v ) j--;
            if(i >j) break;
            swap(i,j);
            i++;
            j--;
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
      /*  Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Random  random= new Random();
        int array[] = new int[n];
        for(int i = 0;i < n;i++){
            array[i]  = (int)Math.random()*100;
        }*/
        int array[] = {99,78,26,17,82,36,9,81,22,100,30,20,85};
        QuckSort2 qs = new QuckSort2(array);
        System.out.println("排序前 .........");
        qs.display();
        //long time1 = System.currentTimeMillis();
        qs.quickSort1(array,0,array.length-1);
        System.out.println("排序后 .........");
        //long time2 = System.currentTimeMillis();
        //System.out.println(" 排序时间"+(time2-time1));
        qs.display();
    }
}
