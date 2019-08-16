public class Demo5 {


   /* public int StrToInt(String str) {
        if(str==null || str="" || str.equals('+') || str.equals('-'))
        {
            return 0;
        }
        int flag = 0;
        char  shuzi[] = str.toArray();
        for(int i = 0;i<shuzi.length;i++){
            if(shuzi[0]=='+' &&i==0 )
            {
                continue;
            }
            if(shuzi[0]=='-' &&i==0){
                continue;
            }

        }

    }*/


   /*ppublic int StrToInt(String str) {
        if(str==null || str=="" || str.equals("+") || str.equals("-"))
        {
            return 0;
        }
        int flag = 0;
        long sum=0;
        char  shuzi[] = str.toCharArray();
        for(int i = 0;i<shuzi.length;i++){
            if(shuzi[0]=='+' &&i==0 )
            {
                continue;
            }
            if(shuzi[0]=='-' &&i==0){
                flag=1;
                continue;
            }
            if(!judge(shuzi[i]))
            {
                return 0;
            }
            sum = sum*10+shuzi[i]-'0';

        }
        if(flag==1){
            sum=sum * (-1);
            if(sum<Integer.MIN_VALUE)
            {
                return 0;
            }
            return (int)sum;
        }
        if(sum > Integer.MAX_VALUE)
        {
            return 0;
        }
        return (int)sum;
    }
    private boolean judge(char ch){
        int number = ch-'0';
        if(number>=0 && number <=9)
        {
            return true;

        }
        return false;
    }*/

//}

}
