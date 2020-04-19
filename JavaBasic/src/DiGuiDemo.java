/**
 * Created by fang on 2020/4/19.
 */
public class DiGuiDemo {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static int sum(int i) {
        if(i==1){
            return 1;
        }
        return sum(i-1)+i;
    }
}
