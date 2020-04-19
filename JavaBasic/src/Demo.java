/**
 * Created by fang on 2020/4/19.
 */
public interface Demo {
    public static final int NUM = 3;
    public abstract void show1();
    public abstract void show2();
}
class ImplDemo1 implements Demo{
    public void show1() {
        System.out.println("haha1");
    }
    public void show2(){
        System.out.println("haha2");
    }
}
class interfaceDemo{
    public static void main(String[] args) {
        ImplDemo1 di = new ImplDemo1();
        di.show1();
        di.show2();
    }
}

interface Inner{
    public void show11();
    public void show12();
    public void show13();
    public void show14();
}
class InnerImpl implements Inner{//必须全部重写接口中的抽象方法
    @Override
    public void show11() {
    }
    @Override
    public void show12() {
    }
    @Override
    public void show13() {
    }
    @Override
    public void show14() {
    }
}
class InnerImpl1 extends InnerImpl{
    public void show11(){
        System.out.println("11");
    }
}
class InnerImpl33 extends InnerImpl{
    public void show13(){
        System.out.println("33");
    }
}