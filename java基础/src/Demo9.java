import java.util.Scanner;

import static java.lang.Math.max;


/***
 *   题目描述，背包问题， n表示物品的总数，V表示体积的总重量
 *   要求在在装入物品的情况下，总价值达到最大
 *   输入  第一行 输入物品个数n,总体积 v
 *    后面i+1行 ，每行3个数，表示第i个物品，体积，价值
 *    要求，总价值达到最大
 *
 *    输入样例  3  10
 *
 *
 */
public class Demo9 {
    public static int knapsack(int[] weight, int[] value, int maxweight){

        int n = weight.length;
        //最大价值数组
        int[][] maxvalue = new int[n+1][maxweight + 1];

        //重量和物品为0时，价值为0，初始化
        for (int i = 0; i < maxweight + 1; i++) {
            maxvalue[0][i] = 0;
        }
        for (int i = 0; i < n + 1; i++) {
            maxvalue[i][0] = 0;

        }

        //i：只拿前i件物品（这里的i因为取了0，所以对应到weight和value里面都是i-1号位置）
        //j：假设能取的总重量为j
        //n是物品件数
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= maxweight; j++) {
                //如果第i个物品放不进去
                if (weight[i-1]>j){
                      maxvalue[i][j] = maxvalue[i-1][j];
                }else{
                    //否则可以放进去，选择放，或者不放
                    {
                        maxvalue[i][j] = max((maxvalue[i - 1][j - weight[i - 1]] + value[i - 1]), maxvalue[i - 1][j]);
                    }

                }
            }
        }
         print(maxvalue);

        return maxvalue[n][maxweight];
    }
       //打印矩阵
       public static void print(int a[][]){
           for (int i = 0; i < a.length;i++){
              for (int j = 0; j <a[i].length ; j++) {
                  System.out.print(a[i][j] + "　");
              }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        //输入个数个最大重量n,v;
        Scanner  s = new Scanner(System.in);
        System.out.println("请输入物品个数和重量总数");
        int n  = s.nextInt();
        int v = s.nextInt();
        int weight[] = new int[n];
        int value[] = new int[n];
        System.out.println("请输入各自的重量个价值");
        for (int i = 0; i <n; i++) {
             weight[i] = s.nextInt();
             value[i]=s.nextInt();
        }
        System.out.println(knapsack(weight, value, v));
    }

}
