/**
 * Created by fang on 2020/4/19.
 */
public class OverLoadming {
    public static void main(String[] args) {
        show();
        show(1,2.3f,'b');
        show(1.2f,2,'c');
        show(1,4.0);
        show(1,2,3);
        show(1,false,2);
    }
    public static void show(int a,float b ,char c){
        System.out.println("int float char---"+a+"|"+b+"|"+c);
    }
    // public static int show(int a,float b,char c){}//没有重载，会出错
    public static void show(float a,int b,char c){
        System.out.println("float int char---"+a+"|"+b+"|"+c);
    }//重载了
    // public static void show(int a,float b,char c){}//没有重载
    public static void show(int a,double b){
        System.out.println("int double---"+a+"|"+b);
    }//重载了
    public static void show(){
        System.out.println(" 没有");
    }//重载了
    public static void show(int a,int b,int c){
        System.out.println("int int int---"+a+"|"+b+"|"+c);
    }
    public static void show (int a,boolean b,int c){
        System.out.println("int boolean int---"+a+"|"+b+"|"+c);
    }
}
