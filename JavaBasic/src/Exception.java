/**
 * Created by fang on 2020/4/21.
 */
public class Exception {
    public static void main(String[] args) {

    }
}
class Person1{
    private String name;
    private int age;
    Person1(String name,int age){
        if(age<=0&& age>=200){
            throw new NoAgeException();
        }
        this.name = name;
        this.age = age;
    }
}
class NoAgeException extends RuntimeException{
    NoAgeException(){
        super();
    }

}
