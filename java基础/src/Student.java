public class Student extends Person{
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    private int age;
      private String name;

        public Student(){
            super(21,"张三");
        }
   public static void main(String[] args){
            Person p = new Person();
            Student s = new Student();
            System.out.println(s.name + s.age);

   }


}
