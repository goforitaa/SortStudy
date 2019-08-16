import java.util.Scanner;

public class Demo27 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//测试用例
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <2 ; j++) {
                arr[i][j] =in.nextInt();
            }
        }

        int  shijian = in.nextInt();
        int classtime[][] = new int[1][2];
        for (int i = 0; i <classtime.length; i++){
            for (int j = 0; j <classtime[i].length;j++) {
                classtime[i][j] =in.nextInt();
            }
        }
         int  min[][] = new int[1][2];
        for (int i = 0; i<arr.length ; i++) {
            for (int j = 0; j <arr[i].length;j++) {
             if(arr[i][0]>classtime[i][0]){
                 break;
             }else{

                 if(arr[i][1]<classtime[i][1]){
                        //if( classtime[i][0]<arr[i+1][0]){
                         min[0][0] = classtime[i][0]-arr[i][0];
                         min[0][1] = classtime[i][1]-arr[i][1];
                        //}else {
                           // min[0][0] = classtime[i][0] - arr[i][0];
                            //min[0][1] = classtime[i][1] - arr[i][1];
                          //}

                 }else {

                     //if( classtime[i][0]<arr[i+1][0]){
                         min[0][0] = classtime[i][0]-1-arr[i][0];
                         min[0][1] = classtime[i][1]+60-arr[i][1];
                     //}else {
                         //min[0][0] = classtime[i][0]-1-arr[i][0];
                         //min[0][1] = classtime[i][1]+60-arr[i][1];

                     }

                 }

             }
            }
        System.out.print(min[0][0] + " " +min[0][1]);
        }

        



}
