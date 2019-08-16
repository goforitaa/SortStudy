public class Demo7 {

      public int find(){
          int a = 0;

          try{
              a = 10/0;
          }catch(Exception e){
              System.out.println("catch is begin");
              return 1;
          }finally{
              System.out.println("finally is begin");
               return 2;
          }

      }




    public static void  main(String[] args){
               Demo7  demo = new Demo7();
             int a =   demo.find();
             System.out.println(a);



    }
}
