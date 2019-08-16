import java.nio.Buffer;

/**
 * 空格替换
 * ：请实现一个函数，把字符串中的每个空格替换成"%20"。例如输入“We are happy.”
 *
 * 思路：将原字符串转换成数组，然后计算空格的个数，重新开辟一个新数组，计算替换后的数组长度为新数组的长度。
 * 然后新旧数组开始赋值  从后向前赋值
 */
public class Demo2 {
            public String replace(StringBuffer stri){
            String str = stri.toString();
            //将字符串转换为字符数组
            char array[] = str.toCharArray();
            int i = 0;
            int length=0;
            while (i<array.length){
                 if(array[i++]== ' ' ){  //从前向后判断是否有空格
                     length++;

                 }
             }
            int newlength = str.length()+length*2; //扩展后每个空格替换成3 个空格，相当于原来空格+2,总的空格添加总数为
                // 空格个数*2
            char newarray[] = new char[newlength];
            // 开辟新数组后，从后往前为数组赋值
            i  = array.length-1;  //指针指向数组的最后一个元素
            int j = newarray.length-1;
            while(i>=0){
                if(array[i]!=' '){
                    newarray[j--]=array[i--]; //赋值完之后再减;
                }else{
                    newarray[j--]='0'; //赋值之后再相减
                    newarray[j--]='2';
                    newarray[j--]='%'; //此时减完之后的指针，
                    i--;

                }
             }
                  return new String(newarray);
            }

    public static void main(String[] args){
        String str = "hello World";
        StringBuffer buffer = new StringBuffer(str);
        System.out.println(buffer.toString());
        Demo2 d = new Demo2();
       String bu =  d.replace(buffer);
       System.out.println(bu.toString());




    }



}
