/**
 * Created by fang on 2020/4/19.
 */
public class Single {
    //1，私有构造方法
    private Single(){}
    //2，创建本类对象
    private static final Single s = new Single();
    //3，定义方法，返回这个对象
    public static Single getInstance(){
        return s;
    }
}

