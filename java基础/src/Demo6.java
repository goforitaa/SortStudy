import com.sun.java_cup.internal.runtime.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo6 {

    public static  ArrayList<String> Permutation(String str){
        ArrayList<String > resultlist  = new ArrayList<String>();

        if(str.length()==0 || str==null){
            return (ArrayList)resultlist;
        }

        char[]  chars = str.toCharArray();
        findsublist(chars,resultlist,0);

        Collections.sort(resultlist);
        return (ArrayList)resultlist;
    }
     public static  void findsublist(char[] a, List<String> list,int i){
        //递归终止条件
       if(i==a.length-1){
            if(!list.contains(new String(a)))
              list.add(new String(a));
              return ;

       }else{
           //递归
             for (int j = i; j <a.length;j++){
                  swap(a,i,j);
                  findsublist(a,list,i+1);
                  swap(a,i,j);

             }
         }
    }
    public static  void swap(char[]  a,int i,int j){
        if(i!=j){
            char temp = a[i];
            a[i] = a[j];
            a[j]=temp;

        }

    }
        public static void main(String[] args){
            java.util.Scanner s = new java.util.Scanner(System.in);
            String S = s.nextLine();
            Demo6  sd = new Demo6();
            ArrayList<String> arrayList  = new ArrayList<>();
            arrayList = sd.Permutation(S);
            Iterator  it =  arrayList.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }



        }


}
