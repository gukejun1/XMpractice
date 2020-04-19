import java.util.Scanner;

/**
 * Created by fang on 2020/4/18.
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的名字：");
        String name = sc.next();
        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入您的身高：");
        int height = sc.nextInt();
        System.out.println("请输入您的性别：");
        String sex = sc.next();
        System.out.println("姓名为："+name+"，年龄为："+age+"，身高为："+height+"，性别为："+sex);
    }
}
