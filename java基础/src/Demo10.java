import java.util.*;
import java.util.Comparator;
import java.util.Scanner;
public class Demo10 {
   /*public static  int findScore(int a[],int b){
       if(b>=0 && b<a.length) {
           for (int i = 0; i < a.length; i++) {
               if (i == b) {
                   int score = a[i];
                   return score;
               }
           }
          // System.out.println("查找到该分数...");
       }
       return -1;
   }
    public static  int muner(int a[],int b){
       int count = 0;
        for (int i = 0; i <a.length ; i++){
            if(a[i]<=b){
                count++;
            }

        }
     //   System.out.println("查找到改数的个数");
        return count;

    }
     public static void main(String[] args){

         Scanner s = new Scanner(System.in);
        // System.out.println("输入人数");
         //班级人数
         int n = s.nextInt();
         //成绩数组
         int score[] = new int[n];
        // System.out.println("输入成绩");
         for (int i = 0; i <score.length; i++) {
             score[i] = s.nextInt();
             //System.out.println();
         }
         //访问次数
         int num = s.nextInt();
         int  cishu[] = new int[num];

         for (int i = 0; i <num; i++) {
               cishu[i] = s.nextInt();
               System.out.println();
         }
        // int count = 0; int fenshu = 0;

         for (int i = 0; i <cishu.length;i++){

          int value =   findScore(score,i);
         // System.out.println("查找到成绩 "+value);
          int count = muner(score, value);
         // System.out.println(count);
          double p = (double) (count-1)/n*100;
          System.out.printf("%.6f",p);

         }









*/
    private static int binarySearchMax(int[][] work, int skills) {
        int low = 0;
        int high = work.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (work[mid][0] > skills) {
                high = mid - 1;
            } else {

                if (mid == work.length - 1 || work[mid + 1][0] > skills) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        // 第一个元素都被它 大。
        return -1;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = 0;
        int M = 0;
        N = s.nextInt();  //工作数量
        M = s.nextInt(); //小伙伴的数量
        int DIPI[][] = new int[N][2];
        //二维数组来存储工作难度和报酬
        for (int i = 0; i < N; i++) {
            DIPI[i][0] = s.nextInt();//工作难度
            DIPI[i][1] = s.nextInt();
        }

            //对工作难度进行排序
            Arrays.sort(DIPI, new Comparator<int[]>() { // 按照第一行排序 [@Override]
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
            // 更新每个工作的报酬为当前难度所能获取的最大报酬
            for (int i = 0; i < DIPI.length - 1; i++) {
                if (DIPI[i][1] > DIPI[i + 1][1]) {
                    DIPI[i + 1][1] = DIPI[i][1];
                }
            }
            //Ai 表示工作能力
            int Ai[] =new int[M];

            for (int j = 0; j < M; j++) {
                Ai[j] = s.nextInt();
                int index = binarySearchMax(DIPI, Ai[j]);
                if(index==-1)
                    System.out.println(0);
                else {
                    System.out.println(DIPI[index][1]);
                }

            }


        }

    }



