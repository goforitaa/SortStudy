import java.util.Scanner;

import static java.lang.Math.max;
//0 1 背包
public class Demo11 {

    public static int knapsack(int[] weight, int[] value, int maxweight){
        int n = weight.length;
        //最大价值数组
        int[] maxvalue = new int[10];

        //重量和物品为0时，价值为0，初始化
        for (int i = 1; i <=maxweight; i++) {
            maxvalue[i] = 0;
        }

        //i：只拿前i件物品（这里的i因为取了0，所以对应到weight和value里面都是i-1号位置）
        //j：假设能取的总重量为j
        //n是物品件数
        for (int i = 1; i<= n ; i++) {
            for (int j = maxweight;j >=weight[i-1]; j--) {
                //如果第i个物品放不进去
                //if (weight[i-1]>j){
                  //  maxvalue[j] = maxvalue[j];
               // }else{
                    //否则可以放进去，选择放，或者不放
                   // {
                        maxvalue[j] = max((maxvalue[j - weight[i - 1]] + value[i - 1]), maxvalue[j]);
                    //}

                //}
            }
        }
       // print(maxvalue);

        return maxvalue[maxweight];
    }
    //打印矩阵
    public static void print(int a[]){
        for (int i = 0; i < a.length;i++){

                System.out.print(a[i] + "　");
            //System.out.println();

        }
    }
    public static void main(String[] args) {
        //输入个数个最大重量n,v;
        Scanner s = new Scanner(System.in);
        System.out.println("请输入物品个数和重量总数");
        int n  = s.nextInt();
        int v = s.nextInt();
        int weight[] = new int[n];
        int value[] = new int[n];
        int num[] =new int[n];
        System.out.println("请输入各自的重量个价值");
        for (int i = 0; i <n; i++) {
            weight[i] = s.nextInt();
            value[i]=s.nextInt();
            num[i] = s.nextInt();

        }
        System.out.println(knapsack(weight, value, v));
        //滚动数组

//        int d[] = new int[10];
//
//        d[0] = 1;
//
//        d[1] = 1;
//
//        for (int i = 2; i< 10; i++) {
//            d[i%3 ] = d[(i - 1)%3] + d[(i - 2)%3];
//        }
//        for (int i = 0; i <d.length ; i++) {
//            System.out.println("d["+i+"]="+d[i]);
//
//        }


//        int i=0;int j=0;int d[][] = new int[10][10];
//        for(i=2;i<10;i++) {
//            for (j = 0; j <10; j++){
//                d[i%2][j] = (d[(i-1)%2][j])+9-i + d[(i-2)%2][j];
//                System.out.print(d[i][j]+" ");
//              }
//              System.out.println();
//        }


    }


    }

