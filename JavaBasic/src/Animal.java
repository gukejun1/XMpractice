/**
 * Created by fang on 2020/4/19.
 */
public class Animal {
    private String name;
    private int age;

    public Animal(String name,int age){
        this.name = name;
        setAge(age);
    }

    // public Animal(){
    //
    // }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public void setAge(int age) {
        if(age>=0&&age<=100){
            this.age = age;
        }else{
            System.out.println("您输入的年龄有误，默认18岁");
            this.age = 18;
        }
    }
    public void info(){
        System.out.println("我叫："+this.getName()+"，今年："+getAge()+"岁");
    }
}