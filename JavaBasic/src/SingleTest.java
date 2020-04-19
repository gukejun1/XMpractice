/**
 * Created by fang on 2020/4/19.
 */
public class SingleTest {
    public static void main(String[] args) {
        SuperMan sp = SuperMan.getInstance();
        SuperMan sp2 = SuperMan.getInstance();
        sp.fly();
        sp2.setName("晓明");
    }
}
class SuperMan{
    private String name;
    private static SuperMan man = new SuperMan("克拉克");
    private SuperMan (String name) {
        this.name = name;
    }
    public static SuperMan getInstance(){
        return man;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static SuperMan getMan() {
        return man;
    }
    public void fly(){
        System.out.println(this.name+"++++fly");
    }
}