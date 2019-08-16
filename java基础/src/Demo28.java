
public class Demo28{

     private int[] array;
     private int length;
     public Demo28(int arr[]){
         this.length = arr.length;
         this.array = arr;
     }
     public void display(){
         for (int a:array){
             System.out.print( a + " ");
         }
         System.out.println( );
     }

  public int partion(int left,int right,int pivot){
         int leftpoint = left - 1;
         int rightpoint = right +1;
         while (true){

             while (leftpoint<right && array[++leftpoint]<pivot);
             while (rightpoint >left &&  array[--rightpoint]>pivot);
             if(leftpoint >=rightpoint){
                 break;
             }else {
                 swap(leftpoint,rightpoint);
             }
         }
         return leftpoint;
  }
    public void swap(int left,int right){
         int temp = array[left];
         array[left] = array[right];
         array[right] =temp;


    }
    public static void main(String[] args) {
       int array[] = {99,78,26,17,82,36,9,81,22,100,30,20,85};
      Demo28 qs= new Demo28(array);
      System.out.println("划分前的数据为 ....");
      qs.display();
      int bond = qs.partion(0,array.length-1,50);
        System.out.println("划分后的数据为：");
        qs.display();
        System.out.println("划分的分界点为：" + array[bond] + "，分界点的坐标为：" + bond);


    }

}
