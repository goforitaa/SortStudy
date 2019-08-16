
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.List;

public class Demo15 {
       public static List<String> validateAddresses(List<String> addresses) {
             Pattern pattern;
            Pattern ptipv4;

               // ipv6
               pattern = Pattern.compile("^((([0-9A-Fa-f]{1,4}:){7}[0-9A-Fa-f]{1,4})|(([0-9A-Fa-f]{1,4}:){1,7}:)|(([0-9A-Fa-f]{1,4}:){6}:[0-9A-Fa-f]{1,4})|(([0-9A-Fa-f]{1,4}:){5}(:[0-9A-Fa-f]{1,4}){1,2})|(([0-9A-Fa-f]{1,4}:){4}(:[0-9A-Fa-f]{1,4}){1,3})|(([0-9A-Fa-f]{1,4}:){3}(:[0-9A-Fa-f]{1,4}){1,4})|(([0-9A-Fa-f]{1,4}:){2}(:[0-9A-Fa-f]{1,4}){1,5})|([0-9A-Fa-f]{1,4}:(:[0-9A-Fa-f]{1,4}){1,6})|(:(:[0-9A-Fa-f]{1,4}){1,7})|(([0-9A-Fa-f]{1,4}:){6}(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3})|(([0-9A-Fa-f]{1,4}:){5}:(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3})|(([0-9A-Fa-f]{1,4}:){4}(:[0-9A-Fa-f]{1,4}){0,1}:(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3})|(([0-9A-Fa-f]{1,4}:){3}(:[0-9A-Fa-f]{1,4}){0,2}:(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3})|(([0-9A-Fa-f]{1,4}:){2}(:[0-9A-Fa-f]{1,4}){0,3}:(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3})|([0-9A-Fa-f]{1,4}:(:[0-9A-Fa-f]{1,4}){0,4}:(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3})|(:(:[0-9A-Fa-f]{1,4}){0,5}:(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}))$");
               // ipv4
               ptipv4 = Pattern.compile("^(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}$");

           List<String> str=new ArrayList<String>(addresses.size());
           for(int i=0;i<addresses.size();i++){
               if(pattern.matcher(addresses.get(i)).matches()){
                   str.add(i,"IPv6");
                   //str[i]= "IPv6";
               }else if(ptipv4.matcher(addresses.get(i)).matches() ){
                   str.add(i,"IPv4");
               }else{
                   str.add(i,"Neither");
               }
           }
           for (int i = 0; i <str.size() ; i++) {
               System.out.println(str.get(i));

           }

           return  str;
       }
}




/*
    private static String process(String num1, String num2) {
        char a[] = num1.toCharArray();
        int b[] = new int[6];  //个数数组；
        int money = Integer.parseInt(num2);
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(String.valueOf(a[i]));
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);

        }


    }
        //Please write your code here


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String strValueSequences = sc.nextLine();
        String strChargeNum = sc.nextLine();

        String sum = process(strValueSequences, strChargeNum);
        System.out.println(sum);

    }
}*/
