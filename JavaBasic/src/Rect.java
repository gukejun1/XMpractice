/**
 * Created by fang on 2020/4/19.
 */
//父类
public class Rect {
    double lon,widt;
    Rect(double lon,double widt){
        this.lon =lon;
        this.widt = widt;
    }
    public double area(){
        return lon*widt;//求面积
    }
}
