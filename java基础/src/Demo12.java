/*
import java.util.Scanner;

import static java.lang.Math.max;
//多重背包
public class Demo12 {

    int dp[];
   public  void ZeroOne_Pack(int cost,int weight,int n)//吧01背包封装成函数
    {
        for(int i=n; i>=cost; i--)
            dp[i] = max(dp[i],dp[i-cost] + weight);
    }

    public void Complete_Pack(int cost,int weight,int n)//把完全背包封装成函数
    {
        for(int i=cost; i<=n; i++)
            dp[i] = max(dp[i

    */
/**
     *
     * @param c   每件物品的花费
     * @param w    每件物品的重量
     * @param num  每件物品的个数
     * @param n     商品个数
     * @param m
     * @return
     *//*

    int Multi_Pack(int c[],int w[],int num[],int n,int m)//多重背包
    {
              dp = new int[m];
        for(int i=1; i<=n; i++)//遍历每种物品
        {
            if(num[i]*c[i] > m)
                Complete_Pack(c[i],w[i],m);
                //如果全装进去已经超了重量，相当于这个物品就是无限的
                //因为是取不光的。那么就用完全背包去套
            else
            {
                int k = 1;
                //取得光的话，去遍历每种取法
                //这里用到是二进制思想，降低了复杂度
                //为什么呢，因为他取的1,2,4,8...与余数个该物品，打包成一个大型的该物品
                //这样足够凑出了从0-k个该物品取法
                //把复杂度从k变成了logk
                //如k=11，则有1,2,4,4，足够凑出0-11个该物品的取法
                while(k < num[i])
                {
                    ZeroOne_Pack(k*c[i],k*w[i],m);
                    num[i] -= k;
                    k <<= 1;
                }
                ZeroOne_Pack(num[i]*c[i],num[i]*w[i],m);
            }
        }
        return dp[m];
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
        for (int i = 0; i <n; i++){
            weight[i] = s.nextInt();
            value[i]=s.nextInt();
            num[i] = s.nextInt();

        }

    }
}
*/
