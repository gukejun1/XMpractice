/**
 * Created by fang on 2020/4/19.
 */
public class Rect2 extends Rect {
    double height;
    Rect2(double lon, double widt,double height) {
        super(lon, widt);
        this.height = height;
    }
    public double volum(){
        return area()*height;
    }
}
