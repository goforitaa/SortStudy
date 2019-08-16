import java.util.Scanner;

public class Demo25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }


           /* Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String a = scanner.nextLine();
                String b = scanner.nextLine();
                char[] aArr = a.toCharArray();
                char[] bArr = b.toCharArray();
                StringBuilder sb = new StringBuilder();
                *//*if(a.contains(".")){
                    if()

                }*//*
                int i = aArr.length - 1;

                int j = bArr.length - 1;
                int count = 0;
                while (i >= 0 || j >= 0) {
                    int temp  = 0;
                    if (i < 0) {
                        temp = bArr[j--] + count - '0';
                    }
                    if (j < 0) {
                        temp = aArr[i--] + count - '0';
                    }
                    if (i >= 0 && j >= 0) {
                        temp = aArr[i--] + bArr[j--] + count - 2 * '0';
                    }
                    if (temp > 9) {
                        count = 1;
                        temp -= 10;
                    } else {
                        count = 0;
                    }
                    sb.append(temp);
                    if (i<0&&j<0&&count==1) {
                        sb.append(count);
                    }
                }

                System.out.println(sb.reverse().toString());
            }
            scanner.close();*/
    }

}
