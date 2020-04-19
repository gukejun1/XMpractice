/**
 * Created by fang on 2020/4/19.
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Person per1 = new Person(12);
        Person per2 = new Person(13);
        System.out.println();
    }
}
class Person extends Object{
    private int age;
    Person(int age){
        this.age = age;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Person)){
            throw new ClassCastException("类型不对，请改正");
        }
        Person p = (Person) obj;

        return this.age == p.age;

    }
    public String toString(){
        return "Person[age:"+age+"]";
    }
}
class Dog1{

}
