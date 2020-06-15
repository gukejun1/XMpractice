import java.lang.Exception;

/**
 * Created by fang on 2020/4/21.
 */
public class Demo3 {
    static void show3() throws Exception{
        try {
            int m=0;
            m=1/0;
            //进行代码异常检测
            // throw new Exception();
        }catch(Exception e){
            //对异常进行处理
        }
        finally{
            //最后一定执行的代码
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        show3();
    }
}
