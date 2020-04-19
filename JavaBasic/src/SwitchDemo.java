import java.util.Scanner;

/**
 * Created by fang on 2020/4/19.
 */
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("今天健身第几天哇？");
        int day = input.nextInt();

        //进行判断
        switch (day){
            case 1:
                System.out.println("今天健身第一天！哈哈");
                break;
            case 2:
                System.out.println("今天健身第二天！哈哈");
                break;
            case 3:
                System.out.println("今天健身第三天！哈哈");
                break;
            case 4:
                System.out.println("今天健身第四天！哈哈");
                break;
            case 7:
                System.out.println("今天有没有训练？1：训练了；2：没训练");
                int result = input.nextInt();
                if(result == 1){
                    System.out.println("今天训练了呀！加鸡腿！");
                }else if(result==2){
                    System.out.println("今天居然没训练！快吃老孙一棒！");
                }
        }
    }
}
