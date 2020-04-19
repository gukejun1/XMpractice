/**
 * Created by fang on 2020/4/19.
 */

public class Dog extends Canidea{
    void shout() {
        System.out.println("狗叫");
    }
}
class Wolf extends Canidea{
    @Override
    void shout() {
        System.out.println("狐狸叫");
    }
}
abstract class Canidea{
    abstract void shout();
}

interface A{
    void show();
}
interface B{
    void show();
}

class C implements A,B{

    @Override//重写
    public void show() {

    }
}
