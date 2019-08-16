import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Map1 {


    /*Map 键值  存储采用哈希表
       键不允许重复 值可以重复

    */

    public static void main(String[] args) {

        function_4();
    }
     //值可以重复，键不可以重复，重复后后面的值将覆盖之前的值
    public  static  void function(){
        Map<String,Integer> m = new HashMap<String,Integer>();
        m.put("a",1);
        m.put("b",1);
        m.put("c",1);
        m.put(null,null);

        m.put("c",2);
        System.out.println(m.size());
        System.out.println(m);
    }
      //put返回值一般为空
    public  static  void function_1(){
        Map<Integer,Integer> m = new HashMap<Integer, Integer>();
        Integer JI =  m.put(1,1);
        m.put(2,1);
        m.put(3,1);
        m.put(4,2);
        System.out.println(m);
        System.out.println(JI);  //put返回值一般为空
        Integer i = m.get(6);   //get一般键不存在时，返回空值
        System.out.println(i);

    }

    public  static  void function_2(){
        Map<String,String> m = new HashMap<String, String>();
        ConcurrentHashMap  map = new ConcurrentHashMap();

        m.put("邓超","孙俪");
        m.put("凯晨","范冰冰");
        m.put("超丽影","冯绍峰");
        System.out.println(m);
         //put返回值一般为空
        String i = m.get("超丽影");   //get一般键不存在时，返回空值
       // System.out.println(i);


        // 遍历map集合
        // 1 获取Set集合，存储的是map集合的所有的键
        // 2 遍历Set集合，每一个元素为键
        // 3 通过键取值 m.get(key);
        Set<String> set = m.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
              String F =         it.next();
         String value =      m.get(F);
         System.out.println(value);
        }

    }

    /**
     *
     *  1 Entry集合，为map集合的内部类，存放的是、map集合的映射关系集合
     *  2 set集合中的每一个元素entry为 一个映射关系
     *  3 迭代每一个Entry集合。
     *  4  通过每一个entry中的getKey和getValue 获取键和值
     *
     */
    public  static  void function_3() {
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1, "孙俪");
        m.put(2, "范冰冰");
        m.put(3, "冯绍峰");
        Set<Map.Entry<Integer, String>> set = m.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "...................." + value);
        }
        System.out.println("-----------------------------------");
        //增强for  注意 map不能用增强for 但是SET可以，间接
        for (Map.Entry<Integer, String> entry : m.entrySet()) {

            System.out.println(entry.getKey() + "....." + entry.getValue());

        }


    }

    /**
     *  1 LinkedHashMap 特点，按顺序存，负荷插入顺序
     *  2 hashMap 线程不安全
     *  3 hashTable 线程安全 运行速度慢，1.2以后已经被HashMap取代
     *  4 hashTable的子类 Property仍然活跃在历史舞台
     *
     *
     *
     *
     *
     *
     *
     *
     */
    public  static  void function_4() {
        Map<String, Person> m = new HashMap<String, Person>();
        m.put("212", new Person(21,"张三"));
        m.put("213", new Person(21,"张三"));
        m.put("214", new Person(21,"张三"));
        Set<Map.Entry<String, Person>> set = m.entrySet();
        Iterator<Map.Entry<String, Person>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Person> entry = it.next();
            String key = entry.getKey();
            Person value = entry.getValue();
            System.out.println(key + "...................." + value);
        }
        System.out.println("-----------------------------------");
        //增强for  注意 map不能用增强for 但是SET可以，间接
        for (Map.Entry<String, Person> entry : m.entrySet()) {

            System.out.println(entry.getKey() + "....." + entry.getValue());

        }


    }
    public void add(int...e){

    }
}
