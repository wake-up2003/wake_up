public class student implements  Comparable {

     private  String name;
     private int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }




    @Override
    public int compareTo(Object o) {
        return this.age;
    }
}
