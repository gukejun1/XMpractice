/**
 * Created by fang on 2020/4/19.
 */
public class Rectangle {
    public static void main(String[] args) {
        Rect2 r2 =  new Rect2(1,2,3);
        double a = r2.area();//底面积
        double v = r2.volum();//体积
        System.out.println("底面积是："+a);
        System.out.println("体积是："+v);
    }
}
