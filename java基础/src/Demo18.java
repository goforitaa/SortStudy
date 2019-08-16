import java.util.Scanner;

public class Demo18 {

    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        int T= s.nextInt();
        int a[] = new int[T];
        for (int i = 0; i <a.length;i++){
            a[i] = s.nextInt();

        }
        int n = 99;

        int[] money = {100, 50, 20, 10, 5, 2, 1};
          for(int j = 0;j< a.length;j++){
              int sum = 0;
              for (int i = 0; i < money.length; i++){
                  sum += a[j]/money[i];
                  a[j] %=money[i];
              }
              System.out.println(sum);
          }
    }


//        Scanner  s = new Scanner(System.in);
//        int T = s.nextInt();
//        int a[] = new int[T];
//        int N100;
//        int N10;
//        int N5;
//        int N2;
//        int N1;
//        for (int i = 0; i <a.length;i++){
//          a[i] = s.nextInt();
//        }
//        for (int i = 1; i <a.length ; i++) {
//              if(a[i]%100==0){  //能被100除
//                   N100 = a[i]/100;
//              }else {
//                     int Y100 = a[i]%100;
//                     N100 = a[i]/100;
////                     if(Y100%50==0){
//                        N50 = Y100/50;
//                      }else{
//                        int  Y50 =Y100%50;
//                         N50 = Y100/50;
//
//                           if(Y50%20==0){
//                               N20 = Y50/20;
//                           }else {
//                               int Y20 = Y50%20;
//                               N20 = Y50/20;
//                               if(Y20%10==0){
//                                   N10  = Y20/10;
//                               }else {
//                                   int Y10 = Y20%10;
//                                   N10 = Y20/10;
//                                   if(Y10%5==0){
//                                       N5 = Y10/5;
//
//                                   }else {
//                                       int Y5 = Y10%5;
//                                       N5 = Y10/5;
//                                       if()
//                                   }
//                               }
//                           }
//
//
//                    }
//
//
//              }
//        }
}
